package com.example.demonp.service;

public interface MailSender {
	public void send(String to, String subject, String body);
}
