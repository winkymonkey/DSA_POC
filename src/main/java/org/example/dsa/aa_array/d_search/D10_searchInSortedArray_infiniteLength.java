package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find position of an element in a sorted array of infinite numbers
 * *****************************************************************************
 */

public class D10_searchInSortedArray_infiniteLength {
	/*
	 * Since array is sorted, the first thing that comes to mind is `binary search`
	 * But here the concern is we don't know size of array, so we don't have proper bounds to apply binary search
	 * Hence to find position of `X`, first we find bounds cleverly and then apply binary search algorithm
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
