package org.example.dsa.aa_array.m_subarray;

/**
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
	 * This condition can be handled using two arrays,
	 * 		FW[] (forward array) --- store the current maximum subarray sum from index 0 to i.
	 * 		BW[] (backward array) --- store the current maximum subarray sum from index i to (n-1).
	 * 
	 * Initially, we traverse the array to populate FW[] and BW[].
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

		int fw[] = new int[n];
		int bw[] = new int[n];
		
		int curentMax = A[0];
		int maxTillNow = A[0];
		fw[0] = A[0];
		for (int i=1; i<n; i++) {
			curentMax = Math.max(A[i], curentMax+A[i]);
			fw[i] = curentMax;
			maxTillNow = Math.max(maxTillNow, curentMax);
		}
		
		curentMax = A[n-1];
		maxTillNow = A[n-1];
		bw[n-1] = A[n-1];
		for (int i=n-2; i>=0; i--) {
			curentMax = Math.max(A[i], curentMax+A[i]);
			bw[i] = curentMax;
			maxTillNow = Math.max(maxTillNow, curentMax);
		}
		
		int ans = maxTillNow;
		for (int i=1; i<n-1; i++) {							// choosing maximum ignoring i'th element
			ans = Math.max(ans, fw[i-1]+bw[i+1]);
		}
		return ans;
	}
	
}
