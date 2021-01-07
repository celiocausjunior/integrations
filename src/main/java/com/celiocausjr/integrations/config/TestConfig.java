package com.celiocausjr.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.celiocausjr.integrations.services.EmailService;
import com.celiocausjr.integrations.services.MockEmailService;

@Configuration

@Profile("test")
public class TestConfig {
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
