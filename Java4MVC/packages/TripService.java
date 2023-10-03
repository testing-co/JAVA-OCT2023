package com.heidichen.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.repositories.TripRepository;

@Service
public class TripService {
	
	private final TripRepository tripRepo;
	
	public TripService(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}
	
	// return all the trips
	public List<Trip> allTrips(){
		return tripRepo.findAll();
	}
	
	// create a trip
	public Trip createTrip(Trip newTrip) {
		return tripRepo.save(newTrip);
	}
	
	// find one
	
	
	// update
	
	// delete
	
}
