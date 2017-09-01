package com.example.demowebnp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demowebnp.configuration.MessageUtils;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", MessageUtils.getMessage("name", "Robert"));

		model.addAttribute("address", MessageUtils.getMessage("address", "Houston", "Tulsa"));

		return "hello";
	}
}
