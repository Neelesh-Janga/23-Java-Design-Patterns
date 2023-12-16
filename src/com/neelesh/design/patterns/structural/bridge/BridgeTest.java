package com.neelesh.design.patterns.structural.bridge;

import com.neelesh.design.patterns.structural.bridge.components.remote.AdvanceRemote;
import com.neelesh.design.patterns.structural.bridge.components.remote.Remote;
import com.neelesh.design.patterns.structural.bridge.components.remote.SamsungRemote;
import com.neelesh.design.patterns.structural.bridge.components.remote.SonyRemote;
import com.neelesh.design.patterns.structural.bridge.components.tv.SamsungTV;
import com.neelesh.design.patterns.structural.bridge.components.tv.SonyTV;

public class BridgeTest {
    public static void main(String[] args) {
        AdvanceRemote sonyRemote = new SonyRemote(new SonyTV());
        sonyRemote.on();
        sonyRemote.setChannel(1000);
        sonyRemote.amazonPrime();
        sonyRemote.off();

        System.out.println("---------------------------------------");

        Remote samsungRemote = new SamsungRemote(new SamsungTV());
        samsungRemote.on();
        samsungRemote.setChannel(1500);
        samsungRemote.off();
    }
}
