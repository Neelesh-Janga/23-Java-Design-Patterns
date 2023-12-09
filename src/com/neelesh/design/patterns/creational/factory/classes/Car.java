package com.neelesh.design.patterns.creational.factory.classes;

public class Car extends Vehicle {

    public Car() {
        super();
        System.out.println("Car Object Created!!");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}
