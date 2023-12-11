package com.neelesh.design.patterns.structural.adapter;

import com.neelesh.design.patterns.structural.adapter.classes.English;
import com.neelesh.design.patterns.structural.adapter.classes.Telugu;
import com.neelesh.design.patterns.structural.adapter.exceptions.TranslationException;
import com.neelesh.design.patterns.structural.adapter.translator.TeluguToEnglishTranslator;

public class AdapterTest {

    public static void main(String[] args) {

        try {
            System.out.println("Example-1");
            Telugu teluguContext = new Telugu("నమస్కారం");
            System.out.println("Text in Telugu Language: " + teluguContext.getContent());

            TeluguToEnglishTranslator translator = new TeluguToEnglishTranslator(teluguContext);

            English englishContext = translator.translateToEnglish();
            System.out.println("Text Translated to English: " + englishContext.getContent());

            System.out.println("\nExample-2");
            teluguContext.setContent("ధన్యవాదాలు");
            System.out.println("Text in Telugu Language: " + teluguContext.getContent());
            englishContext = translator.translateToEnglish();
            System.out.println("Text Translated to English: " + englishContext.getContent());
        }catch (TranslationException t){
            System.out.println(t.getMessage());
        }
    }
}
