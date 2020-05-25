package com.sagar.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.web.demo.entity.Category;
import com.sagar.web.demo.service.CategoryService;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping()
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
}
