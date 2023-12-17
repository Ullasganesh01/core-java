package com.xworkz.bms_app.service;

import com.xworkz.bms_app.dto.MovieTicketsDto;

import java.util.List;

public interface BMSService {
    MovieTicketsDto validateGetMovieTicketInfoById(int id);
    void validateTicketAndAdd(MovieTicketsDto dto);
    void validateUpdateNoOfTicketsById(int UpdatedNoOfTickets,int id);
    void validateDeleteTicketById(int id);
    void validateFetchAllTickets();
    void validateFetchTicketsByMovieName(String movieName);
    void validateFetchTicketByMovieName(String movieName);
    void validateFetchAllTicketsInfo();
    void validateFetchTheatreFromMovieName(String movieName);
    void validateFetchAllTheatreFromMovieName(String movieName);
    void validateFetchAllMovieNamesByLocation(String location);
    void validateFetchAllMovieAndTheatreByLocation(String location);
    void validateFetchMovieAndTheatreByLocation(String location);
    void validateUpdatePriceByTheatreName(String theatreName,double price);
    void validateDeleteTicketByMovieName(String movieName);
    void selectNormalQueries();
    void selectCriteriaQueries();
}
