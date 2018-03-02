package edu.gummersall.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitPractice {
	
	@Test
	void test() {
		//test data
		String str1 = new String ("123");
		String str2 = new String ("123");
		String str3 = null;
		String str4 = "123";
		String str5 = "123";
			
		int val1 = 10;
		int val2 = 11;
		
		String[] expectedArray = {"a", "b", "c"};
		String[] resultArray =  {"a", "b", "c"};
		
		//assertEquals
		assertEquals(str1, str2);
		
		//assertTrue
		assertTrue (val1 < val2);
		
		//assertFalse
		assertFalse(val1 > val2);
		
		//assertNotNull
		assertNotNull(str1);
		
		//assertNull
		assertNull(str3);
		
		//assertSame
		assertSame(str4,str5);
		
		//assertNotSame
		assertNotSame(str1,str3);
		
		//assertArrayEquals
		assertArrayEquals(expectedArray, resultArray);
	}

}
