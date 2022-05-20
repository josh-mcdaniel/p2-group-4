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
	public void userLoginDAO() {
		
		assertTrue(ud.login("user", "password"));
		
	}
	
	@Test 
	public void testFailedLogin() {
		
		assertFalse(ud.login(" ", " "));
	
	}
	
	@Test
	public void userLoginDAO() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	@Test
	public void userLoginDAO() {
		
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
		
		assertEquals(rd.getRoleById(-5000), null);
		
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
	public void getUserbyID() {
		
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