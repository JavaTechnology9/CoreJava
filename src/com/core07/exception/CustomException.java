package com.core07.exception;

public class CustomException extends Exception{
	private String message;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomException() {
		super();
	}
	public CustomException(String message) {
		super(message);
		this.message=message;
				
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		String s = getClass().getName();
        String message = getLocalizedMessage();
		return s +": [message=" + message + "]";
	}
	
	

}
