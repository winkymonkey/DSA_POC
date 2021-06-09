package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find a peak element in an array (i.e. an element that is NOT smaller than its neighbors)
 * NOTE: for corner elements, we need to consider only one neighbor.
 * *****************************************************************************
 * Input:  {5, 10, 20, 15}
 * Output: 20
 * 
 * Input:  {10, 20, 15, 2, 23, 90, 67}
 * Output: 20, 90
 * 
 * Input:  {10, 20, 30, 40, 50}
 * Output: 50
 * 
 * Input:  {100, 80, 60, 50, 20}
 * Output: 100
 * 
 * Input:  {10, 10, 10, 10, 10}
 * Output: all 10s
 * 
 * *****************************************************************************
 */

public class D05_findPeakElement {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array (linear search).
	 * Compare A[i] with neighbors.  
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------
	 * ---TRICKY APPROACH---
	 * ---------------------
	 * mid = (start+end)/2
	 * Start from A[mid]
	 * 
	 * if (A[mid] >= neighbors)
	 * 	  print A[mid]
	 * 	  return;
	 * if (A[mid] < left neighbor)
	 * 	  there is always a peak in left half
	 * 	  hence recursively call the function for left half
	 * if (A[mid] < right neighbor)
	 * 	  there is always a peak in right half
	 * 	  hence recursively call the function for right half
	 * 
	 * TIME --- O(Log n)
	 * SPACE -- O(Log n)
	 * 
	 */
}
