package com.patterns.GoF.structural.bridge.tv;

public class TVDevice extends EntertainmentDevice{

    public TVDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("channel down");

        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("channel up");

        deviceState++;
    }
}
