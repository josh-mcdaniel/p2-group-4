package com.revature.models;

public class Leaderboard {
	
	private int leaderboard_id;
	private int score;
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
