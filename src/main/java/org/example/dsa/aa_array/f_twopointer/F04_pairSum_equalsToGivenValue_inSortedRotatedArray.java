package org.example.dsa.aa_array.f_twopointer;

/**
 * ***************************************************************************************
 * Pair sum ---------- equal to a given value in a sorted and rotated array
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

public class F04_pairSum_equalsToGivenValue_inSortedRotatedArray {
	/*
	 * --------------------
	 * If it's a regular sorted array, we already know how to solve (using 2-pointer approach)
	 * We can extend that solution here
	 * 
	 * Find the pivot element ---> It is the Largest  (it becomes RIGHT)		//in O(Logn) time
	 * The number next to it ----> It is the Smallest (it becomes LEFT)
	 * 
	 * Now apply the 2-pointer approach, but the indexes should be incremented/decremented in rotational manner using modular arithmetic
	 * 
	 * It means,
	 * 		l = PIVOT+1		(SMALLEST)
	 * 		r = PIVOT		(LARGEST)
	 * 		while(l < r) -----------------> while(l != r)
	 * 		l++ --------------------------> l = (l+1)%n
	 * 		r-- --------------------------> r = (r-1+n)%n
	 * 		
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * --------------------
	 */
}
