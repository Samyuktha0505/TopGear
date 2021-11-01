package com.wipro.springtopgear.ioc.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * playerId -> String -> P001
 * playerName -> String -> Sachin
 * country -> Object -> of type ‘Country’ 
 * @author SamyuTilak
 *
 */
@Component
public class Player {

	private String playerId;
	private String playerName;
	private Country country;
	
	public Player(Country country) {
		this.country= country;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Country getCountry() {
		return country;
	}	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	}


	
}
