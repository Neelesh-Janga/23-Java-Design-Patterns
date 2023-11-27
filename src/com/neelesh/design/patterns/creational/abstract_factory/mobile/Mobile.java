package com.neelesh.design.patterns.creational.abstract_factory.mobile;

import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;
import com.neelesh.design.patterns.creational.abstract_factory.components.IDisplay;
import com.neelesh.design.patterns.creational.abstract_factory.mobile_factory.IMobileComponentFactory;

public class Mobile {
    private IDisplay display;
    private ICamera camera;

    private Mobile() {
    }

    public Mobile(IMobileComponentFactory mobileComponentFactory) {
        super();
        System.out.println();
        display = mobileComponentFactory.createDisplay();
        camera = mobileComponentFactory.createCamera();
    }

    public void photo() {
        camera.captureImage();
    }

    public void video() {
        camera.recordVideo("1080");
    }

    public void video(String resolution) {
        camera.recordVideo(resolution);
    }

    public void setDisplay(){
        display.displaySettings(30);
    }

    public void setDisplay(int fps) {
        display.displaySettings(fps);
    }
}
