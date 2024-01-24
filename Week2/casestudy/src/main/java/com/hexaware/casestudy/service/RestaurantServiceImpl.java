package com.hexaware.casestudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.casestudy.dao.IRestaurantDao;
import com.hexaware.casestudy.model.Restaurant;

@Service
public class RestaurantServiceImpl implements IRestaurantService{
	
	@Autowired
	IRestaurantDao dao;

	@Override
	public boolean insertRestaurant(Restaurant restaurant) {

		return dao.insertRestaurant(restaurant);
	}

	@Override
	public boolean updateRestaurant(Restaurant restaurant) {
		

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
