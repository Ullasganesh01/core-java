package com.xworkz.book_my_hotel.repository;

import com.xworkz.book_my_hotel.dto.FeedbackDto;
import com.xworkz.book_my_hotel.dto.ResortBookingDto;

import java.util.List;

public interface FeedbackRepository {
    void addFeedback(FeedbackDto dto);
    void addBookingDetails(ResortBookingDto dto);
    List<ResortBookingDto> getAllBookingDetails();
}
