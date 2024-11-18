package com.library.exception;

public class NoBooksExistException extends Exception {
	
	public NoBooksExistException() {
		
	}
	
	public NoBooksExistException(String message)
	{
		super(message);
	}

}
