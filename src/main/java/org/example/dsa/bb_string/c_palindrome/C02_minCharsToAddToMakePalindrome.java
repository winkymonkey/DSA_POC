package org.example.dsa.bb_string.c_palindrome;

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

public class C02_minCharsToAddToMakePalindrome {
	/*
	 * Check the string whether it is already a palindrome or not.
	 * If yes, then return 0
	 * If not, then delete the last character and check the reduced string once again.
	 * By doing so, the string will be reduced to either a palindrome or become empty.
	 * In both the cases, the number of characters deleted from the end till now is the answer because those characters can be inserted at the front to make it palindrome.
	 *   
	 */
}
