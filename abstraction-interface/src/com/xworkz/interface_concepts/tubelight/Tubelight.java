package com.xworkz.interface_concepts.tubelight;

import com.xworkz.interface_concepts.switch_interface.Switch;

public class Tubelight implements Switch {

    @Override
    public void on() {
        System.out.println("Turn on the light");
    }

    @Override
    public void off() {
        System.out.println("Turn off the light");
    }
}
