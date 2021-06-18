package com.patterns.GoF.behavioral.visitor;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.action(new ConcreteVisitor());
    }
}

interface Animal {
    void action(Visitor visitor);
}

class Dog implements Animal {

    @Override
    public void action(Visitor visitor) {
        visitor.dogAction();
    }
}

class Cat implements Animal {

    @Override
    public void action(Visitor visitor) {
        visitor.catAction();
    }
}

interface Visitor {
    void dogAction();
    void catAction();
}

class ConcreteVisitor implements Visitor{

    @Override
    public void dogAction() {
        System.out.println("woof");
    }

    @Override
    public void catAction() {
        System.out.println("meow");
    }
}