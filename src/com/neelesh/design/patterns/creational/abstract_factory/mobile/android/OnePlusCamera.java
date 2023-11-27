package com.neelesh.design.patterns.creational.abstract_factory.mobile.android;

import com.neelesh.design.patterns.creational.abstract_factory.components.ICamera;

public class OnePlusCamera implements ICamera {

    @Override
    public void captureImage(){
        System.out.println("📷 Capturing Image 🖼️");
    }

    @Override
    public void recordVideo(String resolution) {
        switch (resolution){
            case "720" -> System.out.println("Recording started with 720p resolution");
            case "1080" -> System.out.println("Recording started with 1080p resolution");
            case "2k" -> System.out.println("Recording started with 2k resolution");
            case "4k" -> System.out.println("Recording started with 4k resolution");
            case "8k" -> System.out.println("Recording started with 8k resolution");
            default -> System.out.println("IPhone currently doesn't support " + resolution + " Resolution! Choose between 720p, 1080p, 2k, 4k & 8k");
        }
    }
}
