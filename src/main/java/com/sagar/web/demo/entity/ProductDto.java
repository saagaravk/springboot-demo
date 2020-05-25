package com.sagar.web.demo.entity;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 87080941912061935L;
	
	private Long pid;
	
	@NotBlank(message = "Name should not be blank")
	private String name;
	private String description;
	private CategoryDto category;	
}
