package com.xworkz.theatre_screens;

import com.xworkz.theatre_screens.screens.Screen;
import com.xworkz.theatre_screens.theatre.Theatre;

public class TheatreScreenTester {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Screen screen = new Screen();
        theatre.screen = screen;
    }
}
