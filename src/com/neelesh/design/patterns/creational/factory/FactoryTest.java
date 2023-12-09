package com.neelesh.design.patterns.creational.factory;

import com.neelesh.design.patterns.creational.factory.classes.Vehicle;
import com.neelesh.design.patterns.creational.factory.exceptions.InvalidVehicleException;

public class FactoryTest {

    public static void main(String[] args) {
        Factory vehicleFactory = new Factory();

        try{
            Vehicle vehicle = vehicleFactory.getInstance("car");
            vehicle.drive();

            vehicle = vehicleFactory.getInstance("bike");
            vehicle.drive();

            vehicle = vehicleFactory.getInstance("cycle");
            vehicle.drive();

            vehicle = vehicleFactory.getInstance("aeroplane");
            vehicle.drive();
        }catch (InvalidVehicleException v){
            System.out.println(v.getMessage());
        }
    }
}
