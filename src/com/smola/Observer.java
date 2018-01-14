package com.smola;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
