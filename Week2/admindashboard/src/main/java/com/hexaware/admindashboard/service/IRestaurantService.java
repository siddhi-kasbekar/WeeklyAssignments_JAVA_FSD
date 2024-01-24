package com.hexaware.admindashboard.service;

import java.io.Serializable;
import java.util.List;

import com.hexaware.admindashboard.model.Restaurant;


public interface IRestaurantService {

	public Serializable insertRestaurant(Restaurant restaurant);

	public Serializable updateRestaurant(Restaurant restaurant);

	public boolean deleteRestaurantById(int cid);

	public List<Restaurant> selectRestaurantByLocation(String location);

	public List<Restaurant> selectAll();
}
