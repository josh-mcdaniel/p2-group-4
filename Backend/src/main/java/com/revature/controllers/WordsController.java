package com.revature.controllers;

import javax.servlet.http.HttpSession;

import com.revature.daos.MixedLettersDAO;
import com.revature.daos.WordsDAO;
import com.revature.models.MixedLetters;

import io.javalin.http.Handler;

public class WordsController {
	
	WordsDAO wDAO = new WordsDAO();
	
	MixedLettersDAO mlDAO = new MixedLettersDAO();
	
	MixedLetters ml = new MixedLetters();
	
	public static HttpSession ses;
	
	public Handler WordsHandler = (ctx) -> {
		
		String body = ctx.body();
		
		Gson gson = new Gson();
		
		List<MixedLetter> mlList =  
		
	}
}
