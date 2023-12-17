package com.xworkz.feedbackform.service.impl;

import com.xworkz.feedbackform.dto.FeedbackDto;
import com.xworkz.feedbackform.repository.FeedbackRepository;
import com.xworkz.feedbackform.repository.impl.FeedbackRepositoryImpl;
import com.xworkz.feedbackform.service.FeedbackService;

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
}
