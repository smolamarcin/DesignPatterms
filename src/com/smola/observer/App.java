package com.smola.observer;

public class App {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.setNews("XD");
        observable.setNews("XDd");
    }
}
