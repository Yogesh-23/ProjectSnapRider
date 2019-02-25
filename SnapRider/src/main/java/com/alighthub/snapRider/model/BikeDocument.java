package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BikeDocument {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeDocumentId;  
    private String bikeDocumentName;
    

	public int getBikeDocumentId() {
		return bikeDocumentId;
	}

	public void setBikeDocumentId(int bikeDocumentId) {
		this.bikeDocumentId = bikeDocumentId;
	}

	public String getBikeDocumentName() {
		return bikeDocumentName;
	}

	public void setBikeDocumentName(String bikeDocumentName) {
		this.bikeDocumentName = bikeDocumentName;
	}

	
	
	

}
