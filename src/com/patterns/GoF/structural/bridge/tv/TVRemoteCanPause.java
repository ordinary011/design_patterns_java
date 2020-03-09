package com.patterns.GoF.structural.bridge.tv;

public class TVRemoteCanPause extends Remote{

    public TVRemoteCanPause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");
    }
}
