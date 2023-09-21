package com.xworkz.highway_tolls;

import com.xworkz.highway_tolls.highway.Highway;
import com.xworkz.highway_tolls.tolls.Tolls;

public class HighwayTollsTester {
    public static void main(String[] args) {
        Highway highway = new Highway();
        Tolls tolls = new Tolls();
        highway.tolls = tolls;
    }
}
