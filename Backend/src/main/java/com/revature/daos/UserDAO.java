package com.revature.daos;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;

import com.revature.models.User;
import com.revature.utils.HibernateUtil;

public class UserDAO {
	
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

	public User getUserbyID(int id) {
		
		Session ses = HibernateUtil.getSession();
		//getting the user from the DB by the ID
		//first input represents the table and second is the ID
		User user = ses.get(User.class, id);
		
		HibernateUtil.closeSession();
		
		return user;
	}
	
	public void insertUser (User user) {
		
		Session ses = HibernateUtil.getSession();
		
		//inserting the user into the database
		ses.save(user);
		
		HibernateUtil.closeSession();
	}


}
