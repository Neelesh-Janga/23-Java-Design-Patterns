package com.neelesh.design.patterns.creational.builder.builders;

import com.neelesh.design.patterns.creational.builder.components.Battery;
import com.neelesh.design.patterns.creational.builder.components.Camera;
import com.neelesh.design.patterns.creational.builder.components.Display;
import com.neelesh.design.patterns.creational.builder.components.Network;
import com.neelesh.design.patterns.creational.builder.products.Mobile;

public class MobileBuilder implements Builder {
    private Battery battery;
    private Camera camera;
    private Display display;
    private Network network;

    @Override
    public MobileBuilder buildDisplay(Display display) {
        this.display = display;
        return this;
    }

    @Override
    public MobileBuilder buildBattery(Battery battery) {
        this.battery = battery;
        return this;
    }

    @Override
    public MobileBuilder buildCamera(Camera camera) {
        this.camera = camera;
        return this;
    }

    @Override
    public MobileBuilder buildNetwork(Network network) {
        this.network = network;
        return this;
    }

    public Mobile build() {
        return new Mobile(battery, camera, display, network);
    }
}
