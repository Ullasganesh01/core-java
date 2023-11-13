package com.xworkz.one2many.airport;

import com.xworkz.one2many.airport.dto.AirportDto;
import com.xworkz.one2many.airport.dto.TerminalsDto;
import com.xworkz.one2many.airport.service.AirportService;
import com.xworkz.one2many.airport.service.impl.AirportServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportExecutor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AirportService airportService = new AirportServiceImpl();

        while (true){
            System.out.println();
            System.out.println("Welcome To Airport");
            System.out.println("1.To add airport");
            System.out.println("2.To get details of Airport by ID");
            System.out.println("3.To get details of Terminal by Id");
            System.out.println();
            System.out.println("Enter the choice :");
            int choice = s.nextInt();
            if (choice>0&&choice<4){
                int aId;
                String airportName;
                String city ;
                String type;
                List<TerminalsDto> terminals = new ArrayList<>();
                int noOfTerminals;

                int tId;
                String terminalName;

                AirportDto airportDto;
                TerminalsDto terminalsDto;

                switch (choice){
                    case 1 :
                        System.out.println("Enter the airport name :");
                        airportName = s.next();
                        System.out.println("Enter the city :");
                        city = s.next();
                        System.out.println("Enter the type : ");
                        type = s.next();
                        System.out.println("Enter the no of terminals to be added");
                        noOfTerminals = s.nextInt();
                        while (noOfTerminals-->0){
                            System.out.println("Enter the terminal name :");
                            terminalName = s.next();
                            terminalsDto = new TerminalsDto();
                            terminalsDto.setTerminalName(terminalName);
                            terminals.add(terminalsDto);
                        }
                        airportDto = AirportDto.builder()
                                .airportName(airportName)
                                .city(city)
                                .type(type)
                                .terminals(terminals)
                                .build();

                        airportService.validateAddAirport(airportDto);
                        break;

                    case 2:
                        System.out.println("Enter the airport id :");
                        aId = s.nextInt();
                        airportService.validateGetAirportById(aId);
                        break;

                    case 3:
                        System.out.println("Enter the terminal id :");
                        tId = s.nextInt();
                        airportService.validateGetTerminalsById(tId);
                        break;

                    default:
                        System.out.println("Enter the proper choice");
                }
            }else {
                break;
            }
        }
    }
}
