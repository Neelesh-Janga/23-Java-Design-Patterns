package com.neelesh.design.patterns.creational.abstract_factory.mobile.iOS;

import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;

public class IPhoneCamera implements ICamera {

    @Override
    public void captureImage(){
        System.out.println("📷 Capturing Image 🖼️");
    }

    @Override
    public void recordVideo(String resolution) {
        switch (resolution){
            case "1080" -> System.out.println("Recording started with 1080p resolution");
            case "2k" -> System.out.println("Recording started with 2k resolution");
            case "4k" -> System.out.println("Recording started with 4k resolution");
            default -> System.out.println("IPhone currently doesn't support " + resolution + " Resolution! Choose between 1080p, 2k & 4k");
        }
    }
}
