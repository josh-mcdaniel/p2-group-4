package com.revature.models;

public class User {
	
	private int user_id;
	private String username;
	private String password;
	private String email;
	private Leaderboard leaderboard;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int user_id, String username, String password, String email, Leaderboard leaderboard) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.leaderboard = leaderboard;
	}


	public User(String username, String password, String email, Leaderboard leaderboard) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.leaderboard = leaderboard;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Leaderboard getLeaderboard() {
		return leaderboard;
	}


	public void setLeaderboard(Leaderboard leaderboard) {
		this.leaderboard = leaderboard;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", leaderboard=" + leaderboard + "]";
	}
	
	

}
