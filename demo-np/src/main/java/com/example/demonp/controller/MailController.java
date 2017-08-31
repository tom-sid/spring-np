package com.example.demonp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demonp.service.MailSender;

@RestController
public class MailController {
	private MailSender mailSender;

	// optional @Autowired
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {

		mailSender.send("mail@example.com", "A test mail", "This is some sample text");
		return "Sent mail!";
	}
}
