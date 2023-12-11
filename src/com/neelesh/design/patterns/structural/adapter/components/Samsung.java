package com.neelesh.design.patterns.structural.adapter.components;

import com.neelesh.design.patterns.structural.adapter.components.interfaces.TouchPhone;

public class Samsung implements TouchPhone {

    private String text;

    public Samsung() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void interpretText() {
        if(text == null || text.isEmpty()){
            System.out.println("Empty text found so nothing to interpret.");
            return;
        }

        System.out.println("Entered text = " + text);
    }
}
