import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.revature.daos.LeaderboardDAO;
import com.revature.daos.MixedLettersDAO;
import com.revature.daos.UserDAO;
import com.revature.models.Leaderboard;
import com.revature.models.MixedLetters;
import com.revature.models.User;

public class CodalzTests {
	
	UserDAO ud = new UserDAO();
	MixedLettersDAO ml = new MixedLettersDAO();
	LeaderboardDAO lb = new LeaderboardDAO();
	
	User us = new User();
	
	// 10 tests are fine
	// UserDAO
	@Test
	public void getUserbyID()
	{
	    User user = UserDAO.getUserbyID(0);
	
	    Assert.assertEquals("JohnOne", user.getUsername());
	    Assert.assertEquals("john.one@mail.com", user.getPassword());
	    Assert.assertEquals("2134445555", user.getEmail());
	    return;		    
	}
 
   
 
    @Test
    public void insertUser()
    {
        User user = new User();
        user.setUser_id(0);
        user.setEmail("jane.one@mail.com");
        user.setUsername("JaneOne");
        user.setPassword("2143332222");

        UserDAO.insertUser(user);
        int id = user.getUser_id();
        Assert.assertNotNull(id);

        Assert.assertEquals(2, UserDAO.getUserbyID(id));
        User newUser = UserDAO.getUserbyID(id);

        Assert.assertEquals("JaneOne", newUser.getUsername());
        Assert.assertEquals("jane.one@mail.com", newUser.getEmail());
        Assert.assertEquals("2143332222", newUser.getPassword());
        return;
    }
    
    // MixedLettersDAO
    
	public void getMixedLettersByID()
	{
		MixedLetters ml = MixedLettersDAO.getMixedLettersByID(0);
	
	    Assert.assertEquals(0, ml.getMixed_letters_id());
	    Assert.assertEquals("john.one@mail.com", ml.getJumbled_letters());
	  
	    return;		    
	}
	
	 @Test
	    public void insertMixedLetters()
	    {
	        MixedLetters ml = new MixedLetters();
	        
	        MixedLettersDAO md = new MixedLettersDAO();

	        ml.setMixed_letters_id(0);
	        ml.setJumbled_letters("Blue42");
	      
	        MixedLettersDAO.insertMixedLetters(ml);
	        int id = ml.getMixed_letters_id();
	        
	        Assert.assertNotNull(id);
	        Assert.assertEquals(0, MixedLettersDAO.getMixedLettersByID(id));
	        			
	        MixedLetters newMix = MixedLettersDAO.getMixedLettersByID(id);

	        Assert.assertEquals("0", newMix.getMixed_letters_id());
	        Assert.assertEquals("Blue42", newMix.getJumbled_letters());
	        return;
	    }
	 
	 @Test
	    public void insertScore()
	    {
	        Leaderboard lt = new Leaderboard();
	        
	    	LeaderboardDAO lb = new LeaderboardDAO();

	        lt.setLeaderboard_id(0);
	        lt.setScore(3000);
	      
	        LeaderboardDAO.insertScore(lt);
	        int id = lt.getLeaderboard_id();
	        
	        Assert.assertNotNull(id);
	        Assert.assertEquals(0, LeaderboardDAO.getLeadboardById(id));
	        			
	        Leaderboard newLeaderboard = LeaderboardDAO.getLeadboardById(id);

	        Assert.assertEquals("0", newMix.getMixed_letters_id());
	        Assert.assertEquals("Blue42", newMix.getJumbled_letters());
	        return;
	    }
 
}
