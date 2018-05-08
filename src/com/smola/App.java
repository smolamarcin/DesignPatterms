package com.smola;

import com.smola.strategyexercise.Knight;

public class App {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        printLine();
    }

    private static void printLine() {
        System.out.println("--------------------");
    }
}
