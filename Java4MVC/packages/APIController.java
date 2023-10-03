package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	// OPTION 1
	@Autowired
	private TripService tripService;
	
	
	// OPTION 2
//	private final TripService tripService;
//	
//	public APIController(TripService tripService) {
//		this.tripService = tripService;
//	}
	
	// find all trips
	@GetMapping("/trips")
	public List<Trip> getAllTrips(){
		return tripService.allTrips();
	}
	
	// create a trip
	@PostMapping("/trips/new")
	public Trip createTrip(@ModelAttribute("newTrip") Trip newTrip
			) {
		/*
		 * behind the scene:
		 * 1. create an empty Trip (new Trip()) 
		 * 2. setLocation, setDescription -- according to our setters & RequestParams
		 */
		return tripService.createTrip(newTrip);
	}
	
	// create a trip
//	@PostMapping("/trips/new")
//	public Trip createTrip(
//			@RequestParam("location") String location,
//			@RequestParam("tripLength") Integer tripLength,
//			@RequestParam("description") String description
//			) {
//		Trip newTrip = new Trip();
//		newTrip.setLocation(location);
//		newTrip.setDescription(description);
//		newTrip.setTripLength(tripLength);
////		Trip newTrip = new Trip(location, tripLength, description);
//		return tripService.createTrip(newTrip);
//	}
//	
	
	
	
	// find one trip by id
	@GetMapping("/trips/{id}")
	public Trip findTripById(
			@PathVariable("id") Long id) {
		return tripService.findTrip(id);
	}
	
	// update one trip -- find that trip by ID, update all info with formData
	@PutMapping("/trips/{id}")
	public Trip updateTripById(
			@PathVariable("id") Long id,
			@ModelAttribute("trip") Trip trip
			) {
		return tripService.updateTrip(trip);
	}
	
	
//	
//	@PutMapping("/trips/{id}")
//	public Trip updateTripById(
//			@PathVariable("id") Long id,
//			@RequestParam("location") String location,
//			@RequestParam("tripLength") Integer tripLength,
//			@RequestParam("description") String description
//			) {
//		// get the target trip by id
//		Trip trip = tripService.findTrip(id);
//		trip.setLocation(location);
//		trip.setDescription(description);
//		trip.setTripLength(tripLength);
//		return tripService.updateTrip(trip);
//	}
	
	@DeleteMapping("/trips/{id}")
	public void deleteTripById(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
	}
	
}









