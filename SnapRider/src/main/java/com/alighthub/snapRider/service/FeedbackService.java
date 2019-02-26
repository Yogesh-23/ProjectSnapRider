package com.alighthub.snapRider.service;

import java.util.List;

import com.alighthub.snapRider.model.Feedback;
import com.alighthub.snapRider.model.Login;

public interface FeedbackService {

	
	public Feedback addFeedback(Feedback feedback);

	public Feedback editFeedback(int id);
	
	public Feedback updateFeedback(Feedback feedback);
	
	public void deleteFeedback(int id);
	
    public List<Feedback> dislpayAllFeedback();
	
	
}
