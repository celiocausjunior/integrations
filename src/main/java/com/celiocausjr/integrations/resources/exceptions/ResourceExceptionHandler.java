package com.celiocausjr.integrations.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.celiocausjr.integrations.services.exceptions.EmailException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(EmailException.class)
	public ResponseEntity<StandardError> email(EmailException email, HttpServletRequest request){
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), "Email Error", email.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
