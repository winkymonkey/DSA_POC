package org.example.dsa.gg_dynamicprog;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Find shortest common supersequence
 * ***************************************************************************************
 * Given two strings str1 and str2, the task is to find the length of the shortest string that has both str1 and str2 as subsequences.
 * ***************************************************************************************
 * Input:   s1=ABAC
 * 			s2=CAB
 * Output:  5				// CABAC
 * 
 * 
 * Input:   s1=AGGTAB
 * 			s2=GXTXAYB
 * Output:  9				// AGXGTXAYB
 * ***************************************************************************************
 */

public class A05_shortestCommonSupersequence {
	/*
	 * ----------------------------
	 * ---APPROACH 1 (using LCS)---
	 * ----------------------------
	 * For two given strings s1=ABAC and s2=CAB, the easiest possible super-sequence can be obtained by concatenated s1 and s2
	 * 
	 * Below are some different valid super-sequence.
	 * > ABACCAB
	 * > ABCACAB
	 * 
	 * But instead of taking the common characters between s1 & s2, we can take those only once. It will help us to reduce the super-sequence length.
	 * > ABACAB
	 * > CABAC
	 * 
	 * Hence if we can find the common (overlapping) characters, we can include those only once.
	 * Mathematically, we can say that ---
	 * 		Length of smallest super-sequence = (length of s1) + (length of s2) - (length of LCS)
	 * 
	 * 
	 * -------------
	 * pointer i will traverse s1
	 * pointer j will traverse s2
	 * pointer k will traverse LCS
	 * 
	 * while (k<LCS.length) {
	 *    while (s1[i] != LCS[k]) {
	 *       result += s1[i];
	 *       i++;
	 *    }
	 *    while (s2[j] != LCS[k]) {
	 *       result += s2[j];
	 *       j++;
	 *    }
	 *    result += LCS[k];
	 *    i++;
	 *    j++;
	 *    k++;
	 * }
	 * 
	 * if (i != s1.length) {
	 *    while (i != s1.length) {
	 *       result += s1[i];
	 *       i++;
	 *    }
	 * }
	 * if (j != s2.length) {
	 *    while (j != s2.length) {
	 *       result += s2[j];
	 *       j++;
	 *    }
	 * }
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---APPROACH 2 (direct recursive)---
	 * -----------------------------------
	 * TIME --- O(2^ min(m,n))
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---DYNAMIC PROGRAMMING---
	 * -------------------------
	 * As it has repeating subproblems that overlaps.
	 * So we can apply dynamic programming.
	 * Here we will apply Top-Down approach (memoization)
	 * 
	 * TIME --- O(mn)
	 * SPACE -- O(mn)
	 * 
	 */
	
	public static void main(String args[]) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int superseqLength = solution(arr1, arr2, len1, len2);
		System.out.println(superseqLength);
		
		int superseqLength2 = solution_dynamic(arr1, arr2, len1, len2);
		System.out.println(superseqLength2);
	}
	
	
	
	
	/*
	 * RECURSIVE SOLUTION
	 */
	private static int solution(char arr1[], char arr2[], int m, int n) {
		if (m == 0 || n == 0)
			return m+n;

		if (arr1[m-1] == arr2[n-1]) {
			return 1 + solution(arr1, arr2, m-1, n-1);
		}
		else {
			int length1 = solution(arr1, arr2, m-1, n);
			int length2 = solution(arr1, arr2, m, n-1);
			return Math.min(length1+1, length2+1);
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
	private static int solution_dynamic(char arr1[], char arr2[], int m, int n) {
		if (m == 0 || n == 0)
			return m+n;
		
		if (lookup[m-1][n-1] != -1) {
			return lookup[m-1][n-1];
		}
		else {
			if (arr1[m-1] == arr2[n-1]) {
				return lookup[m-1][n-1] = 1 + solution_dynamic(arr1, arr2, m-1, n-1);
			}
			else {
				int length1 = solution_dynamic(arr1, arr2, m-1, n);
				int length2 = solution_dynamic(arr1, arr2, m, n-1);
				return lookup[m-1][n-1] = Math.min(length1+1, length2+1);
			}
		}
	}
	
}
