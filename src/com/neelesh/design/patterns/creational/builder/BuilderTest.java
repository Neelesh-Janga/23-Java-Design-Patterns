package com.neelesh.design.patterns.creational.builder;

import com.neelesh.design.patterns.creational.builder.builders.MobileBuilder;
import com.neelesh.design.patterns.creational.builder.components.Battery;
import com.neelesh.design.patterns.creational.builder.components.Camera;
import com.neelesh.design.patterns.creational.builder.components.Display;
import com.neelesh.design.patterns.creational.builder.components.Network;
import com.neelesh.design.patterns.creational.builder.components.enums.BatteryHealth;
import com.neelesh.design.patterns.creational.builder.components.enums.BatteryTechnology;
import com.neelesh.design.patterns.creational.builder.components.enums.DisplayType;
import com.neelesh.design.patterns.creational.builder.components.enums.NetworkTechnology;
import com.neelesh.design.patterns.creational.builder.products.Mobile;

import java.util.UUID;

public class BuilderTest {

    public static void main(String[] args) {
        Mobile oneplus = buildMobile();
        oneplus.setColor("Glossy Black");
        oneplus.setWaterResistant(false);
        oneplus.setHasScreenProtection(false);

        System.out.println("*** Mobile: OnePlus ***");
        System.out.println("Color = " + oneplus.getColor());
        System.out.println("Water Resistant = " + oneplus.isWaterResistant());
        System.out.println("Screen Protection = " + oneplus.hasScreenProtection());
        System.out.println("Battery = " + oneplus.getBattery());
        System.out.println("Network = " + oneplus.getNetwork());
        System.out.println("Camera = " + oneplus.getCamera());
        System.out.println("Display = " + oneplus.getDisplay());
    }

    public static Mobile buildMobile(){
        MobileBuilder builder = new MobileBuilder();

        Network network = new Network(NetworkTechnology.FIVE_G, 100,
                75, true, true);

        Camera camera = new Camera("Sony", 108, true, true,
                "4K", false, 10);

        Battery battery = new Battery(5400, 99, false, BatteryHealth.EXCELLENT,
                "OnePlus", 27.5, 1, BatteryTechnology.LITHIUM_ION,
                UUID.randomUUID().toString());

        Display display = new Display(DisplayType.AMOLED, 6.2, 120, true, true);

        return builder
                .buildCamera(camera)
                .buildBattery(battery)
                .buildDisplay(display)
                .buildNetwork(network)
                .build();
    }
}
