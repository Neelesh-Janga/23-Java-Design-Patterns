package com.neelesh.design.patterns.creational.abstract_factory.mobile_factory;

import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;
import com.neelesh.design.patterns.creational.abstract_factory.components.IDisplay;

public interface IMobileComponentFactory {
    ICamera createCamera();
    IDisplay createDisplay();
}
