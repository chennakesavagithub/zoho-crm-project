package com.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Locations;
import com.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void saveLocation(Locations location) {
		locationRepo.save(location);
	}

	@Override
	public List<Locations> getLocations() {
		List<Locations> locations = locationRepo.findAll();
		return locations;
	}

}
