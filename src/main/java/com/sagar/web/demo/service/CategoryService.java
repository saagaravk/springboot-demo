package com.sagar.web.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.web.demo.entity.Category;
import com.sagar.web.demo.entity.Product;
import com.sagar.web.demo.repository.CategoryRepository;
import com.sagar.web.demo.repository.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepo;
	
	/*
	 * public List<Product> getAllProducts(){ List<Product> products =
	 * categoryRepo.findAll(); return products; }
	 * 
	 * public Product getProduct(Long productId){ Optional<Product> product =
	 * categoryRepo.findById(productId); if(product.isPresent()) { return
	 * product.get(); } return null; }
	 * 
	 * public Product getProduct(String productName){ Optional<Product> product =
	 * categoryRepo.findByName(productName); if(product.isPresent()) { return
	 * product.get(); } return null; }
	 */
	public Category addCategory(Category category){
		return categoryRepo.save(category);
	}

	/*
	 * public List<Product> addProduct(List<Product> products){ return
	 * categoryRepo.saveAll(products); }
	 */	
}
