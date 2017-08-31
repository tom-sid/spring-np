package com.example.demonp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmtpMailSender implements MailSender {
	private static Logger log = LoggerFactory.getLogger(SmtpMailSender.class);
	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending SMTP mail to " + to);
		log.info("with subject " + subject);
		log.info("and body " + body);
	}

}
