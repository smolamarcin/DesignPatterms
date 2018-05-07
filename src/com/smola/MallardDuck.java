package com.smola;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}
