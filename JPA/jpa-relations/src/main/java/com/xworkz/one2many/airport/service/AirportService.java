package com.xworkz.one2many.airport.service;

import com.xworkz.one2many.airport.dto.AirportDto;

public interface AirportService {
    void validateAddAirport(AirportDto dto);
    void validateGetAirportById(int id);
    void validateGetTerminalsById(int id);
}
