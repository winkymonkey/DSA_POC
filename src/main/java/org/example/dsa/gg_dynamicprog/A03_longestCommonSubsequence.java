package org.example.dsa.gg_dynamicprog;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Longest Common Subsequence
 * ***************************************************************************************
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, "abc", "abg", "bdf", "aeg", "acefg", .... etc are subsequences of "abcdefg". 
 * Given two sequences, find the length of longest subsequence present in both of them.
 * ***************************************************************************************
 * Input:  ABCDGH, AEDFHR
 * Output: 3				//ADH
 * 
 * Input:  AGGTAB, GXTXAYB
 * Output: 4				//GTAB
 * 
 * ***************************************************************************************
 */

public class A03_longestCommonSubsequence {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Suppose we have a string of length n
	 * We figure out all possible subsequences having lengths ranging from 1,2,3,.....n-1
	 * 
	 * Number of subsequences having length 1 ---- nC1
	 * Number of subsequences having length 2 ---- nC2  
	 * Number of subsequences having length 3 ---- nC3
	 * .....
	 * .....
	 * Number of subsequences having length n ---- nCn
	 * 
	 * So total number of subsequences = nC1 + nC2 + nC3 + ........ + nCn = 2^n - 1 
	 * 
	 * So finding out all possible subsequences of string-1 takes O(2^n) time which can be done in recursive way (PICK or NOT PICK way)
	 * So finding out all possible subsequences of string-2 takes O(2^n) time which can be done in recursive way (PICK or NOT PICK way)
	 * 
	 * Now we need to find out the subsequences which are common in them.
	 * It can be achieved in O(n) time.
	 * 
	 * TIME --- O(n*2^n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * We can process all characters one by one staring from either from left or right sides of both strings.
	 * Let us traverse from right side.
	 * 
	 * When we are examining the last characters of two strings, two possibilities can arise.
	 *  - two characters are SAME
	 *  	- ignore last characters of both the strings
	 *  	- recur for remaining strings of lengths m-1 and n-1
	 *  	- increment length by 1 because the matching character has now become part of LCS
	 *  
	 *  - two characters are DIFFERENT
	 * 		- now we can keep str1 intact & ignore last character of str2. And then we can proceed. 
	 * 		- now we can keep str2 intact & ignore last character of str1. And then we can proceed.
	 * 		- between these two whichever brings the maximum length, we pick that because our objective is to find the subsequence that is longest.
	 * 
	 * --------------
	 * Recursion Tree
	 * (a few branches are omitted for brevity)
	 * --------------
	 *                                                                F(AGGTAB,GXTXAYB)
	 *                                                                        |
	 *                                                                        |
	 *                                                             1 + F(AGGTA,GXTXAY)
	 *                                                             ___________|___________
	 *                                                            |                       |
	 *                                                     F(AGGTA,GXTXA)          F(AGGT,GXTXAY)
	 *                                                            |                  _____|_____
	 *                                                            |                 |           |
	 *                                                    1+ F(AGGT,GXTX)
	 *                             _______________________________|______________________________
	 *                            |                                                              |
	 *                       F(AGGT,GXT)                                                    F(AGG,GXTX)
	 *                            |                                                ______________|______________
	 *                            |                                               |                             |
	 *                      1+ F(AGG,GX)                                     F(AGG,GXT)                    F(AG,GXTX)
	 *                  __________|_________                                 _____|________________        _____|_____
	 *                 |                    |                               |                      |      |           |
	 *              F(AGG,G)             F(AG,GX)                       F(AGG,GX)              F(AG,GXT)
	 *             ____|____           ______|_____                  _______|_______          _____|_____
	 *            |         |         |            |                |               |        |           |
	 *        F(AGG,'')  F(AG,G)   F(AG,G)      F(A,GX)          F(AGG,G)       F(AG,GX)
	 *                      |         |        ____|____            |           _____|_____
	 *                      |         |       |         |           |          |           |
	 *                1+ F(A,'')   F(A,'')  F(A,G)  F('',GX)   1+ F(AG,'')  F(AG,G)      F(A,GX)
	 *                                     ___|___                             |         ___|___
	 *                                    |       |                            |        |       |
	 *                                 F(A,'')  F('',G)                   1+ F(A,'')  F(A,G) F('',GX)
	 *                                                                               ___|___
	 *                                                                              |       |
	 *                                                                           F(A,'')  F('',G)
	 * 
	 * TIME --- O(2^n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---DYNAMIC PROGRAMMING---
	 * -------------------------
	 * In the above recursion tree, there are many function calls which are computed repeatedly
	 * For example, F(AG,GX)
	 * 
	 * So we can apply dynamic programming here.
	 * We will apply Top-Down (memoization) approach here.
	 * 
	 * TIME --- O(mn)
	 * SPACE -- O(mn)
	 * 
	 */
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		int m = arr1.length;
		int n = arr2.length;
		
		int subseqLength = findLcs(arr1, arr2, m, n);
		System.out.println(subseqLength);
		
		int subseqLength2 = findLcs_dynamic(arr1, arr2, m, n);
		System.out.println(subseqLength2);
	}
	
	
	
	
	/*
	 * RECURSIVE APPROACH
	 */
	private static int findLcs(char arr1[], char arr2[], int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		
		if (arr1[m-1] == arr2[n-1]) {						// If last characters of both the strings are same
			return 1 + findLcs(arr1, arr2, m-1, n-1);		// Ignore last characters of both the strings & recur for remaining strings of lengths m-1 and n-1
		}
		else {
			int length1 = findLcs(arr1, arr2, m, n-1);		// find length of the longest subsequence while ignoring the last character of str1
			int length2 = findLcs(arr1, arr2, m-1, n);		// find length of the longest subsequence while ignoring the last character of str2
			return Math.max(length1, length2);				// pick the longest among these two because we are asked to find out the Longest Common Subsequence
		}
	}
	
	
	
	
	/*
	 * DYNAMIC PROGRAMMING APPROACH
	 */
	private static final int lookup[][];
	static {
		lookup = new int[1000][1000];							// it should be of size m*n
		for (int i=0; i<lookup.length; i++) {
			Arrays.fill(lookup[i], -1);
		}
	}
	private static int findLcs_dynamic(char arr1[], char arr2[], int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		
		if (lookup[m-1][n-1] != -1) {
			return lookup[m-1][n-1];
		}
		else {
			if (arr1[m-1] == arr2[n-1]) {										// If last characters of both the strings are same
				return lookup[m-1][n-1] = 1 + findLcs(arr1, arr2, m-1, n-1);	// Ignore last characters of both the strings & recur for remaining strings of lengths m-1 and n-1
			}
			else {
				int length1 = findLcs(arr1, arr2, m, n-1);						// find length of the longest subsequence while ignoring the last character of str1
				int length2 = findLcs(arr1, arr2, m-1, n);						// find length of the longest subsequence while ignoring the last character of str2
				return lookup[m-1][n-1] = Math.max(length1, length2);			// pick the longest among these two because we are asked to find out the Longest Common Subsequence
			}
		}
	}
	
}
