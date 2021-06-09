package org.example.dsa.aa_array.c_occurrence;

/**
 * *****************************************************************************
 * Find one number that is occurring odd number of times
 * *****************************************************************************
 * Input:  {1, 2, 3, 2, 3, 1, 3}
 * Output: 3
 * 
 * Input:  {5, 7, 2, 7, 5, 2,} 
 * Output: 5
 * 
 * *****************************************************************************
 */

public class C01_findOneNumbers_occurringOddTimes {
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 * 	  if (HASHMAP.containsKey(A[i])) {
	 *       occurrence = HASHMAP.get(A[i]);
	 *       HASHMAP.put(A[i], occurrence++)
	 * 	  }
	 * 	  else {
	 *       HASHMAP.put(A[i], 1)
	 * 	  }
	 * }
	 * Traverse HASHMAP to find which KEY's VALUE is a odd number
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * Perform a Bitwise XOR of all elements
	 * It gives us odd occurring element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
