package com.xworkz.many2many.airport.service.impl;

import com.xworkz.many2many.airport.dto.AirportDto;
import com.xworkz.many2many.airport.dto.TerminalsDto;
import com.xworkz.many2many.airport.repository.AirportRepository;
import com.xworkz.many2many.airport.repository.impl.AirportRepositoryImpl;
import com.xworkz.many2many.airport.service.AirportService;

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
            AirportDto dto  = airportRepository.getAirportById(id);
            printAirportDetails(dto);
        }else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void validateGetTerminalsById(int id) {
        if (id>0){
            TerminalsDto dto = airportRepository.getTerminalById(id);
            printTerminalDetails(dto);

        }else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void validateGetAirportInfoById(int id) {
        if (id>0){
           printAirportDetails(airportRepository.getAirportInfoById(id));
        }
        System.out.println("Invalid id");
    }

    public void printTerminalDetails(TerminalsDto dto){
        System.out.println(dto.getTerminalId());
        System.out.println(dto.getTerminalName());
//        System.out.println(dto.getAirport().getId());
//        System.out.println(dto.getAirport().getAirportName());
//        System.out.println(dto.getAirport().getCity());
//        System.out.println(dto.getAirport().getType());
    }

    public void printAirportDetails(AirportDto dto){
        System.out.println(dto.getId());
        System.out.println(dto.getAirportName());
        System.out.println(dto.getType());
        for (TerminalsDto dto1 : dto.getTerminals()){
            System.out.println(dto1.getTerminalId());
            System.out.println(dto1.getTerminalName());
        }
    }
}
