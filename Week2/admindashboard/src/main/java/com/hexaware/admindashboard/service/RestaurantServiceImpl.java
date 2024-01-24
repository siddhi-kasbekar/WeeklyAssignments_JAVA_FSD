package com.hexaware.admindashboard.service;

import java.io.Serializable;
import java.util.List;

import com.hexaware.admindashboard.dao.IRestaurantDao;
import com.hexaware.admindashboard.dao.RestaurantDaoImpl;
import com.hexaware.admindashboard.model.Restaurant;

public class RestaurantServiceImpl  implements IRestaurantService{
	
	
	IRestaurantDao dao = new RestaurantDaoImpl();

	@Override
	public Serializable insertRestaurant(Restaurant restaurant) {

		return dao.insertRestaurant(restaurant);
	}

	@Override
	public Serializable updateRestaurant(Restaurant restaurant) {
		

		return dao.updateRestaurant(restaurant);
	}

	@Override
	public boolean deleteRestaurantById(int cid) {

		return dao.deleteRestaurantById(cid);
	}

	@Override
	public List<Restaurant> selectRestaurantByLocation(String location) {
		

		return dao.selectRestaurantByLocation(location);
	}

	@Override
	public List<Restaurant> selectAll() {

		return dao.selectAll();
	}

}
