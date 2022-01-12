package com.aprende.rest.webservice.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExcepction extends RuntimeException {

	private static final long serialVersionUID = -3728415004612882585L;

	public UserNotFoundExcepction(String message) {
		super(message);
	}

}
