package com.patterns.GoF.behavioral.mediator;

public class AtcMain {
    public static void main(String[] args) {
        IAtc atcMediator = new Atc();

        Runway runway = new Runway(atcMediator);
        Flight flight1 = new Flight(atcMediator);
        Flight flight2 = new Flight(atcMediator);

        atcMediator.registerFlight(flight1);
        atcMediator.registerRunway(runway);

        flight1.readyToLand();
        runway.land();
        flight1.land();

        flight2.land();

        flight1.parked();

        flight2.land();
        flight2.parked();
    }
}
