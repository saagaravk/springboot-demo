package com.sagar.web.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sagar.web.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findByName(String productName);
	
	/*
	 * @Query("select e from Product,Category c where e.name=:productName")
	 * List<Product> findBysomeSpecial(String productName);
	 * 
	 * 
	 * Product update(Product product);
	 */

}