package com.hexaware.assignment.service;

import java.util.List;

import com.hexaware.assignment.entities.Restaurant;

public interface IRestaurantService {
	
	public Restaurant addRestaurant(Restaurant restaurant);
	
	public Restaurant updateRestaurant(Restaurant restaurant);
	
	public Restaurant getResById(long resid);
	
	public String deleteRestaurant(long resid);
	
	public List<Restaurant> getAll();
	
	public int deleteByName(String resName);
	

	
	

}
