package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int user_id;

	@Column
	private String username;

	@Column
	private String password;
	private String email;

	@Column
	private int score;
	@Column
	private int games_played;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String username, String password, String email, int score) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.score = score;
	}

	public User(String username, String password, String email, int score) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User{" +
				"user_id=" + user_id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", score=" + score +
				'}';
	}
}