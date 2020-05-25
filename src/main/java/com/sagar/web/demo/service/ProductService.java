package com.sagar.web.demo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Cacheable;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.web.demo.entity.Product;
import com.sagar.web.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ProductService.class);

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		LOGGER.info("fetching all productss");
		
		List<Product> products = productRepository.findAll();
		
		return products;
	}

	public Product getProduct(Long productId) {
		Optional<Product> product = productRepository.findById(productId);
		if (product.isPresent()) {
			return product.get();
		}
		return null;
	}

	public Product getProduct(String productName) {
		Optional<Product> product = productRepository.findByName(productName);
		if (product.isPresent()) {
			return product.get();
		}
		return null;
	}

	public Product addProduct(Product product){
		Product prod = productRepository.save(product);
		return prod;
	}
	
	
	  public Product updateProduct(Product product) { 
		  Product prod = productRepository.save(product); 
	  return prod; }
	 

}
