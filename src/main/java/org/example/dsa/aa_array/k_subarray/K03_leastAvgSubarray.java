package org.example.dsa.aa_array.k_subarray;

/**
 * ***************************************************************************************
 * Find the subarray that has the least average of size `k`
 * ***************************************************************************************
 * Input:	A[] = {3, 7, 90, 20, 10, 50, 40}
 * 			k = 3
 * Output:  index 3,4,5							//{20,10,50}
 * 
 * Input:	A[] = {3, 7, 5, 20, -10, 0, 12}
 * 			k = 2
 * Output:  index 4,5							//{-10,0}
 * 
 * ***************************************************************************************
 */

public class K03_leastAvgSubarray {
	/*
	 * ------------------------------
	 * ---USE FIXED SLIDING WINDOW---
	 * ------------------------------
	 * The idea is to use sliding window of size `k`
	 * Keep track of sum of current `k` elements
	 * To compute sum of next window, remove first element of current window & add immediate next element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * ----------------------
	 * res_index = 0
	 * sum = 0;
	 * for (i=0 to k)
	 * 	  sum += A[i];
	 * 
	 * min_sum = sum;
	 * 
	 * for (i=k to n) {
	 * 	  sum += A[i] - A[i-k];		//Add current item and remove first item of previous subarray
	 * 	  if (sum < min_sum) {
	 *       min_sum = sum;
	 *       res_index = (i+1)-k;
	 * 	  }
	 * }
	 * 
	 * The range is 'res_index' and '(res_index + k - 1)'
	 * 
	 */
}
