package com.neelesh.design.patterns.structural.adapter.exceptions;

public class TranslationException extends Exception{
    private String message;

    public TranslationException() {
        super();
    }

    public TranslationException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
