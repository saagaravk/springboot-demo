package com.sagar.web.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sagar.web.demo.dto.AddressType;
import com.sagar.web.demo.entity.Address;
import com.sagar.web.demo.entity.User;

public class ProductTest {

	public static void main(String[] args) {
		/*
		 * Product product = Product.builder(). name("Lux"). description("Soap").
		 * category(Category.builder().description("Health_Care").name("health").build()
		 * ).build();
		 */
		User user = new User();
		user.setId(1);
		user.setName("Sagar");
		Address address = new Address();
		address.setHousenum("034");
		address.setAddressLine1("akshay nagar");
		address.setCity("blr");
		address.setType(AddressType.HOME);
		user.setAddress(address);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String userS = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(userS);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
