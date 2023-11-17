package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setKaijuKilled(2);
        coyoteTango.setOrigin("Япония");
        coyoteTango.setName("Coyote Tango");
        coyoteTango.setStatus("Уничтожен");
        System.out.println("Характеристики " + coyoteTango.getName() + 
                ": страна = " + coyoteTango.getOrigin() + "; статус = " + coyoteTango.getStatus() +
                "; скорость = " + coyoteTango.getSpeed() + "; сила = " + coyoteTango.getStrength() +
                "; \nубито Kaiju = " + coyoteTango.getKaijuKilled());
        System.out.println("Способности " + coyoteTango.getName());
        coyoteTango.powerMoves(coyoteTango.getName());
        coyoteTango.bodyLanguage(coyoteTango.getName());

        Jaeger chernoAlpha = new Jaeger(3, 10, 6, "Россия", "Cherno Alpha", "Уничтожен");
        System.out.println("\nХарактеристики " + chernoAlpha.getName() + 
                ": страна = " + chernoAlpha.getOrigin() + "; статус = " + chernoAlpha.getStatus() +
                "; скорость = " + chernoAlpha.getSpeed() + "; сила = " + chernoAlpha.getStrength() +
                "; \nубито Kaiju = " + chernoAlpha.getKaijuKilled());
        System.out.println("Способности " + chernoAlpha.getName());
        chernoAlpha.powerMoves(chernoAlpha.getName());
        chernoAlpha.bodyLanguage(chernoAlpha.getName());
    }
}