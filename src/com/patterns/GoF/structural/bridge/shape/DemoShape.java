package com.patterns.GoF.structural.bridge.shape;

interface Color {
    String fill();
}

class Blue implements Color {
    @Override
    public String fill() {
        return "Color is Blue";
    }
}

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}

class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}

public class DemoShape {
    public static void main(String[] args) {
        Shape square = new Square(new Blue());
        System.out.println(square.draw());
    }
}
