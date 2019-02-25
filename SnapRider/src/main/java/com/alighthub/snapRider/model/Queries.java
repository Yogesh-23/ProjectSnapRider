package com.alighthub.snapRider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Queries {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int queriesId;
	private String queriesName;
	private String queriesDescription;
	
	
	
	
	public int getQueriesId() {
		return queriesId;
	}
	public void setQueriesId(int queriesId) {
		this.queriesId = queriesId;
	}
	public String getQueriesName() {
		return queriesName;
	}
	public void setQueriesName(String queriesName) {
		this.queriesName = queriesName;
	}
	public String getQueriesDescription() {
		return queriesDescription;
	}
	public void setQueriesDescription(String queriesDescription) {
		this.queriesDescription = queriesDescription;
	}
	
	
	
	
	

}
