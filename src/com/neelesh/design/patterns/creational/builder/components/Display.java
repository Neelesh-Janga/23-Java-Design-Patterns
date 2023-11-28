package com.neelesh.design.patterns.creational.builder.components;

import com.neelesh.design.patterns.creational.builder.components.enums.DisplayType;

public class Display {
    private DisplayType type;
    private double sizeInInches;
    private int refreshRate;
    private boolean curved;
    private boolean hdrSupport;

    public Display(DisplayType type, double sizeInInches, int refreshRate, boolean curved, boolean hdrSupport) {
        this.type = type;
        this.sizeInInches = sizeInInches;
        this.refreshRate = refreshRate;
        this.curved = curved;
        this.hdrSupport = hdrSupport;
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
        this.type = type;
    }

    public double getSizeInInches() {
        return sizeInInches;
    }

    public void setSizeInInches(double sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isCurved() {
        return curved;
    }

    public void setCurved(boolean curved) {
        this.curved = curved;
    }

    public boolean isHdrSupport() {
        return hdrSupport;
    }

    public void setHdrSupport(boolean hdrSupport) {
        this.hdrSupport = hdrSupport;
    }

    @Override
    public String toString() {
        return "Display{" +
                "type=" + type +
                ", sizeInInches=" + sizeInInches +
                ", refreshRate=" + refreshRate +
                ", curved=" + curved +
                ", hdrSupport=" + hdrSupport +
                '}';
    }
}
