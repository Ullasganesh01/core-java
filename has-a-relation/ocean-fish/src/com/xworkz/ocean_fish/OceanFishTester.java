package com.xworkz.ocean_fish;

import com.xworkz.ocean_fish.fish.Fish;
import com.xworkz.ocean_fish.ocean.Ocean;

public class OceanFishTester {
    public static void main(String[] args) {
        Ocean ocean =new Ocean();
        Fish fish = new Fish();
        ocean.fish = fish;
    }
}
