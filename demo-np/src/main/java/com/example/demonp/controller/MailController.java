package com.example.demonp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demonp.service.MailSender;
import com.example.demonp.service.StubMailSender;

@RestController
public class MailController {
	private MailSender mailSender = new StubMailSender();

	@RequestMapping("/mail")
	public String mail() {

		mailSender.send("mail@example.com", "A test mail", "This is some sample text");
		return "Sent mail!";
	}
}
