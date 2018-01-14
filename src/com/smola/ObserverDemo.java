package com.smola;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 28");
        subject.setState(28);
    }
}
