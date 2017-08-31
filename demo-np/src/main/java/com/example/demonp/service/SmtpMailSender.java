package com.example.demonp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("smtp")
@Qualifier("smtpMail")
public class SmtpMailSender implements MailSender {
	private static Logger log = LoggerFactory.getLogger(SmtpMailSender.class);
	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending SMTP mail to " + to);
		log.info("with subject " + subject);
		log.info("and body " + body);
	}

}
