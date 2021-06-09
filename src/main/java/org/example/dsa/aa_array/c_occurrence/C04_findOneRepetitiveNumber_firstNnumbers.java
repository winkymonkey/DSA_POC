package org.example.dsa.aa_array.c_occurrence;

/**
 * *****************************************************************************
 * Find one repetitive number from first N natural numbers
 * *****************************************************************************
 * Input:  {1, 3, 2, 3, 4}
 * Output: 3
 * 
 * Input:  {1, 5, 1, 2, 3, 4}
 * Output: 1
 * 
 * *****************************************************************************
 */

public class C04_findOneRepetitiveNumber_firstNnumbers {
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
	 * ELEMENT = (SUM1 - SUM2) --> repeating element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * X1 = XOR of array elements
	 * X2 = XOR of first (n-1) natural numbers
	 * X1^X2 = repeating element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Use a hash table to store elements visited.
	 * If a seen element appears again, we return it.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * --------------------
	 * ---USING INDEXING---
	 * --------------------
	 * item		[1]  5  [1]  2  3  4
	 * index     0  [1]  2   3  4  5
	 * 
	 * There are two such items whose values are same.
	 * That means if we can denote indexes using those item values, two such item will point to same index.
	 * So we should find which two items are pointing to same indexes.
	 * So we can traverse the A[]
	 *  - for every index 'i' visit 'A[i]' index
	 *     - if it is positive --> change the sign of it
	 *     - if it is negative --> break and print it
	 * 
	 * --------
	 * for (i=0 to n-1) {
	 *    element = A[Math.abs(A[i])]
	 *    if (element < 0) {
	 *       missingElement = A[i]
	 *       break
	 *    }
	 * 	  A[Math.abs(A[i])] = -A[Math.abs(A[i])]
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
