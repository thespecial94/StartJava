public class Wolf {

    private String gender;
    private String nickname;
    private String color;
    private int weight;
    private int age;

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void go() {
        System.out.println("идёт");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бегает");
    }

    public void howl() {
        System.out.println("воет");
    }
    
    public void hunt() {
        System.out.println("охотиться");
    }
}