package com.revature.models;

public class MixedLetters {
	
	private int mixed_letters_id;
	private String jumbled_letters;
	
	
	public MixedLetters() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MixedLetters(int mixed_letters_id, String jumbled_letters) {
		super();
		this.mixed_letters_id = mixed_letters_id;
		this.jumbled_letters = jumbled_letters;
	}


	public MixedLetters(String jumbled_letters) {
		super();
		this.jumbled_letters = jumbled_letters;
	}


	public int getMixed_letters_id() {
		return mixed_letters_id;
	}


	public void setMixed_letters_id(int mixed_letters_id) {
		this.mixed_letters_id = mixed_letters_id;
	}


	public String getJumbled_letters() {
		return jumbled_letters;
	}


	public void setJumbled_letters(String jumbled_letters) {
		this.jumbled_letters = jumbled_letters;
	}


	@Override
	public String toString() {
		return "MixedLetters [mixed_letters_id=" + mixed_letters_id + ", jumbled_letters=" + jumbled_letters + "]";
	}
	
	
	

}
