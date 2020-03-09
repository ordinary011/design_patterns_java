package com.patterns.GoF.structural.bridge.tv;

public class DVDDevice extends EntertainmentDevice {
    public DVDDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("DVD Skips to Chapter");
        deviceState--;

    }

    @Override
    public void buttonSixPressed() {
        System.out.println("DVD Skips to Next Chapter");
        deviceState++;
    }
}
