package com.smola.strategyexercise;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting by sword!");
    }
}
