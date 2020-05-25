package com.sagar.web.demo.dto;

import lombok.Data;

@Data
public class BaseDto {

	private String errorMessage;
	private String status;
	private int errorCode;
}
