package com.neelesh.design.patterns.structural.bridge.components.tv;

public class SamsungTV implements TV{
    private int channel = 999;

    @Override
    public void on() {
        System.out.println("Powering ON Samsung TV");
    }

    @Override
    public void off() {
        System.out.println("Powering OFF Samsung TV");
    }

    @Override
    public void setChannel(int channelNumber) {
        this.channel = channelNumber;
        System.out.println("Channel set to " + channel);
    }
}
