package com.neelesh.design.patterns.structural.bridge.components.remote;

public interface Remote {
    void on();
    void off();
    void setChannel(int channelNumber);
}
