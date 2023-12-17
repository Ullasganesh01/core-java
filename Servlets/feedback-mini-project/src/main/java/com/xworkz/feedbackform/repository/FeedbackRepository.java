package com.xworkz.feedbackform.repository;

import com.xworkz.feedbackform.dto.FeedbackDto;

public interface FeedbackRepository {
    void addFeedback(FeedbackDto dto);
}
