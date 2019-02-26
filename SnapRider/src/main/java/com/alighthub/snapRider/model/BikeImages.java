package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class BikeImages {
	
	//@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bikeImagesId;
	private String bikeImagesName;
	
	
	
	public int getBikeImagesId() {
		return bikeImagesId;
	}
	public void setBikeImagesId(int bikeImagesId) {
		this.bikeImagesId = bikeImagesId;
	}
	public String getBikeImagesName() {
		return bikeImagesName;
	}
	public void setBikeImagesName(String bikeImagesName) {
		this.bikeImagesName = bikeImagesName;
	}
	
	
	

}
