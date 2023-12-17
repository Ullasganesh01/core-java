package com.xworkz.bms_app;

import com.xworkz.bms_app.constants.Languages;
import com.xworkz.bms_app.dto.MovieTicketsDto;
import com.xworkz.bms_app.service.BMSService;
import com.xworkz.bms_app.service.impl.BMSServiceImpl;

import java.util.Scanner;

public class BmsTester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BMSService bmsService = new BMSServiceImpl();
        while (true){
            System.out.println();
            System.out.println("Welcome to Book My Show");
            System.out.println("1.To Book Tickets ");
            System.out.println("2.To Get Info Of Movie Ticket By Id");
            System.out.println("3.Update the No of tickets By Id");
            System.out.println("4.Delete Ticket By Id");
            System.out.println("5.Fetch all the tickets");
            System.out.println("6.Fetch Tickets By Movie Name");
            System.out.println("7.Fetch Ticket By Movie Name - User input");
            System.out.println("8.Fetch all Tickets Info");
            System.out.println("9.Fetch Theatre By Movie Name");
            System.out.println("10.Fetch all Theatre By Movie Name");
            System.out.println("11.Fetch All Movies By Location");
            System.out.println("12.Fetch All Movies and Theatres By Location");
            System.out.println("13.Fetch Movie and Theatre By Location");
            System.out.println("14.Update Price By Theatre");
            System.out.println("15.Delete Ticket By Movie Name");
            System.out.println("16.Select Normal Queries");
            System.out.println("17.Select Criteria Queries");
            System.out.println("Enter the choice : ");
            //System.out.println();
            int choice = s.nextInt();
            if (choice>0 && choice <18){
                int id;
                String movieName;
                String location;
                String theatreName;
                int tickets;
                double price;
                switch (choice){
                    case 1 :
                        System.out.println("Enter the location : ");
                        location = s.next();
                        System.out.println("Enter the movie name : ");
                        movieName = s.next();
                        System.out.println("Enter the language :");
                        for (Languages languages : Languages.values()){
                            System.out.print(languages + ", ");
                        }
                        System.out.println();
                        Languages lang = Languages.valueOf(s.next().toUpperCase());
                        System.out.println("Enter the timings : ");
                        String timings = s.next();
                        System.out.println("Enter the theatre name : ");
                        theatreName =s.next();
                        System.out.println("Enter the no of tickets : ");
                        tickets = s.nextInt();
                        price = tickets*250;

                        MovieTicketsDto dto = MovieTicketsDto.
                                builder().
                                location(location).
                                movieName(movieName).
                                language(lang).
                                timings(timings).
                                theatreName(theatreName).
                                noOfTickets(tickets).
                                price(price).
                                build();
                        bmsService.validateTicketAndAdd(dto);
                        break;
                    case 2:
                        System.out.println("Enter the ID : ");
                        id = s.nextInt();
                        System.out.println(bmsService.validateGetMovieTicketInfoById(id));
                        break;
                    case 3:
                        System.out.println("Enter the id : ");
                        id = s.nextInt();
                        System.out.println("Enter the no of tickets to be updated");
                        int noOfTickets = s.nextInt();
                        bmsService.validateUpdateNoOfTicketsById(noOfTickets,id);
                        break;
                    case 4:
                        System.out.println("Enter the id : ");
                        id = s.nextInt();
                        bmsService.validateDeleteTicketById(id);
                        break;
                    case 5:
                        bmsService.validateFetchAllTickets();
                        break;
                    case 6:
                        System.out.println("Enter the movie name : ");
                        movieName = s.next();
                        bmsService.validateFetchTicketsByMovieName(movieName);
                        break;
                    case 7:
                        System.out.println("Enter the movie name : ");
                        movieName = s.next();
                        bmsService.validateFetchTicketByMovieName(movieName);
                        break;
                    case 8:
                        bmsService.validateFetchAllTicketsInfo();
                        break;
                    case 9:
                        System.out.println("Enter the movie name :");
                        movieName =s.next();
                        bmsService.validateFetchTheatreFromMovieName(movieName);
                        break;
                    case 10:
                        System.out.println("Enter the movie name :");
                        movieName =s.next();
                        bmsService.validateFetchAllTheatreFromMovieName(movieName);
                        break;
                    case 11:
                        System.out.println("Enter the location : ");
                        location = s.next();
                        bmsService.validateFetchAllMovieNamesByLocation(location);
                        break;
                    case 12:
                        System.out.println("Enter the location : ");
                        location = s.next();
                        bmsService.validateFetchAllMovieAndTheatreByLocation(location);
                        break;
                    case 13:
                        System.out.println("Enter the location : ");
                        location = s.next();
                        bmsService.validateFetchMovieAndTheatreByLocation(location);
                        break;
                    case 14:
                        System.out.println("Enter the Theatre Name :");
                        theatreName = s.next();
                        System.out.println("Enter the Price : ");
                        price = s.nextDouble();
                        bmsService.validateUpdatePriceByTheatreName(theatreName,price);
                        break;
                    case 15:
                        System.out.println("Enter the Movie Name :");
                        movieName = s.next();
                        bmsService.validateDeleteTicketByMovieName(movieName);
                        break;
                    case 16:
                        bmsService.selectNormalQueries();
                        break;
                    case 17:
                        bmsService.selectCriteriaQueries();
                        break;
                    default:
                        System.out.println("Enter the proper choice ");
                }
            }else {
                break;
            }
        }
    }
}
