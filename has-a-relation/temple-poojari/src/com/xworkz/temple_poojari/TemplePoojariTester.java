package com.xworkz.temple_poojari;

import com.xworkz.temple_poojari.poojari.Poojari;
import com.xworkz.temple_poojari.temple.Temple;

public class TemplePoojariTester {
    public static void main(String[] args) {
        Temple temple = new Temple();
        Poojari poojari = new Poojari();
        temple.poojari = poojari;
    }
}
