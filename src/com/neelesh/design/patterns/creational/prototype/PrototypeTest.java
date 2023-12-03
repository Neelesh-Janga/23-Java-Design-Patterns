package com.neelesh.design.patterns.creational.prototype;

import com.neelesh.design.patterns.creational.prototype.components.Android;
import com.neelesh.design.patterns.creational.prototype.components.IOS;

public class PrototypeTest {

    public static void main(String[] args) {
        generateData();
    }

    public static void generateData() {
        Android oneplus = new Android();
        oneplus.display = "Amoled";
        oneplus.androidCodeName = "Upside Down Cake";
        oneplus.androidVersion = 14.0;
        oneplus.camera = 3;
        oneplus.fps = 120;
        oneplus.simSlots = 2;
        oneplus.color = "Glossy Black";
        oneplus.touchScreen = true;
        oneplus.network = "5G";
        oneplus.waterResistance = false;

        IOS iphone = new IOS();
        iphone.display = "Amoled";
        iphone.iOSCodeName = "Dawn";
        iphone.iOSVersion = 17.1;
        iphone.camera = 2;
        iphone.fps = 60;
        iphone.simSlots = 1;
        iphone.color = "Golden White";
        iphone.touchScreen = true;
        iphone.network = "4G";
        iphone.waterResistance = true;

        Android newOneplus = (Android) oneplus.clone();
        Android sameOneplus = oneplus;

        System.out.println("oneplus = " + oneplus);
        System.out.println("newOneplus = " + newOneplus);

        if (oneplus == sameOneplus)
            System.out.println("oneplus = sameOneplus, both objects are coupled to each other and are same");

        if (oneplus != newOneplus)
            System.out.println("oneplus != neweOneplus, both are different objects");

        System.out.println("oneplus and sameOneplus having same data ? " + oneplus.equals(sameOneplus));
        System.out.println("oneplus and newOneplus having same data ? " + oneplus.equals(newOneplus));

        newOneplus.androidVersion = 13.0;

        System.out.println("oneplus and sameOneplus having same data ? " + oneplus.equals(sameOneplus));
        System.out.println("oneplus and newOneplus having same data ? " + oneplus.equals(newOneplus));

        System.out.println("oneplus" + oneplus);
        System.out.println("newOneplus" + newOneplus);
    }
}
