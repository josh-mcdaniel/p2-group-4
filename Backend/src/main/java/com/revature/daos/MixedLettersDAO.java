package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.MixedLetters;
import com.revature.utils.HibernateUtil;

public class MixedLettersDAO {

	public List<MixedLetters> getAllMixedLetters(){
		
		Session ses = HibernateUtil.getSession();
		
		List<MixedLetters> mlList = ses.createQuery("FROM MixedLetters").list();
		
		HibernateUtil.closeSession();
		
		return mlList;
	}
	
	public MixedLetters getMixedLettersByID(int id) {
		
		Session ses = HibernateUtil.getSession(); 
		
		MixedLetters ml = ses.get(MixedLetters.class, id);
		
		HibernateUtil.closeSession();
		
		return ml;
	}
	
	
	public void insertMixedLetters(MixedLetters ml) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(ml);
		
		HibernateUtil.closeSession();
	}
	
	public void updateMixedLetters(MixedLetters ml) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.merge(ml);
		
		tran.commit();
		
		HibernateUtil.closeSession();
	}
}
