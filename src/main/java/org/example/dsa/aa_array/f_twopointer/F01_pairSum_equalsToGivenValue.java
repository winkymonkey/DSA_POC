package org.example.dsa.aa_array.f_twopointer;

/**
 * ***************************************************************************************
 * Pair sum ---------- equals to a given value
 * ***************************************************************************************
 * Find a pair whose sum is equal to a given value
 * ***************************************************************************************
 * Input:  { 1, 4, 45, 6, 10, -8 }		SUM = 16
 * Output: YES							//10+6
 * 
 * Input:  { 1, 4, 45, 6, 10, -8 }		SUM = 14
 * Output: YES							//4+10
 * 
 * ***************************************************************************************
 */

public class F01_pairSum_equalsToGivenValue {
	/*
	 * -----------------------------
	 * ---USE TWO POINTER APROACH---
	 * -----------------------------
	 * Sort the array ----- { -8, 1, 4, 6, 10, 45 }
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
	 * Traverse the array & store all elements in a HASHMAP
	 * 
	 * Traverse the array again
	 * for each A[i], check if SUM-A[i] exists in the HASHMAP of not
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
}
