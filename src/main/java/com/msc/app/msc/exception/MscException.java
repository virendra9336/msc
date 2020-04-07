package com.msc.app.msc.exception;

public class MscException extends RuntimeException {
	
	public MscException(String message ,Long id) {
        super( message + id);
    }
	
	
	
}
