package com.alighthub.snapRider.controller;

import java.sql.Date;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.alighthub.snapRider.model.BikeDetails;
import com.alighthub.snapRider.service.BikeDetailsService;
import com.alighthub.snapRider.util.UploadFileResponse;

@RestController
@RequestMapping("/BikeDetails")
public class BikeDetailsController {

	@Autowired
	private BikeDetailsService bikeDetailsService;
	
	
	public boolean flag=false;
	
	/*@PostMapping("/add")
	public int addBikeDetails( @RequestBody BikeDetails bikeDetails)
	{
		System.out.println("in controller!!!");
		
		
		return bikeDetailsService.addBikeDetails(bikeDetails);
	}
	
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public int deleteBikeDetails(@PathVariable int id)
	{
		
		bikeDetailsService.deleteBikeDetails(id);
		return id;
	}
	
	
	@GetMapping("/edit/{id}")
	public BikeDetails editBikeDetails(@PathVariable int id)
	{
		return bikeDetailsService.editBikeDetails(id);
	}
	
	
	@PutMapping("/update")
	
	public int updateBikeDetails(@RequestBody BikeDetails bikeDetails)
	{
		return bikeDetailsService.updateBikeDetails(bikeDetails);
	}
	
	
	
*/
    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file,@RequestParam String bikeName,@RequestParam String bikeModel,@RequestParam String bikeEngineCC,@RequestParam String ManufactureYear,@RequestParam Date bikeInsuranceDate) {
        BikeDetails bikeDetails = bikeDetailsService.storeFile(file, bikeName, bikeModel, bikeEngineCC, bikeInsuranceDate,ManufactureYear);

       /* String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(bikeDetails.getBikeId())
                .toUriString();
*/
        return new UploadFileResponse();
    }

	/*
    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
    	
    	
    	
        return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
    }*/
	
    
    
    
/*
    @PostMapping("/uploadMultipleFiles1")
    public List<UploadFileResponse> uploadMultipleFiless(@RequestParam("files") MultipartFile[] files) {
    	    
    	System.out.println("in files");
    	
    	bikeDetailsService.storeFiles(files);
    	
    	
      return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());
    }
*/	
	
   
    
    
    
}
