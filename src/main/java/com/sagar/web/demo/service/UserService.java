package com.sagar.web.demo.service;

import org.springframework.stereotype.Service;

import com.sagar.web.demo.entity.User;

@Service
public class UserService {

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
	public User addUser(User user){
		System.out.println("user is added "+user);
		return user;
	}

	/*
	 * public List<Product> addProduct(List<Product> products){ return
	 * categoryRepo.saveAll(products); }
	 */	
}
