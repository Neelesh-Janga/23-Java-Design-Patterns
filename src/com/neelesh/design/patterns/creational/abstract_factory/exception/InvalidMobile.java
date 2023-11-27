package com.neelesh.design.patterns.creational.abstract_factory.exception;

public class InvalidMobile extends Exception{

    @Override
    public String getMessage() {
        return "Mobile doesn't exists";
    }
}
