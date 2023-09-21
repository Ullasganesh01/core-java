package com.xworkz.fabric_patterns;

import com.xworkz.fabric_patterns.fabric.Fabric;
import com.xworkz.fabric_patterns.patterns.Pattern;

public class FabricPatternsTester {
    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        Pattern pattern = new Pattern();
        fabric.pattern =pattern;
    }
}
