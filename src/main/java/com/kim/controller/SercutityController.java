package com.kim.controller;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SercutityController {

	@GetMapping("/security/all")
	public String all() {
		return "home";
	}
	
	@GetMapping("/home")
	public String login() {
		return "/home";
	}
	
	@GetMapping("/security/accessError")
	public String error(AuthenticationSuccessHandler auth, Model model) {
		
		model.addAttribute("msg", "Access Demoed");
		
		return "/";
	}
}
