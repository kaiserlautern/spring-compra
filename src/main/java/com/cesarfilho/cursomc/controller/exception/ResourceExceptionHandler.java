package com.cesarfilho.cursomc.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cesarfilho.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	 
	    @ExceptionHandler(ObjectNotFoundException.class)
	    protected ResponseEntity<Object> objectNotFound(
	      ObjectNotFoundException ex, WebRequest request) {
	        String bodyOfResponse = "This should be application specific";
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(bodyOfResponse);
	    }
	
}