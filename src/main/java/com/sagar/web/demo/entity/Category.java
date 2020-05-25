package com.sagar.web.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long cid;
	public Category(Long cid, String name, String description) {
		super();
		this.cid = cid;
		this.name = name;
		this.description = description;
	}
	
	public Category() {
		}
	private String name;
	private String description;
}
