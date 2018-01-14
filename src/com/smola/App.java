package com.smola;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car1 = ClassicFactory.getCar("Ford");
        Car car2 = ClassicFactory.getCar("Fiat");
        System.out.println(car1.getName());
        System.out.println(car2.getName());
    }
}
