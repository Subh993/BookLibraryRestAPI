package com.library.exception;

public class BooksExistException extends Exception {
	
	public BooksExistException() {
		
	}
	
	public BooksExistException(String message)
	{
		super(message);
	}

}
