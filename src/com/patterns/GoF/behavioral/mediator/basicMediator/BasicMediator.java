package com.patterns.GoF.behavioral.mediator.basicMediator;

import java.util.ArrayList;
import java.util.List;

public class BasicMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.add(new ConcreteCollegue(mediator));
        mediator.add(new ConcreteCollegue(mediator));
        ConcreteCollegue concreteCollegue = new ConcreteCollegue(mediator);
        mediator.add(concreteCollegue);
        concreteCollegue.changeStatus();
    }
}

interface Mediator{
    void requestAll(Colleague colleague);
}

class ConcreteMediator implements Mediator{
    List<Colleague> colleagues = new ArrayList<>();
    void add(Colleague colleague){
        colleagues.add(colleague);
    }

    @Override
    public void requestAll(Colleague colleague) {
        colleague.setTrue();
        for(Colleague coll: colleagues){
            if(coll != colleague){
                coll.setFalse();
            }
        }
    }
}

interface Colleague{
    void setFalse();
    void setTrue();
    void changeStatus();
}

class ConcreteCollegue implements Colleague{
    boolean status;
    Mediator mediator;

    public ConcreteCollegue(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setFalse() {
        status = false;
        System.out.println("my status is false");
    }

    @Override
    public void setTrue() {
        status = true;
        System.out.println("my status is true");
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);
    }
}