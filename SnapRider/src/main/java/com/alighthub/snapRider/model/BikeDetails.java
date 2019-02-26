package com.alighthub.snapRider.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
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
 private Date bikeInsuranceDate;
 /*
 private String bikeDocuments;
 // private List<String> bikeImages;
  */
  //image code
  
  private String fileName;

  private String fileType;

  @Lob
  private byte[] data;

  
   public BikeDetails(String fileName, String fileType, byte[] data, String bikeName,String bikeModel,String bikeEngineCC,Date bikeInsuranceDate,String ManufactureYear) {
      this.fileName = fileName;
      this.fileType = fileType;
      this.data = data;
      this.bikeName=bikeName;
      this.bikeModel=bikeModel;
      this.bikeEngineCC=bikeEngineCC;
      this.ManufactureYear=ManufactureYear;
      this.bikeInsuranceDate=bikeInsuranceDate;
      
      
  }


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


public Date getBikeInsuranceDate() {
	return bikeInsuranceDate;
}


public void setBikeInsuranceDate(Date bikeInsuranceDate) {
	this.bikeInsuranceDate = bikeInsuranceDate;
}


public String getFileName() {
	return fileName;
}


public void setFileName(String fileName) {
	this.fileName = fileName;
}


/*public List<String> getBikeImages() {
	return bikeImages;
=======

public String getFileType() {
	return fileType;
>>>>>>> branch 'master' of https://github.com/Yogesh-23/ProjectSnapRider.git
}


public void setFileType(String fileType) {
	this.fileType = fileType;
}
<<<<<<< HEAD
  */


public byte[] getData() {
	return data;
}


public void setData(byte[] data) {
	this.data = data;
}

 
	

}
