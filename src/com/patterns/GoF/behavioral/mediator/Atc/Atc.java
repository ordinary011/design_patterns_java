package com.patterns.GoF.behavioral.mediator.Atc;

public class Atc implements IAtc {
    private Runway runway;
    private Flight flight;
    public boolean available;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailuabilityStatus(boolean status) {
        this.available = status;
    }

    @Override
    public Boolean isAvailable() {
        return available;
    }
}
