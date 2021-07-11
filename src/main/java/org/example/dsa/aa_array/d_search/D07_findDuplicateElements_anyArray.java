package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find duplicate elements in an array
 * *****************************************************************************
 * Input:  {10, 5, 3, 4, 3, 5, 6}
 * Output: 5
 * 
 * Input:  {6, 10, 5, 4, 9, 120, 4, 6, 10}
 * Output: 6
 * 
 * *****************************************************************************
 */

public class D07_findDuplicateElements_anyArray {
	/*
	 * -----------------
	 * ---USE SORTING---
	 * -----------------
	 * A[] = {10, 5, 3, 4, 3, 5, 6}
	 * TEMP[] = {3, 3, 4, 5, 5, 6, 10}	//sorted version 	//O(nLogn)
	 * 
	 * for (i=0 to length) {
	 * 	  find A[i] in TEMP[] using binary search
	 * 	  if it's found more than once, return A[i]
	 * }
	 * 
	 * TIME --- O(nLogn) + n*O(Logn)	[to sort]+[for each element in A[] do a binary search in TEMP[]]
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Traverse the given array from right to left
	 * for each element, if it already exists in Hash, save its index in MIN
	 * otherwise, add it in HASH
	 * 
	 * after traversal MIN has the index is last found duplicate element which is nothing but first duplicate element in array
	 * print A[MIN]
	 * 
	 */
}
