package com.hexaware.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.assignment.entities.Restaurant;

@Repository

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	
	@Modifying
	@Query("delete from Restaurant r where r.resName=?1")
	int deleteByName(String resName);

}
