package com.revature.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Words;
import com.revature.models.MixedLetters;
import com.revature.utils.HibernateUtil;

public class WordsDAO {

	public List<Words> getWordsOfString(MixedLetters ml) {
		
		Session ses = HibernateUtil.getSession(); 
		
		Query q = ses.createQuery("FROM Words w WHERE w.mixed_letters_fk.mixed_letters_id = ?0");
		
		q.setParameter(0, ml.getMixed_letters_id());
		
		List<Words> wordList = q.getResultList();
		
		HibernateUtil.closeSession();
		
		return wordList;
	}
	
	/*public Words getWordsByMLFK(MixedLetters ml) {
		
		Session ses = HibernateUtil.getSession();
		
		Words w = ses.get(Words, id)
	}*/
	
	public void insertWord(Words word) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(word);
		
		HibernateUtil.closeSession();
	}
	
	public void updateWords(Words word) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.merge(word);
		
		tran.commit();
		
		HibernateUtil.closeSession();
	}
	
	public void deleteWords(Words word) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.delete(word);
		
		tran.commit();
		
		HibernateUtil.closeSession();
	}
}
