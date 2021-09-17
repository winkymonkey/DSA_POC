package org.example.dsa.aa_array.m_subarray;

/**
 * ***************************************************************************************
 * Largest Sum Subarray
 * ***************************************************************************************
 * Find the subarray that has the largest sum (excluding all elements of B[])
 * ***************************************************************************************
 * Input:  A[] = {1, 7, -10, 6, 2}
 * 		   B[] = {5, 6, 7, 1}
 * Output: 2						//{2}
 * 
 * Input:  A[] = {3, 4, 5, -4, 6}
 * 		   B[] = {1, 8, 5}
 * Output: 7						//{3,4}
 * 
 * ***************************************************************************************
 */

public class M02_largestSumSubarray_excludingFew {
	
	public static void main(String[] args) {
		int A[] = {3, 4, 5, -4, 6};
		int B[] = {1, 8, 5};
		int ans = maxSubarraySum(A, B);
		System.out.println(ans);
	}
	
	
	private static int maxSubarraySum(int A[], int B[]) {
		int localMax = A[0];
		int globalMax = A[0];

		for (int i=1; i<A.length; i++) {
			if (isPresent(B, A[i])) {
				localMax = 0;
			}
			else {
				localMax = Math.max(A[i], localMax+A[i]);
				globalMax = Math.max(globalMax, localMax);
			}
		}
		return globalMax;
	}
	
	
	private static boolean isPresent(int B[], int elem) {
		for (int i=0; i<B.length; i++)
			if (B[i] == elem)
				return true;

		return false;
	}
	
}
