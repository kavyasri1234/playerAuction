package com.orchard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playerId;
	private String playerName;
	private String teamName;
	private double bindingBudget;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(Long playerId, String playerName, String teamName, double bindingBugdet, double bindingBudget) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamName = teamName;
		this.bindingBudget = bindingBudget;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public double getBindingBudget() {
		return bindingBudget;
	}
	public void setBindingBudget(double bindingBudget) {
		this.bindingBudget = bindingBudget;
	}
	
	
}
