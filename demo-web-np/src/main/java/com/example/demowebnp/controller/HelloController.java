package com.example.demowebnp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", messageSource.getMessage("name", null, LocaleContextHolder.getLocale()));

		Object[] addresses = { "Austin", "Dallas" };
		model.addAttribute("address", messageSource.getMessage("address", addresses, LocaleContextHolder.getLocale()));

		return "hello";
	}
}
