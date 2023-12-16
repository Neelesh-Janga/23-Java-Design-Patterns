package com.neelesh.design.patterns.structural.bridge.components.remote;

import com.neelesh.design.patterns.structural.bridge.components.tv.AdvanceTV;

public class SonyRemote implements AdvanceRemote{
    private AdvanceTV televison;

    public SonyRemote(AdvanceTV televison) {
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

    @Override
    public void netflix() {
        System.out.println("Pressing \"Netflix\" button on remote.");
        televison.playNetflix();
    }

    @Override
    public void amazonPrime() {
        System.out.println("Pressing \"Amazon Prime Video\" button on remote.");
        televison.playAmazonPrimeVideo();
    }
}
