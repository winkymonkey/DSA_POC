package org.example.dsa.aa_array.c_occurrence;

/**
 * *****************************************************************************
 * Find one missing number from first N natural numbers
 * *****************************************************************************
 * Input:  {1, 2, 4, 6, 3, 7, 8}
 * Output: 5
 * 
 * *****************************************************************************
 */

public class C03_findOneMissingNumber_firstNnumbers {
	/*
	 * -------------------
	 * ---USING SORTING---
	 * -------------------
	 * Sort the input array
	 * Traverse the array and check for missing
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------
	 * ---USING SUM---
	 * ---------------
	 * SUM1 = sum of array elements
	 * SUM2 = sum of first (n-1) natural numbers
	 * ELEMENT = (SUM2-SUM1) = missing element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------
	 * ---USING XOR---
	 * ---------------
	 * X1 = XOR of array elements
	 * X2 = XOR of first (n-1) natural numbers
	 * X1^X2 = missing element 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
