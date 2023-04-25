package com.udemy.cursojava.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resorce Not Found. Id " + id);
	}
}
