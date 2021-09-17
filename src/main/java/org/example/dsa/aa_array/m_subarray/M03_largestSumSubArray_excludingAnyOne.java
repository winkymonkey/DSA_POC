package org.example.dsa.aa_array.m_subarray;

/**
 * ***************************************************************************************
 * Largest Sum Subarray
 * ***************************************************************************************
 * Find the subarray that has the largest sum (excluding any 1 element)
 * ***************************************************************************************
 * Input:  A[] = { 1, 2, 3, -4, 5 }
 * Output: 11										// by removing -4, we get {1, 2, 3, 5}
 * 
 * Input:  A[] = { -2, -3, 4, -1, -2, 1, 5, -3 }
 * Output: 9										// by removing -2, we get {4, -1, 1, 5}
 * 
 * ***************************************************************************************
 */

public class M03_largestSumSubArray_excludingAnyOne {
	/*
	 * --------------------
	 * If element removal condition is not applied, we can solve this problem using Kadane’s algorithm.
	 * But here one element can be removed.
	 * 
	 * This condition can be handled using two arrays,
	 * 		FW[] (forward array) ---- use Kadane's algorithm to store the current maximum subarray sum (localMax) in forward direction
	 * 		BW[] (backward array) --- use Kadane's algorithm to store the current maximum subarray sum (localMax) in backward direction
	 * 
	 * Initially, we traverse the given array to populate FW[] and BW[].
	 * Then we can use them for one element removal conditions as follows:
	 * 		At each index i, maximum subarray sum after ignoring i’th element will be FW[i-1] + BW[i+1].
	 * 		So we calculate this value of all "i" and then choose maximum among them. 
	 * --------------------
	 */
	
	public static void main(String arg[]) {
		int A[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(largestSumSubArray(A));
	}
	
	
	private static int largestSumSubArray(int A[]) {
		int n = A.length;

		int FW[] = new int[n];
		int BW[] = new int[n];
		
		FW[0] = A[0];
		int localMax = A[0];
		int globalMax = A[0];
		for (int i=1; i<n; i++) {
			localMax = Math.max(A[i], localMax+A[i]);
			globalMax = Math.max(globalMax, localMax);
			FW[i] = localMax;
		}													// FW[] = { -2, -3, 4, 3, 1, 2, 7, 4 }
		
		BW[n-1] = A[n-1];
		localMax = A[n-1];
		globalMax = A[n-1];
		for (int i=n-2; i>=0; i--) {
			localMax = Math.max(A[i], localMax+A[i]);
			globalMax = Math.max(globalMax, localMax);
			BW[i] = localMax;
		}													// BW[] = { 2, 4, 7, 3, 4, 6, 5, -3 }
		
		int ans = globalMax;
		for (int i=1; i<n-1; i++) {							// choosing maximum subarray ignoring i'th element (from 2nd index to 2nd last index)
			ans = Math.max(ans, FW[i-1]+BW[i+1]);
		}
		return ans;
	}
	
}
