package com.revature.services;

import java.util.List;

import com.revature.daos.LeaderboardDAO;
import com.revature.daos.UserDAO;
import com.revature.models.Leaderboard;
import com.revature.models.ScoreDTO;
import com.revature.models.User;

public class LeaderboardService {

    UserDAO uDAO = new UserDAO();
    LeaderboardDAO lDAO = new LeaderboardDAO();


    public Leaderboard insertScore(ScoreDTO sDTO) {

        //making a new user object since it is needed as a variable for Leaderboard class
        User user = uDAO.getUserByID(sDTO.getUser_id());

        //making a new leaderboard class called score and inputting the score and user variables into it
        Leaderboard score = new Leaderboard (sDTO.getScore(),
                user);

        //calling the dao method to insert the score into the DB
        lDAO.insertScore(score);
        //returning the score to the front end in case they want to use it
        return score;

    }

    public List<User> showAllScores(){
        //making a list object and calling the dao method to show all scores
        List<User> scoreList = lDAO.showAllScores();
        //returning the list
        return scoreList;
    }

}