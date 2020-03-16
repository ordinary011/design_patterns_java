package com.patterns.GoF.behavioral.strategy;

public class BasicStrategy {
    public static void main(String[] args) {

    }
}

interface Strategy {
    double getprice(double price);
}

class FullPrice implements Strategy {

    @Override
    public double getprice(double price) {
        return price;
    }
}

class HalfPrice implements Strategy {

    @Override
    public double getprice(double price) {
        return price * 0.5;
    }
}