package com.xworkz.many2many.airport;

import com.xworkz.many2many.airport.dto.AirportDto;
import com.xworkz.many2many.airport.dto.TerminalsDto;
import com.xworkz.many2many.airport.service.AirportService;
import com.xworkz.many2many.airport.service.impl.AirportServiceImpl;
import com.xworkz.many2many.airport.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
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
            System.out.println("4.To get airport info by terminal Id");
            System.out.println();
            System.out.println("Enter the choice :");
            int choice = s.nextInt();
            if (choice>0&&choice<5){
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
                        AirportDto a1 = new AirportDto();
                        a1.setAirportName("KIA");
                        a1.setCity("bangalore");
                        a1.setType("international");

                        AirportDto a2 = new AirportDto();
                        a2.setAirportName("chidambaram");
                        a2.setCity("chennai");
                        a2.setType("domestic");

                        AirportDto a3 = new AirportDto();
                        a3.setAirportName("netaji");
                        a3.setCity("kolkata");
                        a3.setType("international");

                        List<AirportDto> airportList1 = new ArrayList<>();
                        airportList1.add(a1);
                        airportList1.add(a2);

                        List<AirportDto> airportList2 = new ArrayList<>();
                        airportList2.add(a2);
                        airportList2.add(a3);

                        TerminalsDto t1 = new TerminalsDto();
                        t1.setTerminalName("Thor");
                        t1.setAirport(airportList1);

                        TerminalsDto t2 = new TerminalsDto();
                        t2.setTerminalName("SpiderMan");
                        t2.setAirport(airportList2);

                        TerminalsDto t3 = new TerminalsDto();
                        t3.setTerminalName("SuperMan");
                        t3.setAirport(airportList1);

                        List<TerminalsDto> tList1 = new ArrayList<>();
                        tList1.add(t1);
                        tList1.add(t2);

                        List<TerminalsDto> tList2 = new ArrayList<>();
                        tList2.add(t2);
                        tList2.add(t3);

                        a1.setTerminals(tList1);
                        a2.setTerminals(tList2);
                        a3.setTerminals(tList1);

                        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

                        em.getTransaction().begin();
                        em.persist(t1);
                        em.persist(t2);
                        em.persist(t3);

                        em.persist(a1);
                        em.persist(a2);
                        em.persist(a3);

                        em.getTransaction().commit();

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

                    case 4:System.out.println("Enter the terminal id :");
                        tId = s.nextInt();
                        airportService.validateGetAirportInfoById(tId);
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
