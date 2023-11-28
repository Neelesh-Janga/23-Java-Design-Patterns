package com.neelesh.design.patterns.creational.builder.components;

import com.neelesh.design.patterns.creational.builder.components.enums.NetworkTechnology;

public class Network {
    private NetworkTechnology technology;
    private int maxDownloadSpeed;
    private int maxUploadSpeed;
    private boolean is5GSupported;
    private boolean dualSimSupported;

    public Network(NetworkTechnology technology, int maxDownloadSpeed, int maxUploadSpeed, boolean is5GSupported,
                   boolean dualSimSupported) {
        this.technology = technology;
        this.maxDownloadSpeed = maxDownloadSpeed;
        this.maxUploadSpeed = maxUploadSpeed;
        this.is5GSupported = is5GSupported;
        this.dualSimSupported = dualSimSupported;
    }

    public NetworkTechnology getTechnology() {
        return technology;
    }

    public void setTechnology(NetworkTechnology technology) {
        this.technology = technology;
    }

    public int getMaxDownloadSpeed() {
        return maxDownloadSpeed;
    }

    public void setMaxDownloadSpeed(int maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
    }

    public int getMaxUploadSpeed() {
        return maxUploadSpeed;
    }

    public void setMaxUploadSpeed(int maxUploadSpeed) {
        this.maxUploadSpeed = maxUploadSpeed;
    }

    public boolean isIs5GSupported() {
        return is5GSupported;
    }

    public void setIs5GSupported(boolean is5GSupported) {
        this.is5GSupported = is5GSupported;
    }

    public boolean isDualSimSupported() {
        return dualSimSupported;
    }

    public void setDualSimSupported(boolean dualSimSupported) {
        this.dualSimSupported = dualSimSupported;
    }

    @Override
    public String toString() {
        return "Network{" +
                "technology=" + technology +
                ", maxDownloadSpeed=" + maxDownloadSpeed +
                ", maxUploadSpeed=" + maxUploadSpeed +
                ", is5GSupported=" + is5GSupported +
                ", dualSimSupported=" + dualSimSupported +
                '}';
    }
}
