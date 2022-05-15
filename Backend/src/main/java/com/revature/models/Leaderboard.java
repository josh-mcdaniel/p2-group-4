package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leaderboard")
public class Leaderboard {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int leaderboard_id;
	
	@Column
	private int score;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	
	public Leaderboard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Leaderboard(int leaderboard_id, int score, User user) {
		super();
		this.leaderboard_id = leaderboard_id;
		this.score = score;
		this.user = user;
	}


	public Leaderboard(int score, User user) {
		super();
		this.score = score;
		this.user = user;
	}


	public int getLeaderboard_id() {
		return leaderboard_id;
	}


	public void setLeaderboard_id(int leaderboard_id) {
		this.leaderboard_id = leaderboard_id;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Leaderboard [leaderboard_id=" + leaderboard_id + ", score=" + score + ", user=" + user + "]";
	}
	
	
	

	

}
