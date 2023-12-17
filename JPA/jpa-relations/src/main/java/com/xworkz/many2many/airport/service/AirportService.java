package com.xworkz.many2many.airport.service;

import com.xworkz.many2many.airport.dto.AirportDto;

public interface AirportService {
    void validateAddAirport(AirportDto dto);
    void validateGetAirportById(int id);
    void validateGetTerminalsById(int id);
    void validateGetAirportInfoById(int id);
}
