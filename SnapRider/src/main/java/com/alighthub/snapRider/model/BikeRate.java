package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BikeRate {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeRateId;
	private int bikeRateperHours;
	private int bikeRateperDay;
	private int bikeRateperWeek;
	public int getBikeRateId() {
		return bikeRateId;
	}
	public void setBikeRateId(int bikeRateId) {
		this.bikeRateId = bikeRateId;
	}
	public int getBikeRateperHours() {
		return bikeRateperHours;
	}
	public void setBikeRateperHours(int bikeRateperHours) {
		this.bikeRateperHours = bikeRateperHours;
	}
	public int getBikeRateperDay() {
		return bikeRateperDay;
	}
	public void setBikeRateperDay(int bikeRateperDay) {
		this.bikeRateperDay = bikeRateperDay;
	}
	public int getBikeRateperWeek() {
		return bikeRateperWeek;
	}
	public void setBikeRateperWeek(int bikeRateperWeek) {
		this.bikeRateperWeek = bikeRateperWeek;
	}
	
	
	
}
