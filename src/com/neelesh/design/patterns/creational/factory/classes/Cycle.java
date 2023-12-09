package com.neelesh.design.patterns.creational.factory.classes;

public class Cycle extends Vehicle {

    public Cycle() {
        super();
        System.out.println("Cycle Object Created!!");
    }

    @Override
    public void drive() {
        System.out.println("Riding a Cycle");
    }
}
