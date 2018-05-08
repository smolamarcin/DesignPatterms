package com.smola.strategy;

public class Squak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
