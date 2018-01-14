package com.smola;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
