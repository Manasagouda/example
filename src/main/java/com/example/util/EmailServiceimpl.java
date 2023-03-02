package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceimpl implements EmailService {
	
	@Autowired
	private JavaMailSender sendMail;

	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(message);
		sendMail.send(mailMessage);
	}

}
