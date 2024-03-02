package com.hexaware.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.assignment.entities.Restaurant;

@SpringBootTest
class RestaurantServiceImplTest {
	
	@Autowired
	IRestaurantService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddRestaurant() {
		Restaurant res = new Restaurant();
		res.setResId(103);
		res.setResName("zorba");
		res.setLocation("kop");
		res.setContactNo("3882445566");
		res.setRating(BigDecimal.valueOf(3.5));
		
		Restaurant r1 = service.addRestaurant(res);
		assertEquals(103, r1.getResId());
	}

	@Test
	void testUpdateRestaurant() {
		Restaurant res = new Restaurant();
		res.setResId(101);
		res.setResName("Kshatriya");
		res.setLocation("kolhapur");
		res.setContactNo("3322445566");
		res.setRating(BigDecimal.valueOf(4.5));
		
		Restaurant r1 = service.updateRestaurant(res);
		assertEquals("Kshatriya", r1.getResName());
	}

	@Test
	void testGetResById() {
		Restaurant res = service.getResById(103);
		assertNotNull(res);
	}

	@Test
	void testDeleteRestaurant() {
		String result = service.deleteRestaurant(102);
		assertNotNull(result);
	}

	@Test
	void testGetAll() {
		List<Restaurant> list = service.getAll();
		boolean isEmpty = list.isEmpty();
		assertFalse(isEmpty);
	}

}
