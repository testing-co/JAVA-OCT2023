package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@Controller
public class TripController {

	@Autowired
	private TripService tripService;

	@GetMapping("/trips")
	public String tripDashboard(Model model) {
		// 1. get the list of trips from service
		List<Trip> tripList = tripService.allTrips();
		
		// 2. send the data to jsp
		model.addAttribute("tripList", tripList);
		return "tripDashboard.jsp";
	}
	
	@GetMapping("/trips/{id}")
	public String tripDetailsPage(@PathVariable("id")Long id, Model model) {
		// 1. make use of the id from path, get the trip info from service
		Trip oneTrip = tripService.findTrip(id);
		// 2. send the data to jsp
		model.addAttribute("oneTrip", oneTrip);
		return "tripDetails.jsp";
	}
	
}
