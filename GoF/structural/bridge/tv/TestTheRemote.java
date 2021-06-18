package com.patterns.GoF.structural.bridge.tv;

public class TestTheRemote {
    public static void main(String[] args) {
        Remote remoteForTv = new TVRemoteCanMute(new TVDevice(1, 200));
        Remote remoteForTv2 = new TVRemoteCanPause(new TVDevice(1, 200));

        remoteForTv.buttonFivePressed();

        Remote remoteForDVD = new DVDRemote(new DVDDevice(1,14));

    }
}
