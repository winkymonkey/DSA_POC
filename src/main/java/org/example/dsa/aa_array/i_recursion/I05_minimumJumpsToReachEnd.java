package org.example.dsa.aa_array.i_recursion;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Minimum number of jumps to reach end
 * ***************************************************************************************
 * Given an array of integers where each element represents the max number of steps that can be made forward from that element.
 * Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element).
 * If an element is 0, they cannot move through that element.
 * ***************************************************************************************
 * Input:  A[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3 (1->3->8->9) OR (1->3->9->9) OR ....
 * 
 * Input:  A[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5}
 * Output: 4 (1->3->6->9->5) OR (1->3->3->6->5) OR (1->3->2->6->5) OR ....
 * 
 * Input:  A[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
 * Output: 10 (1->1->1->1->1->1->1->1->1->1)
 * 
 * ***************************************************************************************
 */

public class I05_minimumJumpsToReachEnd {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Start from the first element and recursively call for all the elements reachable from first element.
	 * The minimum number of jumps to reach end from first can be calculated using 
	 * 'minimum number of jumps needed to reach end from the elements reachable from first'.
	 * 
	 * For input A[] = { 1, 3, 5, 8, 9 }, the recursion tree is as below
	 *                   0  1  2  3  4
	 * 
	 * 
	 * 
	 *                       min(0,4)
	 *                        __|
	 *                       /
	 *               	min(1,4)                -->take minimum of 'returned value from all function calls' at this level
	 *              ________|________
	 *             /        |        \
	 *         min(2,4)  min(3,4)   min(4,4)    -->take minimum of 'returned value from all function calls' at this level
	 *          __|__       |__
	 *         /     \         \
	 *    min(3,4) min(4,4)  min(4,4)           -->take minimum of 'returned value from all function calls' at this level
	 *      __|
	 *     /
	 * min(4,4)                                 -->take minimum of 'returned value from all function calls' at this level
	 * 
	 * 
	 * TIME --- O(n^n)							// there are 'n' possible ways to move from an element. For n elements it will be n^n.
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT SOLUTION---
	 * ------------------------
	 * If we observe the recursion tree, we can see that there are a few subtrees which repeating.
	 * For example, minJumps(3,4) is invoked twice.
	 * So we can say that we found overlapping subproblems, hence we can use Dynamic Programming
	 * We are following top-down (memoization) approach here.
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String args[]) {
		int A[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5, 3, 5, 2, 4, 7, 3, 3, 5, 7, 4, 4, 1, 2, 4, 2, 3, 6 };
		//			0  1  2  3  4  5  6  7  8  9  10
		
		System.out.println(findMinimumJumps(A, 0, A.length-1));
		
		table = new int[A.length][A.length];
		for (int i=0; i<table.length; i++) {
			Arrays.fill(table[i], -1);
		}
		System.out.println(findMinimumJumpsDynamic(A, 0, A.length-1));
	}
	
	
	private static int findMinimumJumps(int A[], int start, int end) {
		if (start == end)											// when we reach destination
			return 0;
		
		if (A[start] == 0)											// nowhere to go from this index
			return -1;

		int min = Integer.MAX_VALUE;
		for (int i=start+1; i<=end && i<=start+A[start]; i++) {
			int jumps = findMinimumJumps(A, i, end);
			min = Math.min(jumps, min);
		}
		return min+1;
	}
	
	
	
	
	private static int table[][] = {};
	
	private static int findMinimumJumpsDynamic(int A[], int start, int end) {
		if (table[start][end] == -1) {
			if (end == start)
				return 0;
			
			if (A[start] == 0)
				return -1;
	
			int min = Integer.MAX_VALUE;
			for (int i=start+1; i<=end && i<=start+A[start]; i++) {
				int jumps = findMinimumJumpsDynamic(A, i, end);
				table[start][end] = jumps+1;
				min = Math.min(jumps, min);
			}
			return min+1;
		}
		else {
			return table[start][end];
		}
	}
	
}
