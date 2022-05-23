package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.MixedLetters;
import com.revature.models.User;
import com.revature.services.MixedLettersService;

import io.javalin.http.Handler;


public class MixedLettersController {
	
	MixedLettersService mls = new MixedLettersService();

	public Handler insertMLHandler = (ctx) -> {
		
		if(ctx.req.getSession() != null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			MixedLetters ml = gson.fromJson(body, MixedLetters.class);
			
			if (ml != null) {
				mls.addMixedLetters(ml);
				
				ctx.status(201);
				
				System.out.println("Random String inserted successfully!");
				
			} else {
				
				ctx.status(400);
				
				System.out.println("Random String improperly sent...");
			}
			
			
		} else {
			ctx.status(401);
			
			System.out.println("No session, Unathorized");
		}
	};
	
	public Handler getMLHandler = (ctx) -> {
		
		if (ctx.req.getSession() != null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			User u = gson.fromJson(body, User.class);
			
			int mlID = (u.getGames_played() % 5) + 1;
			
			MixedLetters ml = mls.getMixedLetters(mlID);
			
			if (ml != null) {
				String JSONString = gson.toJson(ml);
				
				ctx.status(202);
				
				ctx.result(JSONString);
				
				System.out.println("Mixed Letters successfully Retrieved!!");
			} else {
				ctx.status(404);
				
				System.out.println("Mixed Letters not found...");
			}

			
		} else {
			
			ctx.status(400);
			
			System.out.println("Mixed Letters Not Found...");
		}
	};
}
