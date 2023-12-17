package com.xworkz.book_my_hotel.service;

import com.xworkz.book_my_hotel.dto.FeedbackDto;
import com.xworkz.book_my_hotel.dto.ResortBookingDto;

import java.util.List;

public interface FeedbackService {
    boolean validateAndSaveFeedback(FeedbackDto dto);
    boolean validateAndSaveBookingDetails(ResortBookingDto dto);
    List<ResortBookingDto> validateAndGetAllBookingDetails();
}
