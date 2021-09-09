package org.example.dsa.bb_string.a_basics;

/**
 * ***************************************************************************************
 * Count the minimum characters to be added at front to make string palindrome
 * ***************************************************************************************
 * Input:	ABC
 * Output:	2			//make it `CBABC` by adding `CB` at front
 * 
 * Input:	AACECAAAA
 * Output:	2			//make it `AAAACECAAAA` by adding `AA` at front
 * 
 * ***************************************************************************************
 */

public class A04_minCharsToAddToMakePalindrome {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Check if the string is already a palindrome or not
	 * If yes, return 0
	 * If not, delete the last character & check if the reduced string is palindrome
	 * 
	 * We should keep on doing this.
	 * By doing so, the string will be reduced to either a palindrome or become empty.
	 * Irrespective of the outcome, the number of characters deleted from the end till now is the answer because those characters can be inserted at the front to make it palindrome.
	 * 
	 * TIME --- O(N^2)		//for each character deletion we are checking if it's palindrome. So n*O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "AACECAAAA";
		int count = findMinCharToAddToMakePalindrome(str);
		System.out.println(count);
	}
	
	
	private static int findMinCharToAddToMakePalindrome(String str) {
		int count = 0;
		while (str.length() > 0) {
			if (isPalindrome(str)) {
				return count;
			}
			else {
				count++;
				str = str.substring(0, str.length()-1);
			}
		}
		return count;			//after removal of characters, it never become palindrome, rather it become empty
	}
	
	
	private static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
}
