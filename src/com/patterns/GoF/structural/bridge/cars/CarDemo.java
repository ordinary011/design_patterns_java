package com.patterns.GoF.structural.bridge.cars;

abstract class Car {
    Manufacturer manufacturer;

    public Car(Manufacturer m) {
        manufacturer = m;
    }

    abstract void showType();
    void showDetails(){
        showType();
        manufacturer.setManufacturer();
    }
}

class Sedan extends Car {
    public Sedan(Manufacturer m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}

class Hatchback extends Car {
    public Hatchback(Manufacturer m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Hatchback");
    }
}

interface Manufacturer {
    void setManufacturer();
}

class Kia implements Manufacturer {
    @Override
    public void setManufacturer() {
        System.out.println("Kia");
    }
}

class Skoda implements Manufacturer {
    @Override
    public void setManufacturer() {
        System.out.println("Skoda");
    }
}

class Mercedes implements Manufacturer {
    @Override
    public void setManufacturer() {
        System.out.println("Mercedes");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Hatchback(new Kia());
        c.showDetails();
    }
}
