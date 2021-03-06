package org.example.dsa.aa_array.h_sort;

/**
 * ***************************************************************************************
 * Sort an array by frequency
 * ***************************************************************************************
 * Input:  {2, 5, 2, 8, 5, 6, 8, 8}
 * Output: {8, 8, 8, 2, 2, 5, 5, 6}
 * 
 * Input:  {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
 * Output: {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 * 
 * ***************************************************************************************
 */

public class H03_sortByFrequency {
	/*
	 * ------------------------
	 * ---USE SORTING & HASH---
	 * ------------------------
	 * {2, 5, 2, 8, 5, 6, 8, 8}
	 * 
	 * Sort the array
	 * {2, 2, 5, 5, 6, 8, 8, 8}
	 * 
	 * Now create a hash to maintain the count
	 * {2->2, 5->2, 6->1, 8->3}
	 * 
	 * Now sort the hash by value
	 * {8->3, 2->2, 5->2, 6->1}
	 * 
	 * Now print the hash keys
	 * {8, 8, 8, 2, 2, 5, 5, 6}
	 * 
	 * 
	 * TIME --- O(nLogn)+O(n)+O(nLogn) = O(nLogn)
	 * SPACE -- O(n)
	 * 
	 * 
	 */
}
