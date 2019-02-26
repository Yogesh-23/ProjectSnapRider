package com.alighthub.snapRider.service;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import com.alighthub.snapRider.model.BikeDetails;




public interface BikeDetailsService {

	public int addBikeDetails(BikeDetails bikeDetails);
	public int deleteBikeDetails(int id);
	public BikeDetails editBikeDetails(int id);
	public int updateBikeDetails(BikeDetails bikeDetails);
	public BikeDetails storeFile(MultipartFile file,String bikeName,String bikeModel,String bikeEngineCC,Date bikeInsuranceDate,String ManufactureYear);
//	public BikeDetails storeFiles(MultipartFile []files);
	
	
}
