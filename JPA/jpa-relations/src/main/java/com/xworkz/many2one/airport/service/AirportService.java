package com.xworkz.many2one.airport.service;

import com.xworkz.many2one.airport.dto.AirportDto;

public interface AirportService {
    void validateAddAirport(AirportDto dto);
    void validateGetAirportById(int id);
    void validateGetTerminalsById(int id);
    void validateGetAirportInfoById(int id);
}
