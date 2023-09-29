package com.heidichen.springjspdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String jspHome() {
		return "home.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstlDemo(Model model) {
		Integer happiness = 10;
		Boolean isHungry = false;
		ArrayList<String> skills = new ArrayList<String>();
		skills.add("Sleep while standing");
		skills.add("Breaking the code");
		skills.add("Bootstrap");
		
		
		model.addAttribute("jspName", "Pepper");
		model.addAttribute("happiness", happiness);
		model.addAttribute("isHungry", isHungry);
		model.addAttribute("skills", skills);
		
		// in java syntax for reference - don't need it to work in jsp
		if(happiness > 5) {
			System.out.println("I am happy");
		}
		
		if(isHungry == true) {
			System.out.println("I am hungry");
		}else {
			System.out.println("I am NOT hungry");
		}
		
		for(String eachSkill : skills) {
			System.out.println(eachSkill);
		}
		
		
			
		return "jstl.jsp";
	}
	
	
	
	
	
	
	
}
