package com.revature;

import com.revature.controllers.AuthController;

import io.javalin.Javalin;




public class Launcher {
	
	public static void main(String[] args) {
		
		AuthController ac = new AuthController();
		

		Javalin app = Javalin.create(
				
				config -> {
					
					config.enableCorsForAllOrigins();
				}
				
				
				).start(5000);
		
		app.post("/login", ac.userLoginHandler);
		
	}

}
