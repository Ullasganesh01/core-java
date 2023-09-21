package com.xworkz.interface_concepts.tubelight;

import com.xworkz.interface_concepts.fan_abstract.Fan;

public class CFL extends Fan {
    @Override
    public void on() {
        System.out.println("Turn on the fan");
    }

    @Override
    public void off() {
        System.out.println("Turn off the fan");
    }
}
