package com.alighthub.snapRider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Feedback;
import com.alighthub.snapRider.service.FeedbackService;


@RestController
@RequestMapping("/Feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("/add")
	public Feedback addFeebback(@RequestBody Feedback feedback) {
		
	return feedbackService.addFeedback(feedback);
	}
	
	@GetMapping("/{id}")
	public Feedback editFeedback(@PathVariable int id) {
		
	return feedbackService.editFeedback(id);
	}
	
	@PutMapping("/")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
	return feedbackService.updateFeedback(feedback);
	}
	
	@DeleteMapping("/{id}")
	public int deleteFeedback(@PathVariable int id) {
		
	feedbackService.deleteFeedback(id);
	
	return id;	
	}
	@GetMapping("/getAll")
	public List<Feedback> DisplayAll(@ModelAttribute Feedback feedback){
				
	return feedbackService.dislpayAllFeedback();
	}
}
