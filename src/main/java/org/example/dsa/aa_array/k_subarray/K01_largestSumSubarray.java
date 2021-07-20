package org.example.dsa.aa_array.k_subarray;

/**
 * *****************************************************************************
 * Find the subarray that has the largest sum
 * *****************************************************************************
 * Input:  {-2, -3, 4, -1, -2, 1, 5, -3}
 * 		     0   1  2   3   4  5  6   7
 * Output: 7								//sum of elements in {4, -1, -2, 1, 5} is 7
 * 
 * Input:  {-5, 4, 6, -3, 4, -1}
 * 			 0  1  2   3  4   5
 * Output: 11								//sum of elements in {4, 6, -3, 4} is 11
 * 
 * *****************************************************************************
 */

public class K01_largestSumSubarray {
	/*
	 * ------------------------
	 * ---KADANE'S ALGORITHM---
	 * ------------------------
	 * max_so_far = Integer.MIN;
	 * sum = 0;
	 * 
	 * for (i=0 to length) {
	 * 	  sum = sum + A[i]
	 *    
	 *    if (sum < 0)
	 *       sum = 0;
	 *    
	 *    max_so_far = max(max_so_far, sum)
	 * }
	 * return max_so_far;
	 * 
	 * 
	 * 
	 * for i=0	-->	sum = sum+A[0] = 0+(-2) = -2 ~~ 0	// max_so_far = 0
	 * for i=1	-->	sum = sum+A[1] = 0+(-3) = -3 ~~ 0 	// max_so_far = 0
	 * for i=2	-->	sum = sum+A[2] = 0+(4)  = 4			// max_so_far = 4 (as sum is bigger than current value of max) 
	 * for i=3	-->	sum = sum+A[3] = 4+(-1) = 3			// max_so_far = 4
	 * for i=4	-->	sum = sum+A[4] = 3+(-2) = 1			// max_so_far = 4
	 * for i=5	-->	sum = sum+A[5] = 1+(1)  = 2			// max_so_far = 4
	 * for i=6	-->	sum = sum+A[6] = 2+(5)  = 7			// max_so_far = 7 (as sum is bigger than current value of max)
	 * for i=7	-->	sum = sum+A[7] = 7+(-3) = 4			// max_so_far = 7
	 * 
	 */
}