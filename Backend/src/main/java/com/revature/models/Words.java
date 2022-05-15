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
@Table(name = "words")
public class Words {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int words_id;
	
	@Column
	private String word;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "mixed_letters_id")
	private MixedLetters mixed_letters_fk;
	
	public Words() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Words(int words_id, String word, MixedLetters mixed_letters) {
		super();
		this.words_id = words_id;
		this.word = word;
		this.mixed_letters_fk = mixed_letters;
	}

	public Words(String word, MixedLetters mixed_letters) {
		super();
		this.word = word;
		this.mixed_letters_fk = mixed_letters;
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
		return mixed_letters_fk;
	}

	public void setMixed_letters(MixedLetters mixed_letters) {
		this.mixed_letters_fk = mixed_letters;
	}

	@Override
	public String toString() {
		return "Words [words_id=" + words_id + ", word=" + word + ", mixed_letters=" + mixed_letters_fk + "]";
	}
	
	
	

}
