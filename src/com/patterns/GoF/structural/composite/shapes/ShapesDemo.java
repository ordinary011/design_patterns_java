package com.patterns.GoF.structural.composite.shapes;

import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("I am a Square");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("I am a Circle");

    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I am a Triangle");

    }
}

class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    void addComponent(Shape component){
        components.add(component);
    }

    void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        for(Shape component: components){
            component.draw();
        }
    }
}

public class ShapesDemo {
}
