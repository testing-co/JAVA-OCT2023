package com.heidichen.springjspdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@RequestMapping("/test")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/option1") // Default: GET
	public String requestOption1() {
		return "RequestMapping option1";
	}
	
	@RequestMapping(value="/option2", method=RequestMethod.GET) // Request: get, post, put, patch, delete .
	public String requestOption2() {
		return "RequestMapping option2";
	}
	
	@GetMapping("/option3") // GetMapping, PostMapping, PutMapping, DeleteMapping
	public String requestOption3() {
		return "RequestMapping option3: GetMapping";
	}
	
	// http://localhost:8080/api/search?festival=halloween
	@GetMapping("/search")
	public String searchFestival(@RequestParam(value="festival")String festivalStoredInMethod) {
		return "You searched for the festival: " + festivalStoredInMethod;
	}
	
	// localhost:8080/api/pet?name=pepper&age=14
	@GetMapping("/pet")
	public String searchPet(@RequestParam(value="name")String name, @RequestParam(value="age", required=false)Integer age) {
		if(age ==null) {
			return name + " has an unknown age";
		}
		return "Pet name: "+ name + " | Age: "+ age;
	}
	
	// localhost:8080/api/activity/karaoke
	@GetMapping("/activity/{activityInPath}")
	public String showActivity(@PathVariable("activityInPath") String activityInMethod) {
		return "Activity: " +activityInMethod;
	}
	
}





