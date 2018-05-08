package com.smola.strategyexercise;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting by axe!");
    }
}
