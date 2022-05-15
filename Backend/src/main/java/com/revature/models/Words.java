package com.revature.models;

public class Words {
	
	private int words_id;
	private String word;
	private MixedLetters mixed_letters;
	
	public Words() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Words(int words_id, String word, MixedLetters mixed_letters) {
		super();
		this.words_id = words_id;
		this.word = word;
		this.mixed_letters = mixed_letters;
	}

	public Words(String word, MixedLetters mixed_letters) {
		super();
		this.word = word;
		this.mixed_letters = mixed_letters;
	}

	public int getWords_id() {
		return words_id;
	}

	public void setWords_id(int words_id) {
		this.words_id = words_id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public MixedLetters getMixed_letters() {
		return mixed_letters;
	}

	public void setMixed_letters(MixedLetters mixed_letters) {
		this.mixed_letters = mixed_letters;
	}

	@Override
	public String toString() {
		return "Words [words_id=" + words_id + ", word=" + word + ", mixed_letters=" + mixed_letters + "]";
	}
	
	
	

}
