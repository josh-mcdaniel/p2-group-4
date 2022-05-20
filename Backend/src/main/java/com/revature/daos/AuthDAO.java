//package com.revature.daos;
//
//import com.revature.models.User;
//import com.revature.utils.HibernateUtil;
//import org.hibernate.Hibernate;
//import org.hibernate.Session;
//
//import javax.persistence.Query;
//
//public class AuthDAO {
//
//    public User isValidUser (String username, String password) {
//
//        Session ses = HibernateUtil.getSession();
//
//        Query q = ses.createQuery("FROM User WHERE username = ?1 AND password = ?2");
//
//        q.setParameter(1, username);
//        q.setParameter(2, password);
//
//        HibernateUtil.closeSession();
//
//        return User;
//    }
//}
