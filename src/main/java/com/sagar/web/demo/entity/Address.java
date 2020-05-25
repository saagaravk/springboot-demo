package com.sagar.web.demo.entity;

import com.sagar.web.demo.dto.AddressType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {

	private String housenum;
	private String addressLine1;
	private String addressLine2;
	private String landmark;
	private String city;
	private AddressType type;
}
