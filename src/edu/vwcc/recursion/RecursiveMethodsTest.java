package edu.vwcc.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveMethodsTest {

	@Test
	void testFactorial() {
		assertEquals(1, RecursiveMethods.factorial(0));
		assertEquals(1, RecursiveMethods.factorial(1));
		assertEquals(120, RecursiveMethods.factorial(5));
		assertEquals(720, RecursiveMethods.factorial(6));
		assertEquals(479001600, RecursiveMethods.factorial(12));
	}

	@Test
	public void testSumDigits() {
		assertEquals(5, RecursiveMethods.sumDigits(5));
		assertEquals(1, RecursiveMethods.sumDigits(10));
		assertEquals(15, RecursiveMethods.sumDigits(357));
		assertEquals(6, RecursiveMethods.sumDigits(222));
		assertEquals(0, RecursiveMethods.sumDigits(0));
		assertEquals(10, RecursiveMethods.sumDigits(1234));
		assertEquals(15, RecursiveMethods.sumDigits(12345));
		assertEquals(21, RecursiveMethods.sumDigits(123456));
	}

	@Test
	public void testAllStar() {
		assertEquals("h*e*l*l*o", RecursiveMethods.allStar("hello"));
		assertEquals("a*b*c", RecursiveMethods.allStar("abc"));
		assertEquals("H*I", RecursiveMethods.allStar("HI"));
		assertEquals("a", RecursiveMethods.allStar("a"));
		assertEquals("", RecursiveMethods.allStar(""));
	}

	@Test
	void testProductOfArray() {
		assertEquals(24, RecursiveMethods.productOfArray(new int[] { 1, 2, 3, 4 }));
		assertEquals(3, RecursiveMethods.productOfArray(new int[] { 3 }));
		assertEquals(-6, RecursiveMethods.productOfArray(new int[] { -1, 2, 3 }));
		assertEquals(240000, RecursiveMethods.productOfArray(new int[] { 10, 20, 30, 40 }));
	}

}
