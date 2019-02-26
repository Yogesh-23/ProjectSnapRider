package com.alighthub.snapRider.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.snapRider.dao.FeedbackDao;
import com.alighthub.snapRider.model.Feedback;
import com.alighthub.snapRider.service.FeedbackService;


@Service
public class FeedbackServiceImpl implements FeedbackService{

	
	@Autowired
	private FeedbackDao feedbackDao;

	@Override
	public Feedback addFeedback(Feedback feedback) {
		
		return feedbackDao.save(feedback);
	}

	@Override
	public Feedback editFeedback(int id) {
	
		
		return feedbackDao.findById(id).get();
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		
		return feedbackDao.save(feedback);
	}

	@Override
	public void deleteFeedback(int id) {
		
		feedbackDao.deleteById(id);
	
	}

	@Override
	public List<Feedback> dislpayAllFeedback() {
	
		List<Feedback> flist=feedbackDao.findAll();
		
		return flist;
	}
}
