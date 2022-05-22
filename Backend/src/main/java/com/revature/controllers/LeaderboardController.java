package com.revature.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Leaderboard;
import com.revature.models.ScoreDTO;
import com.revature.models.User;
import com.revature.services.LeaderboardService;

import io.javalin.http.Handler;

public class LeaderboardController {

    LeaderboardService ls = new LeaderboardService();

    public Handler insertScoreHandler = (ctx) -> {
        //front end response basically
        String body =  ctx.body();

        Gson gson = new Gson();
        //getting the input from the front end of the score and user_id
        //and converting it into a Java object
        ScoreDTO sDTO = gson.fromJson(body, ScoreDTO.class);
        //checks to see if there is a current session if there is not one make one and return it
        if(ctx.req.getSession(true) != null) {

            ctx.status(200);

            System.out.println("score succesfully inputted to DB");
            //changing the score from Java object -> JSON
            String scoreJSON = gson.toJson(ls.insertScore(sDTO));
            //returning that to the front end if they need it for something just in case
            ctx.result(scoreJSON);
        }else {

            ctx.status(400);
            System.out.println("Something went wrong when inputting the score into the DB");

        }

    };

    public Handler showAllScoresHandler = (ctx) -> {

        if(ctx.req.getSession(true) != null) {

            Gson gson = new Gson();

            List<User> scoreList = ls.showAllScores();
            //turning all the score list into JSON
            String allScores = gson.toJson(scoreList);
            //returning the scores to the front end
            ctx.result(allScores);
            //status code
            ctx.status(200);

        }

    };

}