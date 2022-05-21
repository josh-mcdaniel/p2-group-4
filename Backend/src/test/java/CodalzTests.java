import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.revature.daos.LeaderboardDAO;
import com.revature.daos.MixedLettersDAO;
import com.revature.daos.UserDAO;

public class CodalzTests {

	MixedLettersDAO ml = new MixedLettersDAO();
	LeaderboardDAO lb = new LeaderboardDAO();
	UserDAO ud = new UserDAO();
	
	@Test
	public void getUserbyID() {
		
		 Member member = memberDao.findById(0l);

	        Assert.assertEquals("John Smith", member.getName());
	        Assert.assertEquals("john.smith@mailinator.com", member.getEmail());
	        Assert.assertEquals("2125551212", member.getPhoneNumber());
	        return;
	}
	
	@Test
	public void xuserLoginDAO() {
		
		assertTrue(ud.User("user", "password"));
		
	}
	
	@Test 
	public void testFailedLogin() {
		
		assertFalse(ud.login(" ", " "));
	
	}
	
	@Test
	public void userLoginDAO() {
		
		assertEquals(ud.userLoginDAO(-5000), null);
		
	}
	
	@Test
	public void xuserLoginDAO() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	@Test
	public void testDataIsReturnedOnValidRoleSearch() {
		
		assertNotNull(ed.getEmployeesByRole(" "));
		 
	}
	
	
	
	@Test
	public void x() {
		assertNotSame(rd.getRoleById(1), rd.getRoleById(2));
		assertNotSame(rd.getRoleById(3), rd.getRoleById(4));
	}
	
	@Test
	public void getAllMixedLetters() {
		
		assertEquals(ml.getMixedLettersByID(-5000), null);
		
	}
	
	
	
	@Test
	public void getMixedLettersByID() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	@Test
	public void insertMixedLetters() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	@Test
	public void updateMixedLetters() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	
	
	@Test
	public void insertUser() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	@Test
	public void insertScore() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	@Test
	public void showAllScores() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	
}