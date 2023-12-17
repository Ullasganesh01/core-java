package com.xworkz.book_my_hotel.service.impl;

import com.xworkz.book_my_hotel.dto.FeedbackDto;
import com.xworkz.book_my_hotel.dto.ResortBookingDto;
import com.xworkz.book_my_hotel.repository.FeedbackRepository;
import com.xworkz.book_my_hotel.repository.impl.FeedbackRepositoryImpl;
import com.xworkz.book_my_hotel.service.FeedbackService;

import java.util.List;

public class FeedbackServiceImpl implements FeedbackService {
    private static FeedbackRepository repository = new FeedbackRepositoryImpl();
    public boolean validateAndSaveFeedback(FeedbackDto dto) {
        if(dto!=null){
            if (!dto.getName().isEmpty() && !dto.getEmailId().isEmpty() && dto.getContactNo()>1000000000 && !dto.getFeedback().isEmpty()){
                repository.addFeedback(dto);
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean validateAndSaveBookingDetails(ResortBookingDto dto) {
       if (dto!=null){
           repository.addBookingDetails(dto);
           return true;
       }else {
           return false;
       }
    }

    @Override
    public List<ResortBookingDto> validateAndGetAllBookingDetails() {
        List<ResortBookingDto> bookings = repository.getAllBookingDetails();
        if (bookings.isEmpty()|| bookings == null){
            return null;
        }else {
            return bookings;
        }
    }
}
