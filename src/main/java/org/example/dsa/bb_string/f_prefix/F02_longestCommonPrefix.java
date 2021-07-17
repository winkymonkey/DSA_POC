package org.example.dsa.bb_string.f_prefix;

/**
 * ******************************************************************************
 * Find the Longest Common Prefix from a group of words 
 * ******************************************************************************
 * Input:	INDIA	INDIANA		IND		INDONESIA
 * Output:	IND
 * 
 * ******************************************************************************
 */

public class F02_longestCommonPrefix {
	/*
	 * -------------------
	 * ---WORD MATCHING---
	 * -------------------
	 * We can take first & second word and find the Longest Common Prefix by inspecting their characters. Suppose we find it as LCP1
	 * Then we take LCP1 & third word and find the Longest Common Prefix by inspecting their characters. Suppose we find it as LCP2
	 * Then we take LCP2 & fourth word and find the Longest Common Prefix by inspecting their characters. Suppose we find it as LCP3
	 * ...
	 * ...
	 * and so on
	 * The last answer will be the final answer
	 * 
	 * TIME --- O(nm)		//n = Number of strings, m = Length of the largest string
	 * 
	 * 
	 * 
	 * -------------------------------------
	 * ---CHARACTER BY CHARACTER MATCHING---
	 * -------------------------------------
	 * Compare the length of each word to find the length of the smallest word. Let us call it as MINLEN
	 * Run a loop from 0 to MINLEN
	 * In each iteration,
	 * 		If i'th character of each word matches, then save the matched part till now
	 * 		Otherwise, break
	 * 
	 * 
	 * 
	 * TIME --- O(nm)		//n = Number of strings, m = Length of the largest string
	 * 
	 */
	
}
