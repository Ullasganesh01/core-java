package com.xworkz.airport_terminal;

import com.xworkz.airport_terminal.airport.Airport;
import com.xworkz.airport_terminal.terminal.Terminal;

public class AirportTerminalTester {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Airport airport = new Airport();
        airport.setTerminalId(2);

        Airport air2 = new Airport(terminal,3);
        System.out.println(air2.getTerminalId());

        //airport.terminal = terminal;
        System.out.println(airport.getTerminalId());
    }
}
