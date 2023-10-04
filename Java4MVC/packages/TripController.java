package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

import jakarta.validation.Valid;

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
	
	
	@GetMapping("/trips/new")
	public String renderCreateForm(Model model) {
		Trip newTrip = new Trip();
		model.addAttribute("newTrip", newTrip);
		return "newTripForm.jsp";
	}
	
	@PostMapping("/trips/new")
	public String processCreateForm(@Valid @ModelAttribute("newTrip") Trip newTrip, BindingResult result) {
		if(result.hasErrors()) {
			return "newTripForm.jsp";
		}else {
			tripService.createTrip(newTrip);
			return "redirect:/trips";
		}
	}
	
	// Render Edit form
	@GetMapping("/trips/{id}/edit")
	public String renderEditForm(@PathVariable("id")Long id, Model model) {
		// get the trip info by id
		Trip trip = tripService.findTrip(id);
		// store it in Model model
		model.addAttribute("trip", trip);
		return "editTripForm.jsp";
	}
	
	@PutMapping("/trips/{id}/edit")
	public String processEditForm(@Valid @ModelAttribute("trip")Trip trip, BindingResult result) {
		if(result.hasErrors()) {
			return "editTripForm.jsp";
		}else {
			tripService.updateTrip(trip);
			return "redirect:/trips";
		}
	}
	
	@DeleteMapping("/trips/{id}")
	public String processDelete(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
		return "redirect:/trips";
	}
	
}





