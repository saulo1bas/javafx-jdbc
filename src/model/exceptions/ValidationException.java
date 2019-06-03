package model.exceptions;

import java.util.HashMap;

public class ValidationException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HashMap<String, String> errors = new HashMap<String, String>();
	
	public ValidationException(String msg) {
		super(msg);
	}

	public HashMap<String, String> getErrors() {
		return errors;
	}

	public void addError(String fieldName,String errorMessage) {
		errors.put(fieldName, errorMessage);
		
	}
	
	
}
