package com.neelesh.design.patterns.structural.adapter.translator;

import com.neelesh.design.patterns.structural.adapter.components.Nokia;
import com.neelesh.design.patterns.structural.adapter.components.Samsung;
import com.neelesh.design.patterns.structural.adapter.components.interfaces.KeypadPhone;
import com.neelesh.design.patterns.structural.adapter.exceptions.TranslationException;

public class TouchPadAdapter implements KeypadPhone {
    private Samsung samsung;

    public TouchPadAdapter(Samsung samsung) {
        this.samsung = samsung;
    }

    @Override
    public Nokia interpretKeystrokes() {
        String text = this.samsung.getText();
        StringBuilder res = new StringBuilder();
        try{
            for(int i = 0; i < text.length(); i++){
                if(i < text.length()-1)
                    res.append(computeKeystroke(text.charAt(i))).append("-");
                else
                    res.append(computeKeystroke(text.charAt(i)));
            }
        }catch (TranslationException t){
                System.out.println(t.getMessage());
                res.delete(0, res.length());
        }
        Nokia keypadPhone = new Nokia();
        keypadPhone.setKeyStrokes(res.toString());

        return keypadPhone;
    }

    private String computeKeystroke(char letter) throws TranslationException{
        return switch (letter){
            case 'a' -> "2"; case 'b' -> "22"; case 'c' -> "222"; case 'd' -> "3";
            case 'e' -> "33"; case 'f' -> "333"; case 'g' -> "4"; case 'h' -> "44";
            case 'i' -> "444"; case 'j' -> "5"; case 'k' -> "55"; case 'l' -> "555";
            case 'm' -> "6"; case 'n' -> "66"; case 'o' -> "666"; case 'p' -> "7";
            case 'q' -> "77"; case 'r' -> "777"; case 's' -> "7777"; case 't' -> "8";
            case 'u' -> "88"; case 'v' -> "888"; case 'w' -> "9"; case 'x' -> "99";
            case 'y' -> "999"; case 'z' -> "9999"; case ' ' -> "0";
            default -> throw new TranslationException("Unable to find keystrokes for the letter '" + letter + "'.");
        };
    }
}
