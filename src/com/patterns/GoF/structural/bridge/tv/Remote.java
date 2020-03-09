package com.patterns.GoF.structural.bridge.tv;

public abstract class Remote {

    private EntertainmentDevice theDevice;

    public Remote(EntertainmentDevice newDevice){
        theDevice = newDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();

}
