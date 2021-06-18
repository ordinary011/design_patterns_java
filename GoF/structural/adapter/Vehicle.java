package com.patterns.GoF.structural.adapter;

public class Vehicle {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washVehicle(new Audi());
        carWash.washVehicle(new TruckWrapper(new MyTruck()));
    }
}

class TruckWrapper implements RegCar{
    Truck truck;

    public TruckWrapper(Truck truck) {
        this.truck = truck;
    }

    @Override
    public void wash() {
        truck.clean();
    }
}

interface Truck {
    void clean();
}

class MyTruck implements Truck {

    @Override
    public void clean() {
        System.out.println("washing a truck");
    }
}

interface RegCar {
    void wash();
}

class Audi implements RegCar {

    @Override
    public void wash() {
        System.out.println("washing a car");
    }

}

class CarWash {
    public void washVehicle(RegCar car){
        car.wash();
    }
}
