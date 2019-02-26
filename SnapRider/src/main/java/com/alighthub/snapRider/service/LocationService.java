package com.alighthub.snapRider.service;

import com.alighthub.snapRider.model.Location;

public interface LocationService {

	public Location addLocation(Location location);

	public Location editLocation(int id);
	
	public Location updateLocation(Location location);
	
	public void deleteLocation(int id);

	
	
}
