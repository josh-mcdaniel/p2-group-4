package com.revature;

import java.util.List;



import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.revature.daos.MixedLettersDAO;
import com.revature.models.MixedLetters;




public class Launcher {
	
	public static void main(String[] args) {
		

		
		MixedLettersDAO mlDAO = new MixedLettersDAO();
		
		List<MixedLetters> mlList = mlDAO.getAllMixedLetters();
		
		
		System.out.println(mlList.toString());
		

		
	}

}
