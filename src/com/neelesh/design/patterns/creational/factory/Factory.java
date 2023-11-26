package com.neelesh.design.patterns.creational.factory;

import com.neelesh.design.patterns.creational.factory.classes.Bike;
import com.neelesh.design.patterns.creational.factory.classes.Car;
import com.neelesh.design.patterns.creational.factory.classes.Cycle;
import com.neelesh.design.patterns.creational.factory.classes.Vehicle;

public class Factory {

    private Factory() {}

    public static Vehicle getInstance(String vehicle) {
        return switch (vehicle.toLowerCase()) {
            case "car" -> {
                System.out.println("Car Object Created!!");
                yield new Car();
            }
            case "bike" -> {
                System.out.println("Bike Object Created!!");
                yield new Bike();
            }
            case "cycle" -> {
                System.out.println("Cycle Object Created!!");
                yield new Cycle();
            }
            default -> {
                System.out.println("Not a valid Vehicle");
                yield null;
            }
        };
    }
}
