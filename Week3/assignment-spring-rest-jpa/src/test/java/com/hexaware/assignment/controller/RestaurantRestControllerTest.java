package com.hexaware.assignment.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.assignment.entities.Restaurant;


@SpringBootTest
class RestaurantRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
@Disabled
	@Test
	void testAddRestaurant() {
		Restaurant res = new Restaurant(104, "Ramkrishna", "Pune", "7733554466", BigDecimal.valueOf(3.5));
		ResponseEntity<Restaurant> response = 
				restTemplate.postForEntity("http://localhost:8080/api/restaurants/add", res, Restaurant.class);
		response.getBody();
		assertEquals(104, res.getResId());
		
	}

@Disabled
	@Test
	void testUpdateRestaurant() {
		Restaurant res = new Restaurant(104, "Ramkrishna", "Kolhapur", "7733554466", BigDecimal.valueOf(3.5));
		 
				restTemplate.put("http://localhost:8080/api/restaurants/update", res);
				assertTrue(true);
		
		

	}

	@Test
	void testGetResById() {
		int resid = 101;
		 ResponseEntity<Restaurant> response = 
				 restTemplate.getForEntity("http://localhost:8080/api/restaurants/getbyid/"+resid, Restaurant.class);
		 
		 Restaurant res =  response.getBody();
		assertNotNull(res);

	}

	@Disabled
	@Test
	void testDeleteResById() {
		int resid = 103;
		restTemplate.delete("http://localhost:8080/api/restaurants/delete/"+resid);
		assertTrue(true);

	}

	
	@Test
	void testGetAllRestaurant() {
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/api/restaurants/getall", List.class);
		List<Restaurant> list = response.getBody();
		assertTrue(list.size()>0);

	}

}
