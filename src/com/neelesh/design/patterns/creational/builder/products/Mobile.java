package com.neelesh.design.patterns.creational.builder.products;

import com.neelesh.design.patterns.creational.builder.components.Battery;
import com.neelesh.design.patterns.creational.builder.components.Camera;
import com.neelesh.design.patterns.creational.builder.components.Display;
import com.neelesh.design.patterns.creational.builder.components.Network;

public class Mobile {
    private String color;
    private boolean isWaterResistant;
    private boolean hasScreenProtection;
    private Battery battery;
    private Camera camera;
    private Display display;
    private Network network;

    public Mobile(Battery battery, Camera camera, Display display, Network network) {
        this.battery = battery;
        this.camera = camera;
        this.display = display;
        this.network = network;
    }

    public Mobile(String color, boolean isWaterResistant, boolean hasScreenProtection, Battery battery,
                  Camera camera, Display display, Network network) {
        this.color = color;
        this.isWaterResistant = isWaterResistant;
        this.hasScreenProtection = hasScreenProtection;
        this.battery = battery;
        this.camera = camera;
        this.display = display;
        this.network = network;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public boolean hasScreenProtection() {
        return hasScreenProtection;
    }

    public void setHasScreenProtection(boolean hasScreenProtection) {
        this.hasScreenProtection = hasScreenProtection;
    }

    public Battery getBattery() {
        return battery;
    }

    public Camera getCamera() {
        return camera;
    }

    public Display getDisplay() {
        return display;
    }

    public Network getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "color='" + color + '\'' +
                ", isWaterResistant=" + isWaterResistant +
                ", hasScreenProtection=" + hasScreenProtection +
                ", battery=" + battery +
                ", camera=" + camera +
                ", display=" + display +
                ", network=" + network +
                '}';
    }
}
