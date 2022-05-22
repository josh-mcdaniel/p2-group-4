package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Leaderboard;
import com.revature.models.User;
import com.revature.utils.HibernateUtil;

public class LeaderboardDAO {
	
	
	public static Leaderboard insertScore(Leaderboard score) {
		
		Session ses = HibernateUtil.getSession();
		
		//inserting the score into the database
		ses.save(score);
		
		HibernateUtil.closeSession();
		
		return score;
		
	}
	
	public static List<Leaderboard> showAllScores(){
		
		Session ses = HibernateUtil.getSession();
		//getting the list from the DB in descending order
		List<Leaderboard> scoreList = ses.createQuery("from Leaderboard l order by l.score desc").list();
		
		HibernateUtil.closeSession();
		
		return scoreList;
	}
	
	public static Leaderboard getLeadboardById(int id) {
		
		Session ses = HibernateUtil.getSession();
		//getting the user from the DB by the ID
		//first input represents the table and second is the ID
		Leaderboard lr = ses.get(Leaderboard.class, id);
		
		HibernateUtil.closeSession();
		
		return lr;
	}

}
