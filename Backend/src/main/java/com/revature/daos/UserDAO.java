package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.MixedLetters;
import com.revature.models.User;
import com.revature.models.Words;
import com.revature.utils.HibernateUtil;

import javax.persistence.NoResultException;
import javax.persistence.Query;

public class UserDAO {

	public User getUserByID(int id) {
		
		Session ses = HibernateUtil.getSession(); 
		
		User u = ses.get(User.class, id);
		
		HibernateUtil.closeSession();
		
		return u;
	}

	public User userLoginDAO(String username, String password) {

		User user = new User();
		Session ses = HibernateUtil.getSession();

		//Writing the SQL statement to look for username and password from the database
		Query q = ses.createQuery("from User u where u.username = ?0 and u.password =?1");

		//setting the wildcards to the user inputted username and password
		q.setParameter(0, username);
		q.setParameter(1, password);


		//Try and catch block was made to catch the no result in the query error which gives lots of errors
		//now we get no errors :)
		try {
			//Making a user object and getting the result from the query
			user = (User) q.getSingleResult();
			return user;

		}catch(NoResultException nre) {
			//dont need to do anything here can be empty
		}

		//closing the session
		HibernateUtil.closeSession();

		return null;

	}

	public User getUserByUsername(String username) {
		
		Session ses = HibernateUtil.getSession(); 
		
		User u = ses.get(User.class, username);
		
		HibernateUtil.closeSession();
		
		return u;
	}
	
	public User getUserByPassword(String password) {
		
		Session ses = HibernateUtil.getSession(); 
		
		User u = ses.get(User.class, password);
		
		HibernateUtil.closeSession();
		
		return u;
	}
	
	public void insertUser(User user) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(user);
		
		HibernateUtil.closeSession();
	}
	
	public void updateUser(User user) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.merge(user);
		
		tran.commit();
		
		HibernateUtil.closeSession();
	}
	
	public void deleteUser(User user) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.delete(user);
		
		tran.commit();
		
		HibernateUtil.closeSession();
	}
}
