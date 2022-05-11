package com.revature.models;

public class Leaderboard {
	
	private int leaderboard_id;
	private int score;
	
	
	public Leaderboard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Leaderboard(int leaderboard_id, int score) {
		super();
		this.leaderboard_id = leaderboard_id;
		this.score = score;
	}


	public Leaderboard(int score) {
		super();
		this.score = score;
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


	@Override
	public String toString() {
		return "Leaderboard [leaderboard_id=" + leaderboard_id + ", score=" + score + "]";
	}
	
	
	

}
