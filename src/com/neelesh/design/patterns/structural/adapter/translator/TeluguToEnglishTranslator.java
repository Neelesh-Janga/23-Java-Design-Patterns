package com.neelesh.design.patterns.structural.adapter.translator;

import com.neelesh.design.patterns.structural.adapter.classes.English;
import com.neelesh.design.patterns.structural.adapter.classes.Telugu;
import com.neelesh.design.patterns.structural.adapter.exceptions.TranslationException;

public class TeluguToEnglishTranslator extends English{

    private Telugu telugu;

    public TeluguToEnglishTranslator(Telugu telugu) {
        this.telugu = telugu;
    }

    public English translateToEnglish() throws TranslationException{
        English english = new English();
        return switch (telugu.getContent()){
            case "నమస్కారం" -> {
                english.setContent("Greetings");
                yield english;
            }
            default -> throw new TranslationException("Regret to say that unable to translate the provided telugu text: " + telugu.getContent());
        };
    }
}
