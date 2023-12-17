package com.xworkz.many2many.airport.repository;

import com.xworkz.many2many.airport.dto.AirportDto;
import com.xworkz.many2many.airport.dto.TerminalsDto;

public interface AirportRepository {
    void addAirport(AirportDto dto);
    AirportDto getAirportById(int id);
    TerminalsDto getTerminalById(int id);
    AirportDto getAirportInfoById(int id);
}
