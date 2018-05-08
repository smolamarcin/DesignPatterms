package com.smola.observer;

public class NewsChannel implements Channel {
    private String news;

    public void update(Object news) {
        this.news = (String) news;
        System.out.println("Breaking news!: "+news);
    }
}
