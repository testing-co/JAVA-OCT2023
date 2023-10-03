package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@RestController
@RequestMapping("/api")
public class APIController {
	private final TripService tripService;
	
	public APIController(TripService tripService) {
		this.tripService = tripService;
	}
	
	// find all trips
	@GetMapping("/trips")
	public List<Trip> getAllTrips(){
		return tripService.allTrips();
	}
	
	// create a trip
	@PostMapping("/trips/new")
	public Trip createTrip(
			@RequestParam("location") String location,
			@RequestParam("tripLength") Integer tripLength,
			@RequestParam("description") String description
			) {
		Trip newTrip = new Trip(location, tripLength, description);
		return tripService.createTrip(newTrip);
	}
	
	
}
