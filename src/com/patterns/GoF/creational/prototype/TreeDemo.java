package com.patterns.GoF.creational.prototype;

public class TreeDemo {
    public static void main(String[] args) {
        int mass = 22;
        int height = 55;
        int position = 10;
        int otherPosition = 11;

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);
    }
}

abstract class Tree {
    public int mass;
    public int height;
    public int position;

    public abstract Tree copy();

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

class PlasticTree extends Tree {
    public PlasticTree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

}

class PineTree extends Tree {
    public PineTree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}