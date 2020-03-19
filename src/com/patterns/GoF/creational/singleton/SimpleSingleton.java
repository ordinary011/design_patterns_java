package com.patterns.GoF.creational.singleton;

public class SimpleSingleton {
    public static void main(String[] args) {
        SingleToneExample ste = SingleToneExample.instantiate("bob");
        ste.action();
        SingleToneExample ste2 = SingleToneExample.instantiate("bill");
        ste2.action();
        System.out.println(ste.name);
        System.out.println(ste2.name);
    }
}

class SingleToneExample {
    public static SingleToneExample instance;
    String name;

    private SingleToneExample() {}

    public static SingleToneExample instantiate(String name){
        if(instance == null){
            instance = new SingleToneExample();
        }
        instance.name = name;
        return instance;
    }

    void action(){
        System.out.println("hello " + name);
    }
}