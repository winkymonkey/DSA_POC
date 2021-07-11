package org.example.dsa.aa_array.b_sum_difference;

/**
 * *****************************************************************************
 * Find a pair whose sum is closest to zero
 * *****************************************************************************
 * Input:  {1, 60, -10, 70, -80, 85, -72}
 * Output: -72 and 70
 * 
 * *****************************************************************************
 */

public class B02_findPairSum_closestToZero {
	/*
	 * ------------------------------
	 * ---USE FIXED SLIDING WINDOW---
	 * ------------------------------
	 * Sort the array		{-80, -72, 10, 1, 60, 70, 85}
	 * 
	 * min_sum = Integer.MAX
	 * min_l = 0
	 * min_r = n-1
	 * 
	 * l = 0
	 * r = n-1
	 * while (l < r) {
	 *    if (Math.abs(A[l]+A[r]) < Math.abs(min_sum)) {
	 *       min_sum = A[l]+A[r]
	 *       min_l = l
	 *       min_r = r
	 *    }
	 *    
	 *    if (A[l]+A[r] < 0)
	 *       l++
	 *    else
	 *       r--
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 */
}
