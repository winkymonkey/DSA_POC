package org.example.dsa.aa_array.e_rotation;

/**
 * ******************************************************************************
 * Left rotate all elements of an array by d elements
 * ******************************************************************************
 * Input:  {10,20,30,40,50,60}		d = 2
 * Output: {30,40,50,60,10,20}
 * 
 * ******************************************************************************
 */

public class E01_howToRotate {
	/*
	 * ---------------------
	 * --ROTATE ONE BY ONE--
	 * ---------------------
	 * d = d % length				[for example, rotating A[] of size 5 by 14 times is equivalent to rotating it by (14%5=)4 times]
	 * for (i=0 to d) {
	 *    temp = A[0]
	 *    for (j=0 to j<n) {
	 *       A[j] = A[j+1]
	 *    }
	 *    A[j] = temp
	 * }
	 * 
	 * TIME --- O(nd)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * --------------------
	 * ---BLOCK REVERSAL---
	 * --------------------
	 * d = d % length				[E.g, rotating A[] of size 5 by 14 times is equivalent to rotating it by (14%5=)4 times]
	 * First reverse A[0, d-1]
	 * Then reverse A[d, n-1]
	 * Then reverse A[0, n-1]
	 * 
	 * For example,
	 * Input:             10 20 30 40 50 60
	 * after 1st step:    20 10 30 40 50 60
	 * after 2nd step:    20 10 60 50 40 30
	 * after 3rd step:    30 40 50 60 10 20
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ---DOUBLE ARRAY SOLUTION---
	 * ---------------------------
	 * for (i=0 to i<length) {					//Copy A[] twice in temp[0..2n-1] array
	 *    temp[i] = temp[i+length] = A[i];
	 * }
	 * d = d % length							[E.g, rotating A[] of size 5 by 14 times is equivalent to rotating it by (14%5=)4 times]
	 * for (i=d to d+length) {
	 *    print temp[i]
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ---SINGLE ARRAY SOLUTION---
	 * ---------------------------
	 * for (i=d to d+length) {
	 *    //print A[i % length]
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
