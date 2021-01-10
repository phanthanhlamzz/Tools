package demojunit;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestPerson extends TestCase {
	 public static void main(String[] agrs) {  
         junit.textui.TestRunner.run(new TestSuite(TestPerson.class));  
     }  
	public TestPerson(String name) {
		super(name);
	}

	/**
	 * Xac nhan rang name duoc the hien dung dinh dang
	 */
	public void testGetFullName() {
		Person p = new Person("Aidan", "Burke");
		assertEquals("AidanBurke", p.getFullName());
	}

	/**
	 * Xac nhan rang nulls da duoc xu ly chinh xac
	 */
	public void testNullsInName() {
		Person p = new Person(null, "Burke");
		assertEquals("?Burke", p.getFullName());
		p = new Person("Tanner", null);
		assertEquals("Tanner?", p.getFullName());
	}
}
