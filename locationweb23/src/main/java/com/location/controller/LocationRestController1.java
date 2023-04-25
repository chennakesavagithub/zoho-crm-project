package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Locations;
import com.location.repository.LocationRepository;

@RestController
@RequestMapping("locations")
public class LocationRestController1 {
@Autowired
private LocationRepository locationRepo;
	@GetMapping
	public List<Locations>getlocations(){
		List<Locations> locations = locationRepo.findAll();
		return locations;
	}
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable("id") long id) {
		locationRepo.deleteById(id);
		
	}
	
	@PostMapping
	public void saveLocation(@RequestBody Locations location) {
		locationRepo.save(location);
}

	@PutMapping
	public void updateLocation(@RequestBody Locations location) {
		locationRepo.save(location);
}	
	
}
