package edu.vwcc.recursion;

import java.util.Arrays;

/**
 * This program is designed to explore various problems that can be solved using
 * recursion. Your task is to implement the 4 methods below using recursion.
 * Author: Cory Dunton Date: 10/1/2023
 *
 * INSTRUCTIONS: 1. Requirements: - Do not use for or while loops - Do not use
 * built-in standard library functions unless directed
 * 
 * 2. Hints: Consider the following when designing your recursive solutions: -
 * Identify the base case: What is the simplest input for which you know the
 * output? - Identify the recursive case: How can you simplify or reduce the
 * input with each recursive call?
 * 
 * 3. Use and run the unit tests in RecursiveMethodsTest.java to verify
 * correctness. - Feel free to use/expand the optional main method below for
 * your own testing too.
 */

public class RecursiveMethods {

	/**
	 * Compute the factorial (n!) of any positive integer n using recursion.
	 *
	 * Factorial is defined as the multiplicative product of all positive integers
	 * less than or equal to n. For example: factorial(0) = 1 factorial(1) = 1
	 * factorial(5) = 5 x 4 x 3 x 2 x 1 = 120
	 *
	 */
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	/**
	 * Compute the sum of any positive integer's digits For example: sumDigits(10) =
	 * 1 sumDigits(357) = 15 sumDigits(222) = 6
	 * 
	 * Hint: the modulus operator (%) by 10 yields the rightmost digit (126 % 10 is
	 * 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 */

	public static int sumDigits(int n) {
		return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
	}

	/**
	 * Compute a new string where all adjacent characters are separated by a "*".
	 *
	 * So given "hello", return "h*e*l*l*o".
	 *
	 * @param str The input string.
	 * @return A new string where all adjacent characters are separated by "*".
	 */
	public static String allStar(String str) {
		if (str.length() <= 1)
			return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	/**
	 * Compute the multiplicative product of all elements in an array using
	 * recursion.
	 *
	 * For this, please do use this standard library method: Arrays.copyOfRange(arr,
	 * 1, arr.length) this makes a sub-copy of the array starting from the next
	 * index
	 */
	public static int productOfArray(int[] arr) {
		if (arr.length == 0)
			return 1;
		return arr[0] * productOfArray(Arrays.copyOfRange(arr, 1, arr.length));

	}

	/**
	 * Optional main method for testing.
	 */
	public static void main(String[] args) {

		// Test the factorial method
		System.out.println("Testing factorial method:");
		System.out.println("factorial(0) should return 1: " + factorial(0));
		System.out.println("factorial(1) should return 1: " + factorial(1));
		System.out.println("factorial(5) should return 120: " + factorial(5));
		System.out.println();

	}

}
