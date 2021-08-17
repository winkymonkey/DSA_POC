package org.example.dsa.aa_array.m_subarray;

/**
 * ***************************************************************************************
 * Find the subarray that has the largest sum
 * ***************************************************************************************
 * Input:  {-2, -3, 4, -1, -2, 1, 5, -3}
 * //	     0   1  2   3   4  5  6   7
 * Output: 7								//sum of elements in {4, -1, -2, 1, 5} is 7
 * 
 * Input:  {-5, 4, 6, -3, 4, -1}
 * 			 0  1  2   3  4   5
 * Output: 11								//sum of elements in {4, 6, -3, 4} is 11
 * 
 * ***************************************************************************************
 */

public class M01_largestSumSubarray {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * We look at each index and calculate the maximum subarray ending at that index.
	 * 
	 * {-2, -3, 4, -1, -2, 1, 5, -3}
	 *   0   1  2   3   4  5  6   7
	 * 
	 * maximum subarray ending at index 0 ----- maximum of (index0)
	 * maximum subarray ending at index 1 ----- maximum of (index1, index 1to0)
	 * maximum subarray ending at index 2 ----- maximum of (index2, index 2to1, index 2to0)
	 * maximum subarray ending at index 3 ----- maximum of (index3, index 3to2, index 3to1, index 3to0)
	 * .....
	 * .....
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---KADANE'S ALGORITHM---
	 * ------------------------
	 * It says that,
	 * maximum subarray ending at index 'i' is --- either of "current element" OR "current element + previous maximum subarray"
	 * Hence we can compare these two and ignore all other subarrays.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSubArraySum(A));
	}

	private static int maxSubArraySum(int A[]) {
		int localMax = A[0];
		int globalMax = A[0];

		for (int i=1; i<A.length; i++) {
			localMax = Math.max(A[i], localMax+A[i]);
			globalMax = Math.max(globalMax, localMax);
		}
		return globalMax;
	}
	
}
