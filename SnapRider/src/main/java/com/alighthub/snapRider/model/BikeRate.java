package com.alighthub.snapRider.model;

import javax.persistence.Entity;

//@Entity
public class BikeRate {

	
	private int perHours;
	private int perDay;
	private int perWeek;
	
	
	public int getPerHours() {
		return perHours;
	}
	public void setPerHours(int perHours) {
		this.perHours = perHours;
	}
	public int getPerDay() {
		return perDay;
	}
	public void setPerDay(int perDay) {
		this.perDay = perDay;
	}
	public int getPerWeek() {
		return perWeek;
	}
	public void setPerWeek(int perWeek) {
		this.perWeek = perWeek;
	}
	
	
}
