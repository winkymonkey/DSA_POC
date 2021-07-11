package org.example.dsa.aa_array.b_sum_difference;

/**
 * *****************************************************************************
 * Find a pair whose sum is equal to a given value in a sorted and rotated array
 * *****************************************************************************
 * Input:  {11, 15, 6, 8, 9, 10}		SUM=16
 * Output: true
 * 
 * Input:  {11, 15, 26, 38, 9, 10} 		SUM=45
 * Output: false
 * 
 * *****************************************************************************
 */

public class B04_findPairSum_equalsToGivenValue_inSortedRotatedArray {
	/*
	 * We already know how to solve such problems (using sliding window technique) if it's a regular sorted array
	 * We can extend that solution here
	 * 
	 * Find the pivot element in O(Logn) time ---> It is the Largest
	 * The number next to largest ---> It is the Smallest
	 * 
	 * Now consider Smallest as Left and Largest as Right
	 * Now apply sliding window technique
	 * But here the indexes are incremented and decremented in rotational manner using modular arithmetic
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
