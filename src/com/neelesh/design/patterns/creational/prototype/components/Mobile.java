package com.neelesh.design.patterns.creational.prototype.components;

public abstract class Mobile {
    public boolean touchScreen;
    public boolean waterResistance;
    public String color;
    public String network;
    public int camera;
    public int fps;
    public int simSlots;
    public String display;


    public abstract Mobile clone();

    public Mobile() {
    }

    public Mobile(Mobile mobile) {
        if (mobile != null) {
            touchScreen = mobile.touchScreen;
            waterResistance = mobile.waterResistance;
            color = mobile.color;
            network = mobile.network;
            camera = mobile.camera;
            fps = mobile.fps;
            simSlots = mobile.simSlots;
            display = mobile.display;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mobile) && !(super.equals(obj))) return false;
        Mobile mob = (Mobile) obj;
        return touchScreen == mob.touchScreen
                && waterResistance == mob.waterResistance
                && color.equals(mob.color)
                && network.equals(mob.network)
                && camera == mob.camera
                && fps == mob.fps
                && simSlots == mob.simSlots
                && display.equals(mob.display);
    }
}
