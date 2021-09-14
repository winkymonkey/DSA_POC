package org.example.dsa.ff_backtracking;

/**
 * ***************************************************************************************
 * Target Subset Sum --- can be picked once
 * ***************************************************************************************
 * An array of distinct integers (candidates) and a target integer (target) is given.
 * You should return a list of all unique combinations of "candidates" where their sum equals to "target".
 * The same candidate can be chosen only once.
 * ***************************************************************************************
 * Input:  candidates = [12,1,2,7,6,1,5] 		target = 7
 * Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
 * 
 * ***************************************************************************************
 */

public class A03_targetSubsetSum_nonrepeat {
	/*
	 * --------------------
	 * This problem is almost same the previous problem.
	 * The only difference is that --- we can PICK an element only once.
	 * 
	 * In previous problem, when we were picking A[i] we were not incrementing "i" as the same A[i] once again.
	 * But in this problem, irrespective of whether we pick or don't pick "i", we must increment "i"
	 * 
	 * If the output is required to be in sorted order, we should sort the array before starting the process.
	 * If the output is required to be unique, we should use set instead of list.
	 * --------------------
	 */
}
