package com.neelesh.design.patterns.structural.bridge.components.remote;

import com.neelesh.design.patterns.structural.bridge.components.tv.TV;

public class SamsungRemote implements Remote{
    private TV televison;

    public SamsungRemote(TV televison) {
        this.televison = televison;
    }

    @Override
    public void on() {
        System.out.println("Pressing \"Power-On\" button on remote.");
        televison.on();
    }

    @Override
    public void off() {
        System.out.println("Pressing \"Power-Off\" button on remote.");
        televison.off();
    }

    @Override
    public void setChannel(int channelNumber) {
        televison.setChannel(channelNumber);
    }
}
