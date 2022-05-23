package com.revature;

import java.util.List;

import com.revature.controllers.AuthController;
import com.revature.controllers.LeaderboardController;
import com.revature.daos.MixedLettersDAO;
import com.revature.models.MixedLetters;

import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class Launcher {
	
	public static void main(String[] args) {
		//instantiating an AuthController object so we can access its handler
		AuthController ac = new AuthController();
		LeaderboardController lc = new LeaderboardController();


		
		MixedLettersDAO mlDAO = new MixedLettersDAO();
		
		List<MixedLetters> mlList = mlDAO.getAllMixedLetters();
		
		
		System.out.println(mlList.toString());

	Javalin app = Javalin.create(
			//the config lambda lets us specify certain configurations
			JavalinConfig::enableCorsForAllOrigins
	).start(5000);
	// takes in a url endpoint, and a place in the server to send the request to
        app.post("/users", ac.insertUserHandler);
        app.post("/login", ac.loginHandler);
		app.get("/leaderboard", lc.showAllScoresHandler); //top scores
		app.post("/insertScore", lc.insertScoreHandler);
		app.get("/showUsers", ac.showAllUsersHandler);
		app.post("/register", ac.insertUserHandler);

}

}
