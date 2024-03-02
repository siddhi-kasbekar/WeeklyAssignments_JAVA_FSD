package com.hexaware.assignment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.assignment.entities.Restaurant;
import com.hexaware.assignment.service.IRestaurantService;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantRestController {
	

	Logger logger = LoggerFactory.getLogger(RestaurantRestController.class);

	
	@Autowired
	IRestaurantService service;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		logger.warn("warning from controller");
		return service.addRestaurant(restaurant);
		
	}
	
	@PutMapping("/update")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return service.updateRestaurant(restaurant);
	}
	
	@GetMapping("/getbyid/{resid}")
	public Restaurant getResById(@PathVariable long resid) {
		return service.getResById(resid);
	}
	
	@DeleteMapping("/delete/{resid}")
	public String deleteResById(@PathVariable long resid) {
		return service.deleteRestaurant(resid);
	}
	
	@GetMapping("getall")
	public List<Restaurant> getAllRestaurant(){
		return service.getAll();
	}
	
	@DeleteMapping("/deletebyname/{resname}")
	public String deleteResByEname(@PathVariable String resname) {
		int count =  service.deleteByName(resname);
		 return  count+" record deleted";
		
	}
	
}
