package com.hexaware.codingchallenge.service;

import java.util.List;

import com.hexaware.codingchallenge.dto.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;
import com.hexaware.codingchallenge.exception.InvalidRangeException;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;

public interface IPlayerService {
	
	public Player addPlayer(PlayerDTO playerDTO);
	
	public Player updatePlayer(long playerId, PlayerDTO playerDTO) throws PlayerNotFoundException;
	
	public Player getById(long playerId)  throws PlayerNotFoundException;
	
	public String deleteById(long playerId)  throws PlayerNotFoundException;
	
	public List<Player> getAll();
	
	public List<Player> getByMatchesRange(int min, int max) throws InvalidRangeException;
	
	


}
