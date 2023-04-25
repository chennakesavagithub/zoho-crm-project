package com.location.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Locations;
import com.location.repository.LocationRepository;

@RestController
public class LocationRestController {

	@Autowired
	private LocationRepository locationRepo;
	
	@RequestMapping("location/{id}")
	public Locations getLocation(@PathVariable("id") long id) {
		Optional<Locations> findById = locationRepo.findById(id);
		Locations location = findById.get();
		return location;
}
}