package com.neelesh.design.patterns.creational.abstract_factory;

import com.neelesh.design.patterns.creational.abstract_factory.exception.InvalidMobile;
import com.neelesh.design.patterns.creational.abstract_factory.mobile.Mobile;
import com.neelesh.design.patterns.creational.abstract_factory.mobile_factory.IMobileComponentFactory;
import com.neelesh.design.patterns.creational.abstract_factory.mobile_factory.IPhoneFactory;
import com.neelesh.design.patterns.creational.abstract_factory.mobile_factory.OnePlusFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) throws InvalidMobile {
        String os = "android";

//        Building a Mobile using Camera & Display Components
        IMobileComponentFactory mobileComponentFactory = switch (os.toLowerCase()){
            case "ios" -> new IPhoneFactory();
            case "android" -> new OnePlusFactory();
            default -> throw new InvalidMobile();
        };

//        Using manufactured Mobile and testing its functionalities like recording videos, capturing photos, setting display fps, etc
        Mobile mobile = new Mobile(mobileComponentFactory);
        mobile.photo();
        mobile.video("8k");
        mobile.setDisplay(120);
    }
}
