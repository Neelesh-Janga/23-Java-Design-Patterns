package com.neelesh.design.patterns.creational.factory;

import com.neelesh.design.patterns.creational.factory.classes.Bike;
import com.neelesh.design.patterns.creational.factory.classes.Car;
import com.neelesh.design.patterns.creational.factory.classes.Cycle;
import com.neelesh.design.patterns.creational.factory.classes.Vehicle;
import com.neelesh.design.patterns.creational.factory.exceptions.InvalidVehicleException;

public class Factory {

    public Vehicle getInstance(String vehicle) {
        return switch (vehicle.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "cycle" -> new Cycle();
            default -> throw new InvalidVehicleException("Unable to create object for an invalid vehicle");
        };
    }
}
