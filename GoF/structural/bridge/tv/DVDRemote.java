package com.patterns.GoF.structural.bridge.tv;

public class DVDRemote extends Remote {
    private boolean play = true;

    public DVDRemote(DVDDevice dvdDevice) {
        super(dvdDevice);
    }

    @Override
    public void buttonNinePressed() {
        play = !play;
        System.out.println("DVD is Playing: " + play);
    }
}
