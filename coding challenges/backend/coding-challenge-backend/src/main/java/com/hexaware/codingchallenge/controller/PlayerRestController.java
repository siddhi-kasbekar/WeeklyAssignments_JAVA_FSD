package com.hexaware.codingchallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.codingchallenge.dto.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.service.IPlayerService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/player-management")
public class PlayerRestController {
	
	@Autowired
	IPlayerService playerService;
	
	@PostMapping("/register")
	public Player addPlayer( @RequestBody @Valid PlayerDTO playerDTO) {
		return playerService.addPlayer(playerDTO);
		
	}
	
	@PutMapping("/update-info/{playerId}")
	public Player updatePlayer( @PathVariable long playerId ,@RequestBody  PlayerDTO playerDTO) throws PlayerNotFoundException {
		return playerService.updatePlayer(playerId, playerDTO);
		
	}
	
	@DeleteMapping("/delete/{playerId}")
	public String deletePlayerById(@PathVariable long playerId) throws PlayerNotFoundException {
		
		playerService.deleteById(playerId);
		return "player deleted successfully";
		
	}
	
	@GetMapping("/get-player/{playerId}")
	public Player getPlayerById( @PathVariable  long  playerId) throws PlayerNotFoundException {
		return playerService.getById(playerId);
		
	}
	
	
	
	@GetMapping("/getall")
	public List<Player> getAll(){
		return playerService.getAll();
		
	}
	
	@GetMapping("/getbyrange/{min}/{max}")
	public List<Player> getByMatchesRange(@PathVariable int  min , @PathVariable int max){
		
			return playerService.getByMatchesRange(min,max);

	
		
	}
	
	
	
	
	

}
