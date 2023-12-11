package com.neelesh.design.patterns.structural.adapter.components;

import com.neelesh.design.patterns.structural.adapter.components.interfaces.KeypadPhone;

public class Nokia implements KeypadPhone {

    private String keyStrokes;

    public Nokia() {
    }

    public String getKeyStrokes() {
        return keyStrokes;
    }

    public void setKeyStrokes(String keyStrokes) {
        this.keyStrokes = keyStrokes;
    }

    @Override
    public Nokia interpretKeystrokes() {
        if(keyStrokes == null || keyStrokes.isEmpty()){
            System.out.println("No keyStrokes found so nothing to interpret.");
            return this;
        }
        System.out.println("Keystrokes = " + keyStrokes);
        return this;
    }
}
