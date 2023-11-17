package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private int speed;
    private int strength;
    private int kaijuKilled;
    private String origin;
    private String name;
    private String status;

    public Jaeger() {}

    public Jaeger(int speed, int strength, int kaijuKilled,
            String origin, String name, String status) {
        this.name = name;
        this.status = status;
        this.origin = origin;
        this.speed = speed;
        this.strength = strength;
        this.kaijuKilled = kaijuKilled;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void powerMoves(String name) {
        if (name == "Coyote Tango") {
            System.out.println("Сверхритическая атака!");
        } else {
            System.out.println("Удар по голове Слагернаутом!");
        }
    }

    public void bodyLanguage(String name) {
        if (name == "Cherno Alpha") {
            System.out.println("Греко-римская борьба");
        } else {
            System.out.println("Потрясающий контрудар");
        }
    }
}