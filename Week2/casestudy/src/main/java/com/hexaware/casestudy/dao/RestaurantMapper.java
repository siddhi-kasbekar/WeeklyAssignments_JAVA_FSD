package com.hexaware.casestudy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.casestudy.model.Restaurant;

public class RestaurantMapper  implements RowMapper<Restaurant> {

	@Override
	public Restaurant mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Restaurant restaurant = new Restaurant();
		restaurant.setResId(rs.getInt("RestaurantID"));
		restaurant.setResName(rs.getString("RestaurantName"));
		restaurant.setLocation(rs.getString("Location"));
		restaurant.setContactNo(rs.getString("ContactNumber"));
		restaurant.setRating(rs.getBigDecimal("Rating"));

		
		return restaurant;
	}

}
