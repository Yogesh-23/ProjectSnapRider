package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int feedbackId;
	private String feedbackStar;
	private String feedbackDescription;
	
	
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedbackStar() {
		return feedbackStar;
	}
	public void setFeedbackStar(String feedbackStar) {
		this.feedbackStar = feedbackStar;
	}
	public String getFeedbackDescription() {
		return feedbackDescription;
	}
	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
}
