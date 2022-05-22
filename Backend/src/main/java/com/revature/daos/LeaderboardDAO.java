package com.revature.daos;

import com.revature.models.Leaderboard;
import com.revature.models.User;
import com.revature.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class LeaderboardDAO {

    public Leaderboard insertScore(Leaderboard score) {

        Session ses = HibernateUtil.getSession();

        //inserting the score into the database
        ses.save(score);

        HibernateUtil.closeSession();

        return score;

    }

    public List<User> showAllScores(){

        Session ses = HibernateUtil.getSession();
        //getting the list from the DB in descending order
        List<User> scoreList = ses.createQuery("from User u order by u.score desc").list();

        HibernateUtil.closeSession();

        return scoreList;
    }

}
