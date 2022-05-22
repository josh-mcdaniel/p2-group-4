package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.MixedLetters;
import com.revature.utils.HibernateUtil;

public class MixedLettersDAO {

//	public List<MixedLetters> getAllMixedLetters{
//		
//		Session ses = HibernateUtil.getSession();
//		
//		List<MixedLetters> mlList = ses.createQuery();
//	}
	
	public static MixedLetters getMixedLettersByID(int id) {
		
		Session ses = HibernateUtil.getSession(); 
		
		MixedLetters ml = ses.get(MixedLetters.class, id);
		
		HibernateUtil.closeSession();
		
		return ml;
	}
	
	public static void insertMixedLetters(MixedLetters ml) {
		
	}
	
	public void updateMixedLetters(MixedLetters ml) {
		
	}
}
