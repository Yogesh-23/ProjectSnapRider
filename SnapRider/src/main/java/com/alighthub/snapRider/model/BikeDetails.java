package com.alighthub.snapRider.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BikeDetails {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int bikeId;
  private String bikeName;
  private String bikeModel;
  private String bikeEngineCC;
  private String ManufactureYear;
  private Date bikeInsurance;
  private String bikeDocuments;
//private List<String> bikeImages;
  
  
public int getBikeId() {
	return bikeId;
}
public void setBikeId(int bikeId) {
	this.bikeId = bikeId;
}
public String getBikeName() {
	return bikeName;
}
public void setBikeName(String bikeName) {
	this.bikeName = bikeName;
}
public String getBikeModel() {
	return bikeModel;
}
public void setBikeModel(String bikeModel) {
	this.bikeModel = bikeModel;
}
public String getBikeEngineCC() {
	return bikeEngineCC;
}
public void setBikeEngineCC(String bikeEngineCC) {
	this.bikeEngineCC = bikeEngineCC;
}
public String getManufactureYear() {
	return ManufactureYear;
}
public void setManufactureYear(String manufactureYear) {
	ManufactureYear = manufactureYear;
}
public Date getBikeInsurance() {
	return bikeInsurance;
}
public void setBikeInsurance(Date bikeInsurance) {
	this.bikeInsurance = bikeInsurance;
}
public String getBikeDocuments() {
	return bikeDocuments;
}
public void setBikeDocuments(String bikeDocuments) {
	this.bikeDocuments = bikeDocuments;
}

/*public List<String> getBikeImages() {
	return bikeImages;
}
public void setBikeImages(List<String> bikeImages) {
	this.bikeImages = bikeImages;
}
  */
	
	
}
