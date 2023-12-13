\echo 'все данные, отсортированные по алфавиту'
select *
  from jaegers
 order by model_name;

\echo 'данные по не уничтоженным роботам'
select *
  from jaegers
 where status = 'Alive'
 order by model_name;

\echo 'данные по роботам нескольких серий: Mark-1 и Mark-4'
select *
  from jaegers
  where mark in ('1','4')
  order by model_name;

\echo 'данные по роботам, кроме Mark-1 и Mark-4, отсортированные по убыванию по столбцу mark'
select *
  from jaegers
 where mark not in ('1','4')
 order by mark desc;

\echo 'информация о самом старом роботе'
select model_name
  from jaegers
 where launch = (select min(launch) from jaegers)
 order by model_name;

\echo 'информация по роботам, которые уничтожили больше всех kaiju, отсортированные по убыванию по данному полю'
select model_name, kaiju_kill
  from jaegers
 order by kaiju_kill desc;

\echo 'информация о среднем весе роботов, округлив его до трех знаков после запятой'
select round(avg(weight), 3)
  from jaegers;

\echo 'добавить единицу уничтоженных kaiju у роботов, которые до сих пор не разрушены'
update jaegers
   set kaiju_kill = kaiju_kill + 1
 where status = 'Alive';

\echo 'удалите уничтоженных роботов, а затем отобразите оставшихся'
delete
  from jaegers
 where status = 'Destroyed';

select *
  from jaegers
 order by model_name;