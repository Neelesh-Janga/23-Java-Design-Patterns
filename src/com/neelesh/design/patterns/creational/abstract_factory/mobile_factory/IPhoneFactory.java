package com.neelesh.design.patterns.creational.abstract_factory.mobile_factory;

import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;
import com.neelesh.design.patterns.creational.abstract_factory.components.IDisplay;
import com.neelesh.design.patterns.creational.abstract_factory.mobile.iOS.IPhoneCamera;
import com.neelesh.design.patterns.creational.abstract_factory.mobile.iOS.IPhoneDisplay;

public class IPhoneFactory implements IMobileComponentFactory {

    public IPhoneFactory(){
        System.out.println("🎉 Manufacturing IPhone 🎉");
    }

    @Override
    public ICamera createCamera() {
        return new IPhoneCamera();
    }

    @Override
    public IDisplay createDisplay() {
        return new IPhoneDisplay();
    }
}
