package com.celiocausjr.integrations.services;

import com.celiocausjr.integrations.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
