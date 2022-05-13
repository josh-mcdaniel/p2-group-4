package com.revature.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	//get Session objects from our SessionFactory
	//We only want one session in this application - hence private static - it's a singleton!
	private static Session ses;
	
	//This method actually gets us a Session object using the SessionFactory interface.
	//We'll be calling it in the dao layer often.
	public static Session getSession() {
		if (ses == null) { //if there isn't a session...
			ses = sf.openSession(); //get one!
		}
		return ses; //return a session Object
	}
	
	//Finally, we need a method that closes the Session objects 
	//Once we're done with our Session, we want to close it to prevent memory leaks 
	public static void closeSession() {
		ses.close();
		ses = null;
	}

}
