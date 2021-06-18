package com.patterns.GoF.behavioral.mediator.Atc;

public class Flight implements Command {
    private IAtc atcMediator;

    public Flight(IAtc atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if(atcMediator.isAvailable()){
            System.out.println("landed successfully");
            atcMediator.setAvailuabilityStatus(false);
        }else {
            System.out.println("waiting for runway");
        }
    }

    public void readyToLand(){
        System.out.println("landing initiated");
    }

    public void parked(){
        System.out.println("flight is parked");
        atcMediator.setAvailuabilityStatus(true);
    }
}
