package com.patterns.GoF.structural.bridge.tv;

public class TVRemoteCanMute extends Remote{

    public TVRemoteCanMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }
}
