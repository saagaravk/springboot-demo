package com.sagar.web.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.sagar.web.demo.repository.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
	@Mock
	private ProductRepository productRepository;
	@InjectMocks
	private ProductService productService;

	@Test
	public void testGetProductLong() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetProductString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
