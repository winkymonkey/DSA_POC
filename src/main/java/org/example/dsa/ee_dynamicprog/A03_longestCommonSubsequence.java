package org.example.dsa.ee_dynamicprog;

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
	 */
	
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		int len1 = arr1.length;
		int len2 = arr2.length;

		System.out.println(findLcs(arr1, arr2, len1, len2));
	}
	
	
	private static int findLcs(char arr1[], char arr2[], int len1, int len2) {
		if (len1 == 0 || len2 == 0) {
			return 0;
		}
		if (arr1[len1-1] == arr2[len2-1]) {						// If last characters of both the strings are same
			return 1 + findLcs(arr1, arr2, len1-1, len2-1);		// Ignore last characters of both the strings & recur for remaining strings of lengths m-1 and n-1
		}
		else {
			int length1 = findLcs(arr1, arr2, len1, len2-1);	// find length of the longest subsequence while ignoring the last character of str1
			int length2 = findLcs(arr1, arr2, len1-1, len2);	// find length of the longest subsequence while ignoring the last character of str2
			return Math.max(length1, length2);					// pick the longest among these two
		}
	}
	
}
