package com.patterns.GoF.structural.decorator.print;

interface PrinterInterface{
    void print();
}

class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;


}


public class DemoPrinter {
    public static void main(String[] args) {

    }
}
