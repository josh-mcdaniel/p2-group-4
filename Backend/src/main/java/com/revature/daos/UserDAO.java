package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.MixedLetters;
import com.revature.models.User;
import com.revature.models.Words;
import com.revature.utils.HibernateUtil;

public class UserDAO {

	public User getUserByID(int id) {
		
		Session ses = HibernateUtil.getSession(); 
		
		User u = ses.get(User.class, id);
		
		HibernateUtil.closeSession();
		
		return u;
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
