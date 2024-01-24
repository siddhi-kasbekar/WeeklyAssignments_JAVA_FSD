package com.hexaware.casestudy.dao;

import java.util.List;

import com.hexaware.casestudy.model.Restaurant;


public interface IRestaurantDao {
	public boolean insertRestaurant(Restaurant restaurant);

	public boolean updateRestaurant(Restaurant restaurant);

	public boolean deleteRestaurantById(int cid);

	public List<Restaurant> selectRestaurantByLocation(String location);

	public List<Restaurant> selectAll();

}
