package com.location.services;

import java.util.List;

import com.location.entities.Locations;

public interface LocationService {
	public void saveLocation(Locations location);

	public List<Locations> getLocations();
}
