package com.sm.exceptions;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> UserExceptionHandler(UserException ue,WebRequest req){
		ErrorDetails err = new ErrorDetails(ue.getMessage(), req.getDescription(false), LocalDateTime.now());
		return new  ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException me,WebRequest req){
		ErrorDetails err = new ErrorDetails(me.getBindingResult().getFieldError().getDefaultMessage(),"validation error",LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> otherExceptionHandler(Exception e,WebRequest req){
		ErrorDetails err= new ErrorDetails(e.getMessage(),req.getDescription(false),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	

}
