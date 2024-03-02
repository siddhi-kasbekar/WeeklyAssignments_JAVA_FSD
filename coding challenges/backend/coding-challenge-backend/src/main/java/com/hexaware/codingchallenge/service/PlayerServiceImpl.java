package com.hexaware.codingchallenge.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.codingchallenge.dto.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;
import com.hexaware.codingchallenge.exception.InvalidRangeException;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	PlayerRepository playerRepo;

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {

		Player player = new Player();
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());

		return playerRepo.save(player);
	}

	@Override
	public Player updatePlayer(long playerId, PlayerDTO playerDTO) throws PlayerNotFoundException {

		Player player = playerRepo.findById(playerId)
				.orElseThrow(() -> new PlayerNotFoundException("player not found"));

		if (playerDTO.getJerseyNumber() != 0) {
			player.setJerseyNumber(playerDTO.getJerseyNumber());
		}
		if (playerDTO.getTotalMatches() != 0) {
			player.setTotalMatches(playerDTO.getTotalMatches());
		}
		player.setPlayerName(Objects.requireNonNullElse(playerDTO.getPlayerName(), player.getPlayerName()));
		player.setRole(Objects.requireNonNullElse(playerDTO.getRole(), player.getRole()));
		player.setTeamName(Objects.requireNonNullElse(playerDTO.getTeamName(), player.getTeamName()));
		player.setCountryName(Objects.requireNonNullElse(playerDTO.getCountryName(), player.getCountryName()));
		player.setDescription(Objects.requireNonNullElse(playerDTO.getDescription(), player.getDescription()));

		playerRepo.save(player);

		return player;
	}

	@Override
	public Player getById(long playerId) throws PlayerNotFoundException {

		return playerRepo.findById(playerId).orElseThrow(() -> new PlayerNotFoundException("player not found"));
	}

	@Override
	public String deleteById(long playerId) throws PlayerNotFoundException {

		if (playerRepo.existsById(playerId)) {
			playerRepo.deleteById(playerId);
			return "player deleted";

		} else {
			throw new PlayerNotFoundException("player not found");
		}

	}

	@Override
	public List<Player> getAll() {
		return playerRepo.findAll();
	}

	@Override
	public List<Player> getByMatchesRange(int min, int max) throws InvalidRangeException{
		List<Player> players = null;
		
		if(min < max) {
			players =  playerRepo.findByMatchesRange(min, max);

			
		}
		else {
			
			throw new InvalidRangeException("second value must be greater than first  ");			
			
		}
		
		return players;
		
	}

	

}
