package com.revature.daos;

import com.revature.models.User;
import com.revature.utils.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;

public class AuthDAO {

//    public User isValidUser (String username, String password) {
//
//        Session ses = HibernateUtil.getSession();
//
//        Query q = ses.createQuery("FROM User WHERE username = ?0 AND password = ?1);
//
//        q.setParameter(0, username);
//        q.setParameter(1, password);
//
//        return User;
//    }
}
