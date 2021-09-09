package org.example.dsa.bb_string.d_pattern;

/**
 * ***************************************************************************************
 * Find out the occurrences of a given pattern in another string
 * TEXT length = n
 * PATTERN length = m
 * n > m
 * ***************************************************************************************
 * Input:	TEXT[] = "THIS IS A TEST TEXT"		PATT[] = "TEST"
 * Output:	Pattern found at index 10
 * 
 * Input:	TEXT[] = "AABAACAADAABAABA"			PATT[] = "AABA"
 * Output:	Pattern found at index 0,9,12
 * 
 * Input:	TEXT[] = "CCACCAACDBA"				PATT[] = "DBA"
 * Output:	Pattern found at index 8
 * 
 * ***************************************************************************************
 */

public class D03_patternMatching_KMP {
	/*
	 * -------------------
	 * ---KMP Algorithm---
	 * -------------------
	 * The basic idea behind KMP’s algorithm:
	 * 	After some matches whenever we detect a mismatch, we already know some of the characters in the text of the next window.
	 *  We take advantage of this information to avoid matching the characters that we know will anyway match.
	 * 
	 * 
	 * For example,
	 * 		TXT = "AAAAABAAABA" 
	 * 		PAT = "AAAA"
	 * 
	 * We compare first window of TXT with PAT
	 * 		TXT = "AAAAABAAABA" 
	 * 		PAT = "AAAA"			(start position)
	 * We find a match. This is same as naive approach.
	 * 
	 * 
	 * In the next step, we compare next window of TXT with PAT.
	 * 		TXT = "AAAAABAAABA" 
	 * 		PAT =  "AAAA" 			(window shifted one position)
	 * This is where KMP does optimization over naive approach.
	 * In this second window, we only compare 4th character of PAT with 4th character of current window of TXT to decide whether current window matches or not.
	 * Since we know that the first three characters will anyway match, we skipped matching first three characters. 
	 * 
	 */
	
}
