package com.neelesh.design.patterns.creational.builder.builders;

import com.neelesh.design.patterns.creational.builder.components.Battery;
import com.neelesh.design.patterns.creational.builder.components.Camera;
import com.neelesh.design.patterns.creational.builder.components.Display;
import com.neelesh.design.patterns.creational.builder.components.Network;

public interface Builder {

    Builder buildDisplay(Display display);

    Builder buildBattery(Battery battery);

    Builder buildCamera(Camera camera);

    Builder buildNetwork(Network network);
}
