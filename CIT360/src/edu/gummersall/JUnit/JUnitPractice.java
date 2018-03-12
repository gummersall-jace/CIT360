package edu.gummersall.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitPractice {
	
	@Test
	void test() {
		JUnitProof proof = new JUnitProof();
		
		//assertEquals
		proof.setEquals("12");
		assertEquals("12", proof.getEquals());
		
		//assertTrue
		proof.setYes(true);
		assertTrue (proof.getYes());
		
		//assertFalse
		proof.setNo(false);
		assertFalse(proof.getNo());
		
		//assertNotNull
		proof.setNotNull("Not Null");
		assertNotNull(proof.getNotNull());
		
		//assertNull
		proof.setYesNull(null);
		assertNull(proof.getYesNull());
		
		//assertSame
		proof.setSame(123123);
		assertSame(123123,proof.getSame());
		
		//assertNotSame
		proof.setNotSame(123.456);
		assertNotSame(123.467,proof.getNotSame());
		
		//assertArrayEquals
		String[] testArray = {"1","2", "3","4", "5"};
		proof.setArrayEquals(testArray);
		assertArrayEquals(testArray, proof.getArrayEquals());
		
		
		//other test data
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
