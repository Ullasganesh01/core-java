package com.xworkz.many2one.airport.repository;

import com.xworkz.many2one.airport.dto.AirportDto;
import com.xworkz.many2one.airport.dto.TerminalsDto;

public interface AirportRepository {
    void addAirport(AirportDto dto);
    AirportDto getAirportById(int id);
    TerminalsDto getTerminalById(int id);
    AirportDto getAirportInfoById(int id);
}
