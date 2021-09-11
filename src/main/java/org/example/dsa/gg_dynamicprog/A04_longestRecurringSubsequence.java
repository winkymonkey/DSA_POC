package org.example.dsa.gg_dynamicprog;

/**
 * ***************************************************************************************
 * Longest Repeating Subsequence
 * ***************************************************************************************
 * Given a string, find the length of the longest repeating subsequence such that the two subsequences don’t have same string character at the same position,
 * i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.
 * ***************************************************************************************
 */

public class A04_longestRecurringSubsequence {
	/*
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * This problem is just a modification of LCS problem.
	 * Here we need to find LCS of two same strings, but under some restriction.
	 * The restriction is i-th index in one string cannot be equals to the j-th index of the second string.
	 * 
	 * So the below logic should be updated:
	 * 		if (arr1[len1-1] == arr2[len2-1])
	 * 
	 * The updated logic should be:
	 * 		if (arr1[len1-1] == arr2[len2-1] && len1!=len2)
	 * 
	 * 
	 * TIME --- O(2^n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---DYNAMIC PROGRAMMING---
	 * -------------------------
	 * Like LCS, this problem can also be extended in dynamic programming which will bring down the time complexity.
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
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int subseqLength = findLrs(arr1, arr2, len1, len2);
		System.out.println(subseqLength);
	}
	
	
	private static int findLrs(char arr1[], char arr2[], int len1, int len2) {
		if (len1 == 0 || len2 == 0)
			return 0;
		
		if (arr1[len1-1] == arr2[len2-1] && len1!=len2) {		// If last characters of both the strings are same, but both have different lengths
			return 1 + findLrs(arr1, arr2, len1-1, len2-1);		// Ignore last characters of both the strings & recur for remaining strings of lengths m-1 and n-1
		}
		else {
			int length1 = findLrs(arr1, arr2, len1, len2-1);	// find length of the longest subsequence while ignoring the last character of str1
			int length2 = findLrs(arr1, arr2, len1-1, len2);	// find length of the longest subsequence while ignoring the last character of str2
			return Math.max(length1, length2);					// pick the longest among these two because we are asked to find out the Longest Common Subsequence
		}
	}
	
}
