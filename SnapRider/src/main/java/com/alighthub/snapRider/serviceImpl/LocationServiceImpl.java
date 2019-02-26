package com.alighthub.snapRider.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.snapRider.dao.LocationDao;
import com.alighthub.snapRider.dao.LoginDao;
import com.alighthub.snapRider.model.Location;
import com.alighthub.snapRider.model.Login;
import com.alighthub.snapRider.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDao locationdao;
	
	
	public Location addLocation(Location location) {
		
		return locationdao.save(location);
	}

	@Override
	public Location editLocation(int id) {

		return locationdao.findById(id).get();
	}

	
	@Override
	public void deleteLocation(int id) {
		// TODO Auto-generated method stub
		locationdao.deleteById(id);
	}

	@Override
	public Location updateLocation(Location location) {
	
		return locationdao.save(location);
	}

	
	
}
