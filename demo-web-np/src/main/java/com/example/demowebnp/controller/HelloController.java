package com.example.demowebnp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demowebnp.configuration.MessageUtils;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", MessageUtils.getMessage("name", "Robert"));

		model.addAttribute("address", MessageUtils.getMessage("address", "Houston", "Tulsa"));

		return "hello";
	}
	
	@RequestMapping("/hello/{id}")
	public String helloId(Model model, @PathVariable("id") String id, @RequestParam("name") String name) {

		model.addAttribute("id", id);
		
		model.addAttribute("name", name);

		model.addAttribute("address", MessageUtils.getMessage("address", "Austin", "Dallas"));

		return "hello-id";
	}
}
