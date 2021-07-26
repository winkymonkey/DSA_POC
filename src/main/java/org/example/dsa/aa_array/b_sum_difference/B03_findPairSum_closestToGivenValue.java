package org.example.dsa.aa_array.b_sum_difference;

/**
 * ***************************************************************************************
 * Find a pair whose sum is closest to a given value
 * ***************************************************************************************
 * Input:  {10, 22, 28, 29, 30, 40}		X = 54
 * Output: 22 and 30
 * 
 * Input:  {1, 3, 4, 7, 10} 			X = 15
 * Output: 4 and 10
 * 
 * ***************************************************************************************
 */

public class B03_findPairSum_closestToGivenValue {
	/*
	 * ------------------------------
	 * ---USE FIXED SLIDING WINDOW---
	 * ------------------------------
	 * DIFF = Integer.Max
	 * min_l = 0
	 * min_r = n-1
	 * 
	 * l = 0
	 * r = n-1
	 * while (l < r) {
	 * 	  if (Math.abs(A[l] + A[r] - X) < DIFF) {
	 *       min_l = l;
	 *       min_r = r;
	 *       DIFF = Math.abs(A[l] + A[r] - X); 
	 * 	  }
	 *    
	 *    if (A[l]+A[r] < X)
	 *       l++
	 *    else
	 *       r++
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
