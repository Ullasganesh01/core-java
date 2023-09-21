package com.xworkz.factory_machine;

import com.xworkz.factory_machine.factory.Factory;
import com.xworkz.factory_machine.machine.Machine;

public class FactoryMachineTester {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Machine machine = new Machine();
        factory.machine = machine;
    }
}
