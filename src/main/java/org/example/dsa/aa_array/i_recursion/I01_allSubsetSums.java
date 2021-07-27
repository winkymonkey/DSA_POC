package org.example.dsa.aa_array.i_recursion;

/**
 * ***************************************************************************************
 * Print sums of all subsets in an array
 * ***************************************************************************************
 * Input:  { 3, 1, 2 }
 * Output: 0 3 1 2 4 5 3 6
 * ***************************************************************************************
 */

public class I01_allSubsetSums {
	/*
	 * --------------------
	 * A[] = { 3, 1, 2 }
	 * 
	 * Subsets are:
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
	 * If we pick A[i], then sum=sum+A[i], otherwise sum will remain intact
	 * Irrespective of whether we pick or not pick A[i], index will always be incremented from i to i+1
	 * 
	 * TIME --- O(2^n)
	 * SPACE -- O(2^n)
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = {3, 1, 2};
		findSubsets(0, A, 0);
	}
	
	
	private static void findSubsets(int index, int A[], int sum) {
		if (index == A.length) {
			System.out.print(sum + " ");
			return;
		}
		
		findSubsets(index+1, A, sum+A[index]);							// when we pick A[i]
		findSubsets(index+1, A, sum);									// when we don't pick
	}
	
}
