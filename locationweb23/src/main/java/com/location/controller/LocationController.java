package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.LocationData;
import com.location.entities.Locations;
import com.location.services.LocationService;
import com.location.utilities.EmailService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	@Autowired
	private EmailService emailService;

	@RequestMapping("/saveLocation")
	public String showSaveLocationPage() {
		return "saveLocation";
	}
	
	@RequestMapping("/saveLocationData")
	public String saveLocationDetails(@ModelAttribute("location") Locations location, ModelMap modelMap) {
		locationService.saveLocation(location);
		emailService.sendSimpleMessage("learnlisten985@gmail.com", "Welcome  Email", "Location is saved!! thanks for adding a new location");
		modelMap.addAttribute("msg", "Location is saved!!");
		return "saveLocation";
	}
	
//	@RequestMapping("/saveLocationData")
//	public String saveLocationDetails(@RequestParam("id") long id, @RequestParam("code") String codes, @RequestParam("name") String name, @RequestParam("type") String type ) {
//		Locations location = new Locations();
//		location.setId(id);
//		location.setCode(codes);
//		location.setName(name);
//		location.setName(type);
//		
//		locationService.saveLocation(location);
//		return "saveLocation";
//	}
	
	//DTO - data transfer object
	
//	@RequestMapping("/saveLocationData")
//	public String saveLocationDetails(LocationData data) {
//		Locations location = new Locations();
//		location.setId(data.getId());
//		location.setCode(data.getCode());
//		location.setName(data.getName());
//		location.setType(data.getType());
//		
//		locationService.saveLocation(location);
//		return "saveLocation";
//	}
	
	@RequestMapping("/allLocations")
	public String getAllLocations() {
		List<Locations> locations = locationService.getLocations();
		System.out.println(locations);
		return "saveLocation";
	}
	
	}
