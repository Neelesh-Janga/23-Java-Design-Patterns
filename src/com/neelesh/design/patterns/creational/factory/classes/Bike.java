package com.neelesh.design.patterns.creational.factory.classes;

public class Bike extends Vehicle {

    public Bike() {
        super();
        System.out.println("Bike Object Created!!");
    }

    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}
