package com.neelesh.design.patterns.creational.factory.exceptions;

public class InvalidVehicleException extends RuntimeException {

    private String message;

    public InvalidVehicleException() {
        super();
    }

    public InvalidVehicleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        if (message == null) return super.getMessage();
        return this.message;
    }
}
