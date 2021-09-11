package org.example.dsa.ff_backtracking;

/**
 * ***************************************************************************************
 * Combination Sum - can be picked once
 * ***************************************************************************************
 * An array of distinct integers (candidates) and a target integer (target) is given.
 * You should return a list of all unique combinations of "candidates" where their sum equals to "target".
 * The same candidate can be chosen only once.
 * the output must be in sorted order & it should not contain duplicates
 * ***************************************************************************************
 * Input:  candidates = [12,1,2,7,6,1,5] 		target = 7
 * Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
 * 
 * ***************************************************************************************
 */

public class A02_combinationSum_nonrepeat {
	/*
	 * --------------------
	 * In the previous problem, when we were picking A[i] we were not incrementing "i" as the same A[i] once again.
	 * But in this problem, as we can pick A[i] only once, we must increment "i"
	 * 
	 * In the previous problem, we were using a LIST data structure
	 * But here we have to use Set data structure which will remove duplicates
	 * 
	 * But when the ask is to print the results in sorted order, then it is concern.
	 * That's why, you should sort the array and then start the recursion.
	 * --------------------
	 */
}
