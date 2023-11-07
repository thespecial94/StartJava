public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("мужской");
        wolf.setAge(7);
        wolf.setNickname("Безжалостный");
        wolf.setWeight(30);
        wolf.setColor("черный");
        System.out.println("Характеристики волка: вес = " + wolf.getWeight() + 
                " кг.; пол = " + wolf.getGender() + "; ник = " + wolf.getNickname() + 
                "; возраст = " + wolf.getAge() + "; цвет = " + wolf.getColor());
        System.out.println("Способности волка:");
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}