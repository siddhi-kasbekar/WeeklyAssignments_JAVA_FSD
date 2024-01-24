package com.hexaware.casestudy.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.casestudy.model.Restaurant;


@Repository
public class RestaurantDaoImpl implements IRestaurantDao{
	
	JdbcTemplate jdbcTemplate ;

	
	@Autowired
	public RestaurantDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
		
		
	}

	@Override
	public boolean insertRestaurant(Restaurant restaurant) {
		String insertQuery = "INSERT INTO Restaurants (RestaurantName, Location, ContactNumber, Rating) VALUES(?,?,?,?)";
		int count = jdbcTemplate.update(insertQuery,restaurant.getResName(),restaurant.getLocation(),restaurant.getContactNo(),restaurant.getRating());

		return count > 0;
	}

	@Override
	public boolean updateRestaurant(Restaurant restaurant) {

		String updateQuery = "update restaurants set  RestaurantName=?, Location=?,ContactNumber=?, Rating=? where RestaurantID=? ";
		int count = jdbcTemplate.update(updateQuery,restaurant.getResName(),restaurant.getLocation(),restaurant.getContactNo(),restaurant.getRating(),restaurant.getResId());

		return count > 0;	
		}

	@Override
	public boolean deleteRestaurantById(int resId) {

		String deleteQuery = "delete from restaurants where RestaurantID=?";
		int count = jdbcTemplate.update(deleteQuery,resId);

		return count>0;
		}

	@Override
	public List<Restaurant> selectRestaurantByLocation(String location) {

		String selectByLocation = "select * from restaurants where Location= ? ";
		List<Restaurant> list = jdbcTemplate.query(selectByLocation,ps -> ps.setString(1, location),new RestaurantMapper());
		
		return list;
	}

	@Override
	public List<Restaurant> selectAll() {

		String selectAll = "select RestaurantID,RestaurantName,Location, ContactNumber, Rating  from restaurants";
		List<Restaurant> list = jdbcTemplate.query(selectAll,new RestaurantMapper());
		return list;
	}

}
