package org.example.dsa.ee_recursion;

/**
 * ***************************************************************************************
 * Print sums of all subsets in an array
 * ***************************************************************************************
 * Input:  { 3, 1, 2 }
 * Output: 0 3 1 2 4 5 3 6
 * 
 * ***************************************************************************************
 */

public class A01_sumOfAllSubsets {
	/*
	 * --------------------
	 * A[] = { 3, 1, 2 }
	 * 
	 * All possible subsets are:
	 * 		{} -------- sum=0
	 * 		{3} ------- sum=3
	 * 		{1} ------- sum=1
	 * 		{2} ------- sum=2
	 * 		{3,1} ----- sum=4
	 * 		{3,2} ----- sum=5
	 * 		{1,2} ----- sum=3
	 * 		{3,1,2} --- sum=6
	 * 
	 * So at every i-th index, we have a choice of whether we want to pick it or not.
	 * 	- If we pick A[i], then A[i] is added in the "sum"
	 * 	- Otherwise "sum" remains intact.
	 * 
	 * Irrespective of whether we pick or not pick A[i], index is always incremented from i to i+1.
	 * We keep doing this as long as the index doesn't reach end.
	 * 
	 * TIME --- O(2^n)
	 * SPACE -- O(1)
	 * 
	 * ---------------
	 * Recursion Tree
	 * ---------------
	 *                                 [312],''
	 *                   _________________|_________________
	 *                  /                                   \
	 *              [12],'3'                              [12],''
	 *          ________|________                     ________|________
	 *         /                 \                   /                 \
	 *      [2],'31'           [2],'3'            [2],'1'            [2],''
	 *      ___|___            ___|___            ___|___            ___|___
	 *     /       \          /       \          /       \          /       \
	 *  [],'312'  [],'31'   [],'32'  [],'3'   [],'12'   [],'1'    [],'2'   [],''
	 *  _______   ______    ______   ______   ______    ______    ______   _____
	 *   sum=6    sum=4     sum=5    sum=3    sum=3     sum=1     sum=2    sum=0
	 *  
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = {3, 1, 2};
		findSubsets(A, 0, 0);
	}
	
	
	private static void findSubsets(int A[], int i, int sum) {
		if (i == A.length) {									// we reached the end
			System.out.print(sum + " ");						// leaf node
			return;
		}
		
		findSubsets(A, i+1, sum+A[i]);							// when we pick A[i]
		findSubsets(A, i+1, sum);								// when we don't pick A[i]
	}
	
}
