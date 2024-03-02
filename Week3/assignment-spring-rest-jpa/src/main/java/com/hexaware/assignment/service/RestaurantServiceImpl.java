package com.hexaware.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.assignment.entities.Restaurant;
import com.hexaware.assignment.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements IRestaurantService {
	
	@Autowired
	RestaurantRepository repo;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {

		return repo.save(restaurant);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {

		return repo.save(restaurant);
	}

	@Override
	public Restaurant getResById(long resid) {

		return repo.findById(resid).orElse(null);
	}

	@Override
	public String deleteRestaurant(long resid) {

		repo.deleteById(resid);
		return "record deleted" ;
	}

	@Override
	public List<Restaurant> getAll() {

		return repo.findAll();
	}

	@Override
	public int deleteByName(String resName) {
		return repo.deleteByName(resName);
	}

}
