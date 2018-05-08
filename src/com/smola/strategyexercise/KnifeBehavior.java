package com.smola.strategyexercise;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting by knife!");
    }
}
