package com.xworkz.bms_app.repository;

import com.xworkz.bms_app.dto.MovieTicketsDto;

import java.util.List;

public interface BMSRepository {
    void addTicket(MovieTicketsDto dto);
    MovieTicketsDto getMovieTicketInfoById(int id);
    void updateNoOfTicketsById(int updatedNoOfTickets,int id);
    void deleteTicketById(int id);
    List<MovieTicketsDto> fetchAllTickets();
    List<MovieTicketsDto> fetchTicketsByMovieName(String movieName);
    MovieTicketsDto fetchTicketByMovieName(String movieName);
    List<MovieTicketsDto> fetchAllTicketsInfo();
    String fetchTheatreFromMovieName(String movieName);
    List<String> fetchAllMovieNamesByLocation(String location);
    List<String> fetchAllTheatreFromMovieName(String movieName);
    List<Object[]> fetchAllMovieAndTheatreByLocation(String location);
    Object[] fetchMovieAndTheatreByLocation(String location);
    int updatePriceByTheatreName(String theatreName, double price);
    int deleteTicketByMovieName(String movieName);
}

/*
jdbc problems
1-> 5 steps for connection
2-> conversion
3-> ResultSet
4-> sql query
5-> costly resources


ORM - guidelines provided for mapping java entity to relational database tables without conversion
ORM tools - Hibernate, TopLink, MyBatis, Django
JPA - specification or standards which solves the problem for tight coupling
ORM tools implement JPA internally to solve tight coupling problem whenever there is a change in orm tool to another

JPA uses mainly 3 components
-> Persistence
-> EntityManagerFactory
-> EntityManager

*Persistence(Class) performs 3 main tasks - configuration class
-> provide connection properties
-> read persistence.xml file path
-> create reference for EntityManagerFactory(PersistenceUnitName)

*EntityManageFactory(I)
-> Configure DB
-> Get reference of EntityManager

*EntityManager(I)
-> Perform CRUD
3 main components
-> EntityTransaction(I)
-> Query(I)
-> EntityGraph(I)


 */
