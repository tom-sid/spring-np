package com.example.demowebnp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
	private static Logger log = LoggerFactory.getLogger(SignupController.class);

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String doSignup(@RequestParam String email, @RequestParam String name, @RequestParam String password) {

		log.info("Email: " + email + " Name: " + name + " Password: " + password);

		return "redirect:/";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		return "signup";
	}
}
