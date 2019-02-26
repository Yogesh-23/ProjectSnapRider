package com.alighthub.snapRider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.snapRider.model.Location;
import com.alighthub.snapRider.model.Login;
import com.alighthub.snapRider.service.LocationService;
import com.alighthub.snapRider.service.LoginService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService locationservice;
	
	@PostMapping("/add")
	public Location caddLocation(@RequestBody Location location) {
		
		return locationservice.addLocation(location);
	}

	@GetMapping("/{id}")
	public Location ceditLocation(@PathVariable int id) {
		
		return locationservice.editLocation(id);
	}

	@PutMapping("/")
	public Location cupdateLocation(@RequestBody Location location) {
	
		return locationservice.updateLocation(location);
	}

	@DeleteMapping("/{id}")
	public void cdeleteLocation(@PathVariable int id) {
		
		locationservice.deleteLocation(id);
	}

}
