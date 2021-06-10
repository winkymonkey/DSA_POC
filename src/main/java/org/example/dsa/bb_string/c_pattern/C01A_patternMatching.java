package org.example.dsa.bb_string.c_pattern;

/**
 * ******************************************************************************
 * Find out the occurrences of a given pattern in another string
 * TEXT length = n
 * PATTERN length = m
 * n > m
 * ******************************************************************************
 * Input:	TEXT[] = "THIS IS A TEST TEXT"		PATT[] = "TEST"
 * Output:	Pattern found at index 10
 * 
 * Input:	TEXT[] = "AABAACAADAABAABA"			PATT[] = "AABA"
 * Output:	Pattern found at index 0,9,12
 *  
 * ******************************************************************************
 */

public class C01A_patternMatching {
	/*
	 * -------------------------------------
	 * ---Naive Approach (SLIDING WINDOW)---
	 * -------------------------------------
	 * We can take the `pattern` the sliding window and search it in the given `string`
	 * We should slide the window by 1 character each time
	 * 
	 * String:	AABAACAADAABAABA
	 * Pattern:	AABA
	 * Pattern:          AABA
	 * Pattern:	            AABA
	 * 
	 * 
	 * TIME:	O(n-m+1)			//average case
	 * 			O(m*(n-m+1))		//worst case (when only the last character is different)
	 * 
	 */
	
	public static void main(String[] args) {
		String txt = "AABAACAADAABAABA";
		String pat = "AABA";
		search(txt, pat);
	}
	
	public static void search(String txt, String pat) {
		for (int i=0; i<=txt.length()-pat.length(); i++) {
			int j;
			for (j=0; j<pat.length(); j++) {
				if (txt.charAt(i+j) != pat.charAt(j))
					break;
			}
			if (j == pat.length())
				System.out.println("Pattern found at index=" + i);
		}
	}
	
}
