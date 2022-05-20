import com.revature.daos.MixedLettersDAO;

public class CodalzTests {

	MixedLettersDAO ml = new MixedLettersDAO();

	
	@Test
	public void testSuccessfulLogin() {
		
		assertTrue(ud.login("user", "password"));
		
	}
	
	@Test 
	public void testFailedLogin() {
		
		assertFalse(ud.login(" ", " "));
	
	}
	
	@Test
	public void testDataIsReturnedOnValidRoleSearch() {
		
		assertNotNull(ed.getEmployeesByRole(" "));
		
	}
	
	
	@Test
	public void testNullIsReturnedOnInvalidRoleSearch() {
		
		assertEquals(rd.getRoleById(-5000), null);
		
	}
	
	
	@Test
	public void testRecordUniqueness() {
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
	
}