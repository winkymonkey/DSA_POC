package org.example.dsa.aa_array.d_search;

/**
 * ***************************************************************************************
 * Find position of an element in a sorted array of infinite numbers
 * ***************************************************************************************
 */

public class D10_searchInSortedArray_infiniteLength {
	/*
	 * Since array is sorted, the obvious choice for searching is Binary Search.
	 * But here we don't know size of array. Hence we don't have proper bounds to apply binary search.
	 * Hence to find an element, first we compute the bounds cleverly and then apply binary search algorithm.
	 * 
	 * ------------------
	 * low = 0
	 * high = 1
	 * 
	 * FUNC(low, high) {
	 *    if (X == A[high]) {
	 * 	     //return
	 *    }
	 *    else if (X > A[high]) {
	 * 	     high = high*2
	 * 	     low = high
	 *       FUNC(low, high);
	 *    }
	 *    else {
	 * 	     //apply binary search between indices 'low' and 'high'
	 *    }
	 * }
	 * 
	 */
}
