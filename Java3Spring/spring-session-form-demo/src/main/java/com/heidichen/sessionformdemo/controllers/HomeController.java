package com.heidichen.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	// -------------- SESSION DEMO -----------------
	
	// read & set session
	@GetMapping("/sessions/home")
	public String sessionHome(HttpSession session) {
		if(session.getAttribute("count") == null) {
			// set the session if it is not available
			session.setAttribute("count", 1);
		}else {
			// set session attribute to count +1 (count++)
			Integer countFromSession = (Integer) session.getAttribute("count"); // everything stored in session is Object
			session.setAttribute("count", countFromSession + 1);
		}
		return "sessions/home.jsp"; // path for the html file
	}
	
	
	// display session (will not alter the session)
	@GetMapping("/sessions/display")
	public String sessionDisplay() {
		return "sessions/display.jsp";
	}
	
	

	// -------------- SEARCH FORM DEMO -----------------
	@GetMapping("/search/form")
	public String searchForm() {
		return "searchForm/form.jsp";
	}
	
	@GetMapping("/search/display")
	public String searchDisplay(@RequestParam("keyword")String keyword, Model model) {
		model.addAttribute("keyword", keyword);
		return "searchForm/display.jsp";
	}
	
	// --------------- Review form demo (POST METHOD FORM) -------------
	// SHOW THE FORM 
	@GetMapping("/review/form")
	public String reviewForm() {
		return "reviewForm/form.jsp";
	}
	
	// process the form
	@PostMapping("/review/process")
	public String processingReviewForm(
			@RequestParam("title") String title,
			@RequestParam("reviewer") String reviewer,
			@RequestParam("rating") Integer rating,
			@RequestParam("description") String description,
			HttpSession session
			) {
		session.setAttribute("title", title);
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("rating", rating);
		session.setAttribute("description", description);
		return "redirect:/review/display";
	}
	
	@GetMapping("/review/display")
	public String displayForm() {
		return "reviewForm/display.jsp";
	}
	
	
	
	
	
	
}
