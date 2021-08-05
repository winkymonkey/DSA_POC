package org.example.dsa.aa_array.f_twopointer;

/**
 * ***************************************************************************************
 * Find a pair whose sum is equal to a given value in a sorted and rotated array
 * ***************************************************************************************
 * Input:  { 11, 15, 6, 8, 9, 10 }		SUM=16
 * Output: true
 * 
 * Input:  { 11, 15, 26, 38, 9, 10 } 	SUM=45
 * Output: false
 * 
 * ***************************************************************************************
 */

public class F04_findPairSum_equalsToGivenValue_inSortedRotatedArray {
	/*
	 * --------------------
	 * If it's a regular sorted array, we already know how to solve (using 2-pointer approach)
	 * We can extend that solution here
	 * 
	 * Find the pivot element ---> It is the Largest		// in O(Logn) time
	 * The number next to it ----> It is the Smallest
	 * 
	 * Now consider Smallest as Left and Largest as Right
	 * Now apply the same algorithm, but here the indexes should be incremented/decremented in rotational manner using modular arithmetic
	 * It means, 
	 * 		instead of doing l++, do it as l = (l+1)%n
	 * 		instead of doing r--, do it as r = (r-1+n)%n
	 * 		instead of running "while(l < r)" run it as "while(l != r)"
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * --------------------
	 */
}
