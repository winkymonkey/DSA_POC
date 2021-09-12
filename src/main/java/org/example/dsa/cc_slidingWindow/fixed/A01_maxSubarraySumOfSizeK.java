package org.example.dsa.cc_slidingWindow.fixed;

/**
 * ***************************************************************************************
 * Find the maximum subarray sum  of size K
 * ***************************************************************************************
 * Input:  { 2, 5, 1, 8, 2, 9, 1 }		K=3
 * Output: 19									//8+2+9 = 19
 * ***************************************************************************************
 */

public class A01_maxSubarraySumOfSizeK {
	/*
	 * --------------------
	 * This is a fixed sliding window problem
	 * 		window start --- i
	 * 		window end ----- j
	 * 		window size ---- j-i+1
	 * 
	 * 
	 * -------------
	 * ■ INDEPENDENT CALCULATION
	 *    For each "j",
	 *    - we will keep on adding A[j] to a variable SUM which denotes the sum of current window.
	 * 
	 * ■ if windowSize < K
	 *    - j++
	 * 
	 * ■ if windowSize == K
	 * 	  ■ ANSWER CALCULATION
	 * 	     - we check if the current sum is greater than maxSoFar. If yes we update maxSoFar.
	 *    
	 *    ■ REVERT CALCULATION FOR i
	 *       As A[i] will be removed in next window,
	 *       - remove A[i] from sum
	 *    
	 * 	  ■ SLIDE AHEAD
	 *    	 - i++
	 *    	 - j++
	 * 
	 * 
	 * -------------
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {2, 5, 1, 8, 2, 9, 1};
		int K = 3;
		soltion(A, K);
	}
	
	
	private static void soltion(int A[], int K) {
		int i = 0, j = 0;
		int sum = 0;
		int maxSoFar = Integer.MIN_VALUE;
		
		while (j < A.length) {
			sum += A[j];
			
			if (j-i+1 < K) {
				j++;
			}
			else if (j-i+1 == K) {
				maxSoFar = Math.max(maxSoFar, sum);
				
				sum -= A[i];
				i++;
				j++;
			}
		}
		System.out.println(maxSoFar);
	}
	
}
