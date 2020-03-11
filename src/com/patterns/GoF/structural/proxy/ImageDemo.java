package com.patterns.GoF.structural.proxy;

interface Image{
    void display();
}

class RealImage implements Image{
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load(){
        System.out.println("loading " + file);
    }

    @Override
    public void display() {
        System.out.println("displaying: " + file);
    }
}

class ProxyImage implements Image{

    String file;
    RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}


public class ImageDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("~/home/any/file");
//        image.display();
    }
}
