package org.example.dsa.aa_array.b_sum_difference;

/**
 * *****************************************************************************
 * Find a pair whose sum is equal to a given value
 * *****************************************************************************
 * Input:  {1, 4, 45, 6, 10, -8}		SUM = 16
 * Output: YES							//10+6
 * 
 * Input:  {1, 4, 45, 6, 10, -8}		SUM = 14
 * Output: YES							//4+10
 * 
 * *****************************************************************************
 */

public class B01_findPairSum_equalsToGivenValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for (i=0 to n-2)
	 *    for (j=i+1 to n-1)
	 *       if (A[i] + A[j] == SUM)
	 *          return true
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ------------------------------
	 * ---USE FIXED SLIDING WINDOW---
	 * ------------------------------
	 * Sort the array	{-8, 1, 4, 6, 10, 45}
	 * 
	 * l = 0
	 * r = n-1
	 * while (l < r) {
	 * 	  if (A[l]+A[r] == SUM)
	 *       return true;
	 * 	  
	 *    else if (A[l]+A[r] < SUM)
	 *       l++
	 * 	  
	 *    else if (A[l]+A[r] > SUM)
	 *       r--
	 *    
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 * 	  if (HASHMAP.contains(SUM-A[i]))
	 *       //the pair is A[i] and SUM-A[i]
	 * 	  else
	 *       HASHMAP.put(A[i], 999999)
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
}
