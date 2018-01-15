package com.smola.pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
