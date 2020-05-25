package com.sagar.web.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericException extends Exception{
	
	private String errorCode;
	private String errorDesc;
	private String errorSource;

}
