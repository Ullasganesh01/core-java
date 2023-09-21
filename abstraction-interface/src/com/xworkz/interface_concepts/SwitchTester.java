package com.xworkz.interface_concepts;

import com.xworkz.interface_concepts.fan_abstract.Fan;
import com.xworkz.interface_concepts.switch_interface.Switch;
import com.xworkz.interface_concepts.tubelight.CFL;
import com.xworkz.interface_concepts.tubelight.Tubelight;

public class SwitchTester {
    public static void main(String[] args) {
        Switch tubelight = new Tubelight();
        tubelight.on();
        tubelight.off();

        CFL cfl = new CFL();
        cfl.on();
        cfl.off();

        Fan fan = new CFL();
        fan.on();
        fan.off();
    }
}
