package com.revature;

import java.util.List;

import com.revature.daos.MixedLettersDAO;
import com.revature.models.MixedLetters;

import io.javalin.Javalin;

public class Launcher {
	
	public static void main(String[] args) {
		

		
		MixedLettersDAO mlDAO = new MixedLettersDAO();
		
		List<MixedLetters> mlList = mlDAO.getAllMixedLetters();
		
		
		System.out.println(mlList.toString());
		
	}

}
