package com.elina.UserProj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    String message;
    
    public UserNotFoundException(){
        super();
    }
    public UserNotFoundException(String message){
        super(message);
        this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
}
