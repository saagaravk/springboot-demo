package com.sagar.web.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "Product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 87080941912061935L;
	public Product(Long pid, String name, String description, Category category) {
		super();
		this.pid = pid;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	
	public Product() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	
	private String name;
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;	
}
