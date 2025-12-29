package com.dhl.dhltalentlinkapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class EmailServiceConfig {

	@Value("${from.email.address}")
	private String fromEmailAddress;

	@Autowired
	private JavaMailSender mailSender;

	@Async
	public void sendEmail(String[] recipient, String subject, String content, Set<String> attachMentListSet)
			throws UnsupportedEncodingException, MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(fromEmailAddress, "no-reply@tlk-prod.atalent.me");
		helper.setTo(recipient);		
		helper.setSubject(subject);
		helper.setText(content, true);		
		if(attachMentListSet!=null) {
		attachMentListSet.forEach(filename->{
			FileSystemResource file = new FileSystemResource(filename);
			try {
				helper.addAttachment(file.getFilename(), file);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		});
		}
		mailSender.send(message);
	}

}