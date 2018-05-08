package com.smola.strategyexercise;

public class Main {
    public static void main(String[] args) {
        Character knight = new Knight(new SwordBehavior());
        knight.fight();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.fight();
    }
}
