package com.alighthub.snapRider.serviceImpl;

import java.io.IOException;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alighthub.snapRider.Exception.FileStorageException;
import com.alighthub.snapRider.dao.BikeDetailsDao;
import com.alighthub.snapRider.model.BikeDetails;
import com.alighthub.snapRider.service.BikeDetailsService;

import antlr.StringUtils;

@Service
public class BikeDetailsServiceImpl implements BikeDetailsService {

	@Autowired
	private BikeDetailsDao bikeDetailsDao;
	
	@Override
	public int addBikeDetails(BikeDetails bikeDetails) {
	
		 bikeDetailsDao.save(bikeDetails);
	return 1;
	
	}

	@Override
	public int deleteBikeDetails(int id) {
	 bikeDetailsDao.deleteById(id);
	
		return 1;
	}

	@Override
	public BikeDetails editBikeDetails(int id) {
		
		return bikeDetailsDao.findById(id).get();
	}

	@Override
	public int updateBikeDetails(BikeDetails bikeDetails) {
		
		 bikeDetailsDao.save(bikeDetails);
	return 1;
	}

	
	public BikeDetails storeFile(MultipartFile file,String bikeName,String bikeModel,String bikeEngineCC,Date bikeInsuranceDate,String ManufactureYear)
 {
        // Normalize file name
        String fileName = org.springframework.util.StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            BikeDetails bikeDetails = new BikeDetails(fileName, file.getContentType(), file.getBytes(),bikeName, bikeModel, bikeEngineCC, bikeInsuranceDate,ManufactureYear);

            return bikeDetailsDao.save(bikeDetails);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }
	
	
	/*******************Multiple ImAGES********************/
	
/*
	public BikeDetails storeFiles(MultipartFile []files) {

		
		
		int size=files.length;
		System.out.println(size);
		int i=0;
		String image="";
		
		MultipartFile file;
		while(size>i)
		{
			 file=files[i];
			 String fileName = org.springframework.util.StringUtils.cleanPath(file.getOriginalFilename());

			image=image+','+fileName;
			
		}

		
	
		
		 BikeDetails bikeDetail=new BikeDetails();
	
		 bikeDetail.setFileName(image);
	//	BikeDetails bikeDetails= new BikeDetails(bikeDetail.getFileName(), file.getContentType(), file.getBytes());

      //   return bikeDetailsDao.save(bikeDetails);

		
		
		
		        // Normalize file name
        String fileName = org.springframework.util.StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            BikeDetails bikeDetails = new BikeDetails(fileName, file.getContentType(), file.getBytes());

            return bikeDetailsDao.save(bikeDetails);
  
           
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
		
		return null;
    }
	
	
	
	
	*/
	
	
}
