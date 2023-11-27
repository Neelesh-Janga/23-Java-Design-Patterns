package com.neelesh.design.patterns.creational.abstract_factory.mobile_factory;

import com.neelesh.design.patterns.creational.abstract_factory.mobile.android.OnePlusCamera;
import com.neelesh.design.patterns.creational.abstract_factory.mobile.android.OnePlusDisplay;
import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;
import com.neelesh.design.patterns.creational.abstract_factory.components.IDisplay;

public class OnePlusFactory implements IMobileComponentFactory{

    public OnePlusFactory(){
        System.out.println("🎉 Manufacturing OnePlus 🎉");
    }

    @Override
    public ICamera createCamera() {
        return new OnePlusCamera();
    }

    @Override
    public IDisplay createDisplay() {
        return new OnePlusDisplay();
    }
}
