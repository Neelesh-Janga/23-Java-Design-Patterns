package com.neelesh.design.patterns.structural.bridge.components.tv;

public class SonyTV implements AdvanceTV{
    private int channel = 999;

    @Override
    public void on() {
        System.out.println("Powering ON Sony TV");
    }

    @Override
    public void off() {
        System.out.println("Powering OFF Sony TV");
    }

    @Override
    public void setChannel(int channelNumber) {
        this.channel = channelNumber;
        System.out.println("Channel set to " + channel);
    }

    @Override
    public void playAmazonPrimeVideo(){
        System.out.println("Opening Amazon Prime Video, enjoy your time");
    }

    @Override
    public void playNetflix(){
        System.out.println("Opening Netflix, enjoy your time");
    }
}
