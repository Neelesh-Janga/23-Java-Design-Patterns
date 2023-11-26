package com.neelesh.design.patterns.creational.factory;

import com.neelesh.design.patterns.creational.factory.classes.Vehicle;

public class FactoryTest {

    public static void main(String[] args) {
        Vehicle vehicle = Factory.getInstance("car");
        vehicle = Factory.getInstance("bike");
        vehicle = Factory.getInstance("cycle");
        vehicle = Factory.getInstance("aeroplane");
    }
}
