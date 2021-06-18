package com.patterns.GoF.behavioral.mediator.Atc;

public interface IAtc {
    public void registerFlight(Flight flight);
    public void registerRunway(Runway runway);
    public void setAvailuabilityStatus(boolean status);
    public Boolean isAvailable();
}
