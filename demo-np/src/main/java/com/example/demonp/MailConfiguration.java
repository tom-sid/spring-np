package com.example.demonp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demonp.service.MailSender;
import com.example.demonp.service.SmtpMailSender;
import com.example.demonp.service.StubMailSender;

@Configuration
public class MailConfiguration {
	@Bean
	public MailSender stubMailSender() {
		return new StubMailSender();
	}

	@Bean
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
}
