package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.LoginDTO;
import com.revature.models.User;
import com.revature.services.AuthService;

import io.javalin.http.Handler;

public class AuthController {
	
	AuthService as = new AuthService();
	
	
	public Handler userLoginHandler = (ctx) -> {
		
		String body =  ctx.body();
		
		Gson gson = new Gson();
		
		//converting user inputting username and password from JSON -> Java object
		LoginDTO LDTO = gson.fromJson(body, LoginDTO.class);
		
		//checking if the input is not null
		if(as.userLogin(LDTO) != null) {
			
			//returns valid session if no session makes ones and returns it
			ctx.req.getSession();
			//setting the status code to accepted
			ctx.status(202);
			
			System.out.println("User login successful");
			
			//converting the user  object associated with that username and password 
			//from Java object -> JSON 
			String userJSON = gson.toJson(as.userLogin(LDTO));
			//returning the user to the frontend
			ctx.result(userJSON);
			
		}else {
			
			ctx.status(401);
			System.out.println("User login failed");
		}
		
	};
	
	public Handler insertUserHandler = (ctx) -> {
		
		if(ctx.req.getSession() != null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			//converting new user information from JSON -> Java object
			User user = gson.fromJson(body, User.class);
			//inputting the new user into the database
			as.insertUser(user);
			//setting the status code
			ctx.status(201);
			
		}
	};

}
