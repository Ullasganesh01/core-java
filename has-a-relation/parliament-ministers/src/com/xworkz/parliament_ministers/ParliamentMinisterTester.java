package com.xworkz.parliament_ministers;

import com.xworkz.parliament_ministers.ministers.Minister;
import com.xworkz.parliament_ministers.parliament.Parliament;

public class ParliamentMinisterTester {
    public static void main(String[] args) {
        Parliament parliament = new Parliament();
        Minister minister = new Minister();
        parliament.minister = minister;
    }
}
