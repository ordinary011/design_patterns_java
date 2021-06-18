package com.patterns.GoF.creational.factory_method;

public class PC {
    public static void main(String[] args) {
        PCFactory factory = new PCFactory();
        Computer computer = factory.getComputer("DESKTOP", 111, 1111);
        computer.display();
    }
}

abstract class Computer {
    public int HHD;
    public int RAM;

    public Computer(int HHD, int RAM) {
        this.HHD = HHD;
        this.RAM = RAM;
    }

    abstract void display();
}

class PCFactory {
    Computer getComputer(String type, int HDD, int RAM){
        if(type.equalsIgnoreCase("DESKTOP")){
            return new Desktop(HDD, RAM);
        } else if(type.equalsIgnoreCase("SERVER")){
            return new Server(HDD, RAM);
        }
        System.out.println("sorry but you've specified an unexisting type of PC");
        return null;
    }
}

class Desktop extends Computer {
    public Desktop(int HDD, int RAM) {
        super(HDD, RAM);
    }

    @Override
    public void display() {
        System.out.println("hello from desktop pc=)) " + "HHD: " + HHD);
    }
}

class Server extends Computer {

    public Server(int HDD, int RAM) {
        super(HDD, RAM);
    }

    @Override
    void display() {
        System.out.println("hello from server=)) " + "HHD: " + HHD);
    }
}