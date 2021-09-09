package org.example.dsa.ee_dynamicprog;

/**
 * ***************************************************************************************
 * Find minimum Edit Distance
 * ***************************************************************************************
 * Given two strings str1 & str2.
 * Only "INSERT", "DELETE", "REPLACE" operations can performed on str1.
 * Find minimum number of edits (operations) required to convert str1 into str2.
 * ***************************************************************************************
 * Input:   str1 = "geek"
 * 			str2 = "gesek"
 * Output: 1					//We can convert str1 into str2 by inserting a 's'.
 * 
 * Input:   str1 = "cat"
 * 			str2 = "cut"
 * Output: 1					//We can convert str1 into str2 by replacing 'a' with 'u'.
 * 
 * Input:   str1 = "sunday"
 * 			str2 = "saturday"
 * Output:  3					//We need to convert "un" to "atur".
 * 								//It can be done in 3 steps
 * 								//Replace 'n' with 'r', insert 't', insert 'a'
 * 
 * ***************************************************************************************
 */

public class A06_editDistance {
	/*
	 * --------------------
	 * We can process all characters one by one staring from either from left or right sides of both strings.
	 * Let us traverse from right corner.
	 * 
	 * When we are examining the last characters of two strings, two possibilities can arise. 
	 * 	- both characters are SAME
	 * 		- so nothing to do.
	 * 		- ignore last characters of both the strings & get count for remaining strings.
	 * 		- so we recur for lengths m-1 and n-1.
	 *  
	 *  - both characters are DIFFERENT
	 * 		- consider all three operations on last character of str1
	 * 		- so recursively compute minimum cost for all 3 operations (Insert,Delete,Remove) and take minimum of 3 values. 
	 * 			- INSERT ----- Recur for len1 and len2-1
	 * 			- DELETE ----- Recur for len1-1 and len2
	 * 			- REPLACE ---- Recur for len1-1 and len2-1 
	 * 
	 * 
	 * TIME --- O(3^m)
	 * SPACE -- O(1)
	 * 
	 * --------------
	 * Recursion Tree
	 * --------------
	 *                                   f(3,3)
	 *                ____________________________|____________________________
	 *               /                            |                            \
	 *            f(3,2)                        f(2,3)                        f(2,2)
	 *       ________|________             ________|________             ________|________
	 *      /        |        \           /        |        \           /        |        \
	 *   f(3,1)    f(2,2)    f(2,1)    f(2,2)    f(1,3)    f(1,2)    f(2,1)    f(1,2)    f(1,1)
	 *  ___|___   ___|___   ___|___   ___|___   ___|___   ___|___   ___|___   ___|___   ___|___
	 * /   |   \ /   |   \ /   |   \ /   |   \ /   |   \ /   |   \ /   |   \ /   |   \ /   |   \ 
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		String str1 = "sunday";
		String str2 = "saturday";
		int len1 = str1.length();
		int len2 = str2.length();
		
		int minDist = editDistance(str1.toCharArray(), str2.toCharArray(), len1, len2);
		System.out.println(minDist);
		
		int minDist2 = editDistance_dynamic(str1.toCharArray(), str2.toCharArray(), len1, len2);
		System.out.println(minDist2);
	}
	
	
	private static int editDistance(char arr1[], char arr2[], int len1, int len2) {
		if (len1 == 0)					//if first string is empty, the only option is to ---insert all characters of second string into first 
			return len2; 
		
		if (len2 == 0)					//if second string is empty, the only option is to --- remove all characters of first string
			return len1; 
		
		if (arr1[len1-1] == arr2[len2-1]) {						//if last characters of two strings are same, nothing to do.
			return editDistance(arr1, arr2, len1-1, len2-1);	//so ignore last characters of both the strings & get count for remaining strings.
		}
		
		int dist1 = editDistance(arr1, arr2, len1, len2-1);			//Insert at last character of first string
		int dist2 = editDistance(arr1, arr2, len1-1, len2);			//Delete at last character of first string
		int dist3 = editDistance(arr1, arr2, len1-1, len2-1);		//Replace at last character of first string
		
		return 1 + Math.min(dist1, Math.min(dist2, dist3));
		
	}
	
	
	/*
	 * --------------------
	 * The above approach runs in polynomial time.
	 * Now if we look carefully in the recursion tree, we can observe repeating sub problems that overlaps.
	 * Hence, we can apply dynamic programming here.
	 * We will be using top-down approach here as it is much easier to visualize.
	 * 
	 * So we will initially take an 2D array that will be our lookup table in memoization.
	 * Whenever characters of two string mismatch, we first search if the entry already exists in the lookup table or not.
	 * If yes, we skip further computations and return the value from the lookup table.
	 * Otherwise, we go ahead with regular computations.
	 * 
	 * 
	 * TIME --- O(len1 * len2)
	 * SPACE -- O(len1 * len2)
	 * --------------------
	 */
	
	private static int lookup[][] = new int[1000][1000];
	
	private static int editDistance_dynamic(char arr1[], char arr2[], int len1, int len2) {
		if (len1 == 0)								//if first string is empty, the only option is to --- INSERT all characters of second string into first 
			return len2; 
		
		if (len2 == 0)								//if second string is empty, the only option is to --- DELETE all characters of first string
			return len1; 
		
		if (lookup[len1][len2] != -1) {				// this is already computed and stored in memoization table.
			return lookup[len1][len2];
		}
		else {
			if (arr1[len1-1] == arr2[len2-1]) {									//if last characters of two strings are same, nothing to do.
				lookup[len1][len2] = editDistance(arr1, arr2, len1-1, len2-1);	//so ignore last characters of both the strings and get count for remaining strings.
				return lookup[len1][len2];
			}
			
			int dist1 = editDistance(arr1, arr2, len1, len2-1);			//INSERT at last character of first string
			int dist2 = editDistance(arr1, arr2, len1-1, len2);			//DELETE at last character of first string
			int dist3 = editDistance(arr1, arr2, len1-1, len2-1);		//REPLACE at last character of first string
			
			return 1 + Math.min(dist1, Math.min(dist2, dist3));
		}
	}

}
