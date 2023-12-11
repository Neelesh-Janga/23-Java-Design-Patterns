package com.neelesh.design.patterns.structural.adapter;

import com.neelesh.design.patterns.structural.adapter.components.Nokia;
import com.neelesh.design.patterns.structural.adapter.components.Samsung;
import com.neelesh.design.patterns.structural.adapter.translator.TouchPadAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        Samsung galaxyS23 = new Samsung();
        galaxyS23.setText("i am neelesh janga");
        galaxyS23.interpretText();

        TouchPadAdapter adapter = new TouchPadAdapter(galaxyS23);

        Nokia nokia5210 = adapter.interpretKeystrokes();
        nokia5210.interpretKeystrokes();

        galaxyS23.setText("i am 23 years old");
        nokia5210 = adapter.interpretKeystrokes();
        nokia5210.interpretKeystrokes();
    }
}
