package com.sagar.web.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.Nullable;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sagar.web.demo.dto.BaseDto;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ Exception.class })
	@Nullable
	public ResponseEntity<Object> handleExceptionExt(Exception ex, WebRequest request) throws Exception {
		BaseDto dto = new BaseDto();
		dto.setStatus("Something went wrong, please contact HelpDesk");
		dto.setErrorMessage(ex.getMessage());
		dto.setStatus("Failure");
		return new ResponseEntity<Object>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BaseDto dto = new BaseDto();
		dto.setStatus("Media type is not correct, please assign proper value");
		dto.setErrorMessage(ex.getMessage());
		return new ResponseEntity<Object>(dto, status);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BaseDto dto = new BaseDto();
		dto.setStatus("Request is not correct");
		dto.setErrorMessage(ex.getMessage());
		return new ResponseEntity<Object>(dto, status);
	}
}
