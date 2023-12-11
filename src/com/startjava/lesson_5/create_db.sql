create table jaegers (
	id serial primary key,
	model_name text,
	mark integer,
	height real,
	weight numeric,
	status text,
	origin text,
	launch date,
	kaiju_kill integer);

\ir init_db.sql;
\ir queries.sql;
