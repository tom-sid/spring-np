package com.example.demowebnp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demowebnp.model.User;

@Controller
public class SignupController {
	private static Logger log = LoggerFactory.getLogger(SignupController.class);

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String doSignup(@Validated User user, BindingResult result) {

		if (result.hasErrors()) {
			return "signup";
		}
		log.info("Email: " + user.getEmail() + " Name: " + user.getName() + " Password: " + user.getPassword());

		return "redirect:/";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
}
