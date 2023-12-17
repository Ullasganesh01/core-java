package com.xworkz.feedbackform.service;

import com.xworkz.feedbackform.dto.FeedbackDto;

public interface FeedbackService {
    boolean validateAndSaveFeedback(FeedbackDto dto);
}
