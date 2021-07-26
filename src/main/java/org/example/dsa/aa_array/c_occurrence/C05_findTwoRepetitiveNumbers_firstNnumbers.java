package org.example.dsa.aa_array.c_occurrence;

/**
 * ***************************************************************************************
 * Find two repetitive numbers from first N natural numbers
 * ***************************************************************************************
 * Input:  {4, 2, 4, 5, 2, 3, 1}
 * Output: 4 and 2
 * 
 * ***************************************************************************************
 */

public class C05_findTwoRepetitiveNumbers_firstNnumbers {
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * for (i=0 to n-1) {
	 * 	  value = HASHMAP.get(A[i]);
	 * 	  
	 * 	  if (value == null)
	 * 	     HASHMAP.put(A[i], 1);
	 * 	  else if (value == 2)
	 * 	     return A[i];
	 * 	  else
	 * 	     HASHMAP.put(A[i], value++);
	 * }
	 * 
	 * TIME -- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * --------------------
	 * ---USING INDEXING---
	 * --------------------
	 * For every index visit a[index] index.
	 * if it is positive change the sign of element at a[index] index, else print the element.
	 * 
	 * ------------
	 * for (i=0 to n-1) {
	 *    if (A[Math.abs(A[i])] < 0) {
	 *       print Math.abs(A[i]);
	 *    }
	 * 	  A[Math.abs(A[i])] = -A[Math.abs(A[i])];
	 * }
	 * 
	 * TIME -- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---USING SUM & PRODUCT---
	 * -------------------------
	 * In Array two elements X,Y are repeating
	 * 
	 * SUM = sum of n numbers = n(n+1)/2
	 * SUM_A = sum of all elements in array = SUM+(X+Y)
	 * 
	 * PROD = product of n numbers = n!
	 * PROD_A = product of all elements in array = PROD*(X*Y)
	 * 
	 * --->	X+Y = SUM_A - SUM
	 * --->	XY = PROD_A / PROD
	 * ---> X-Y = sqrt((X+Y)^2 - 4XY)
	 * 
	 * From X+Y and X-Y we can get their values
	 * 
	 */
}
