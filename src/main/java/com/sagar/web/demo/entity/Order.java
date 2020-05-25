package com.sagar.web.demo.entity;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class Order {

	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Product> products;
	private User user;	
}
