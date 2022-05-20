package com.revature.daos;

import com.revature.models.Leaderboard;
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

    public List<Leaderboard> showAllScores(){

        Session ses = HibernateUtil.getSession();
        //getting the list from the DB in descending order
        List<Leaderboard> scoreList = ses.createQuery("from Leaderboard l order by l.score desc").list();

        HibernateUtil.closeSession();

        return scoreList;
    }

}
