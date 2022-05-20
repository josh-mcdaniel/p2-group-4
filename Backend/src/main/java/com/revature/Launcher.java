package com.revature;

import com.revature.controllers.AuthController;
import com.revature.controllers.LeaderboardController;

import io.javalin.Javalin;

public class Launcher {
	
	public static void main(String[] args) {
		
		
		AuthController ac = new AuthController();
		LeaderboardController lc = new LeaderboardController();
		
		Javalin app = Javalin.create(
					
					config -> {
						
						config.enableCorsForAllOrigins();
					}
					
					
					).start(5000);
			
			
			app.post("/Login", ac.userLoginHandler);
			app.post("/insertUser", ac.insertUserHandler);
			app.get("/showAllScores", lc.showAllScoresHandler);
			app.post("/insertScore", lc.insertScoreHandler);
			
		}

}
