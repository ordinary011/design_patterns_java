package com.patterns.GoF.structural.flyweight.shapes;

import java.util.HashMap;
import java.util.Map;

interface Shape {
    void draw(int x, int y);
}

class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a point");
    }
}

class Circle implements Shape {
    int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a circle with radius: " + r);
    }
}

class Square implements Shape {
    int s = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a Square with the side length of " + s);
    }
}

class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}

public class FlyWeightShape {
    public static void main(String[] args) {

    }
}
