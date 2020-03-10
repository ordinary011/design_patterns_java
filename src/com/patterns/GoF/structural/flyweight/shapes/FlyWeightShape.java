package com.patterns.GoF.structural.flyweight.shapes;

interface Shape{
    void draw(int x, int y);
}

class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a point");
    }
}

class Circle implements Shape{
    int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a circle with radius: " + r);
    }
}

class Square implements Shape{
    int s = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println(x + " " + y + " drawing a Square with the side length of " + s);
    }
}

public class FlyWeightShape {
}
