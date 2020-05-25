package com.sagar.web.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.web.demo.entity.Product;
import com.sagar.web.demo.entity.ProductDto;
import com.sagar.web.demo.service.ProductService;

@RestController
@RequestMapping(value = "/products",consumes = "application/json")
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@PostMapping
	public ResponseEntity<ProductDto> addProduct(@Valid @RequestBody ProductDto productDto) {
	//	try {
			ModelMapper mapper = new ModelMapper();
			Product product = mapper.map(productDto, Product.class);
			Product addedProduct = productService.addProduct(product);
			ProductDto dto = mapper.map(addedProduct, ProductDto.class);
			return new ResponseEntity<ProductDto>(dto, HttpStatus.OK);
//		} catch (Exception e) {
//			ProductDto dto = new ProductDto();
//			dto.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
//			return new ResponseEntity<ProductDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
//			
//		}
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id)
	{
		return productService.getProduct(id);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product)
	{
		return productService.updateProduct(product);
	}
	
	
	
	
}
