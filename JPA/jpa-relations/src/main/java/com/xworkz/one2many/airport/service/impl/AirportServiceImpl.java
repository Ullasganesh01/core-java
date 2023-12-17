package com.xworkz.one2many.airport.service.impl;

import com.xworkz.one2many.airport.dto.AirportDto;
import com.xworkz.one2many.airport.dto.TerminalsDto;
import com.xworkz.one2many.airport.repository.AirportRepository;
import com.xworkz.one2many.airport.repository.impl.AirportRepositoryImpl;
import com.xworkz.one2many.airport.service.AirportService;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    private static AirportRepository airportRepository = new AirportRepositoryImpl();
    @Override
    public void validateAddAirport(AirportDto dto) {
        if (dto!=null){
            if (dto.getAirportName()!=null && dto.getCity() != null && dto.getType()!=null && dto.getTerminals()!=null){
                List<TerminalsDto> terminals = dto.getTerminals();
                boolean isNull = true;
                for (TerminalsDto dto1 : terminals){
                    if (dto1.getTerminalName()!=null){
                        isNull = false;
                    }
                }
                airportRepository.addAirport(dto);
            }else {
                System.out.println("Invalid details has been entered");
            }
        }else {
            System.out.println("Data is null");
        }
    }

    @Override
    public void validateGetAirportById(int id) {
        if (id>0){
            System.out.println(airportRepository.getAirportById(id));
        }else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void validateGetTerminalsById(int id) {
        if (id>0){
            System.out.println(airportRepository.getTerminalById(id));
        }else {
            System.out.println("Invalid ID");
        }
    }
}
