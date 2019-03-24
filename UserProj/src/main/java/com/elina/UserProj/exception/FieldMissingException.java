package com.elina.UserProj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class FieldMissingException extends RuntimeException {
    private String message;
    
    public FieldMissingException(){
        super();
    }
    public FieldMissingException(String message){
        super(message);
        this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
}
