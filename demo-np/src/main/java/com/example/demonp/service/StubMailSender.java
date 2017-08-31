package com.example.demonp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("stub")
public class StubMailSender implements MailSender {

	private static Logger log = LoggerFactory.getLogger(StubMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending mock mail to " + to);
		log.info("with subject " + subject);
		log.info("and body " + body);
	}
}
