package com.hexaware.codingchallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.codingchallenge.entity.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	

	@Query("select p from Player p where p.totalMatches BETWEEN ?1 and ?2")
	List<Player> findByMatchesRange(int min, int max);
	

	

}
