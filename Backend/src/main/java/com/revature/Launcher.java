package com.revature;

import com.revature.controllers.AuthController;
import com.revature.controllers.MixedLettersController;
import com.revature.models.User;

import io.javalin.Javalin;




public class Launcher {
	
	public static void main(String[] args) {
		
		AuthController ac = new AuthController();
		
		
		MixedLettersController mlc = new MixedLettersController();
		
		

		Javalin app = Javalin.create(
				
				config -> {
					
					config.enableCorsForAllOrigins();
				}
				
				
				).start(5000);
		
		app.post("/login", ac.userLoginHandler);
		
		app.post("/addML", mlc.insertMLHandler);
		
		app.post("/getML", mlc.getMLHandler);
		
	}

}
