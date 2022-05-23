package com.revature;

import com.revature.controllers.AuthController;
import com.revature.controllers.LeaderboardController;
import com.revature.controllers.MixedLettersController;

import io.javalin.Javalin;




public class Launcher {
	
	public static void main(String[] args) {
		
		AuthController ac = new AuthController();
		
		LeaderboardController lc = new LeaderboardController();
		
		MixedLettersController mlc = new MixedLettersController();
		
		

		Javalin app = Javalin.create(
				
				config -> {
					
					config.enableCorsForAllOrigins();
				}
				
				
				).start(5000);
		
		app.post("/login", ac.userLoginHandler);
		
		app.post("/addML", mlc.insertMLHandler);
		
		app.post("/getML", mlc.getMLHandler);
		
		app.get("/leaderboard", lc.showAllScoresHandler);
		
		app.put("/updateScore", ac.updateUserHandler);
	}

}
