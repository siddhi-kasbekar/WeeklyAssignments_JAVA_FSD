package com.hexaware.codingchallenge.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity

public class Player {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long playerId;
	
	@NotBlank(message = "player name is required")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "player name should contain only alphabets")
	String playerName;
	
	@NotNull
	int jerseyNumber;
	
	@NotBlank(message = "role is required")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid role")
	String role;
	
	@NotNull
	@Digits(integer = 5,fraction=0)
	int totalMatches;
	
	@NotBlank(message = "team name is required")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid team name")
	String teamName;
	
	@NotBlank(message = "country name is required")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid country name")
	String countryName;
	
	String description;

	public Player() {
		super();
	}

	public Player(long playerId,
			@NotBlank(message = "player name is required") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "player name should contain only alphabets") String playerName,
			@NotNull @Pattern(regexp = "^[0-9]$", message = "enter valid jersey number") int jerseyNumber,
			@NotBlank(message = "role is required") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid role") String role,
			@NotNull @Pattern(regexp = "^[0-9]$", message = "enter valid input") int totalMatches,
			@NotBlank(message = "team name is required") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid team name") String teamName,
			@NotBlank(message = "country name is required") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "enter valid country name") String countryName,
			String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
