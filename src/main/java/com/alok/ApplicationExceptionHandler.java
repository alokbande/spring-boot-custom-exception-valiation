package com.alok;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> getMethodArgumentNotValidException(MethodArgumentNotValidException exp) {
		Map<String, String> map = new HashMap<String, String>();
		exp.getBindingResult().getFieldErrors().forEach(e -> map.put(e.getField(), e.getDefaultMessage()!=null ? e.getDefaultMessage() : e.getCode()));
		
		return map;
	}
}
