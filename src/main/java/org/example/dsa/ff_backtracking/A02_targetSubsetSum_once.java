package org.example.dsa.ff_backtracking;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Target Subset Sum --- can be picked once
 * ***************************************************************************************
 * An array of distinct integers (candidates) and a target integer (target) is given.
 * You should return a list of all unique combinations of "candidates" where their sum equals to "target".
 * The same candidate can be chosen only once.
 * ***************************************************************************************
 * Input:  A = {1,2,3,4}	 	target = 5
 * Output: 2								//{1,4},{2,3}
 * 
 * ***************************************************************************************
 */

public class A02_targetSubsetSum_once {
	/*
	 * --------------------
	 * When we need to find all possible combinations from a set of elements, we can
	 * 	- PICK the element
	 *  - NOT PICK the element
	 * 
	 * Here an element can be picked once.
	 * So if we PICK an element, we reduce the element count, and reduce the 'target'
	 * And if we NOT PICK an element, we reduce the element count, but don't reduce the 'target'
	 * 
	 * We start from the last element.
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = { 1,2,3,4 };
		int target = 5;
		
		int ways = findWays(A, A.length, target);
		System.out.println(ways);
		
		int ways2 = findWays_dynamic(A, A.length, target);
		System.out.println(ways2);
	}
	
	
	private static int findWays(int A[], int n, int target) {
		if (target < 0)
			return 0;
		
		if (target == 0)
			return 1;
		
		if (n <= 0 && target >= 1)						// no coins left, but target is not achieved yet
			return 0;
		
		int count1 = findWays(A, n-1, target-A[n-1]);	// PICK A[n-1]
		int count2 = findWays(A, n-1, target);			// NOT PICK A[n-1]
		return count1+count2;
	}
	
	
	
	/*
	 * --------------------
	 * Dynamic Programming solution
	 * --------------------
	 */
	private static int lookup[][] = new int[100][100];					// should be 'n'*'target' size
	static {
		for (int i=0; i<lookup.length; i++) {
			Arrays.fill(lookup[i], -1);
		}
	}
	
	private static int findWays_dynamic(int A[], int n, int target) {
		if (target < 0)
			return 0;
		
		if (target == 0)
			return 1;
		
		if (n <= 0 && target >= 1)						// no coins left, but target is not achieved yet
			return 0;
		
		if (lookup[n][target] != -1)
			return lookup[n][target];
		
		int count1 = findWays(A, n-1, target-A[n-1]);	// PICK A[n-1]
		int count2 = findWays(A, n-1, target);			// NOT PICK A[n-1]
		return lookup[n][target] = count1+count2;
	}
}
