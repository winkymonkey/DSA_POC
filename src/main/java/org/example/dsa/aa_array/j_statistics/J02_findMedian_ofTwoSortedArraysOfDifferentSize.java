package org.example.dsa.aa_array.j_statistics;

/**
 * *****************************************************************************
 * Find median of two sorted arrays of different sizes
 * *****************************************************************************
 * Input:  A[] = {8}
 * 		   B[] = {5, 7, 10, 20}
 * 
 * Output: 8
 * 
 * 
 * Input:  A[] = {8, 12}
 * 		   B[] = {5, 7, 10, 20}
 * 
 * Output: 9					//average of 8,10
 * 
 * *****************************************************************************
 */

public class J02_findMedian_ofTwoSortedArraysOfDifferentSize {
	/*
	 * Add the sizes of two arrays. n=a+b
	 * 
	 * 
	 * If N is even
	 * 	- median is the average of the elements at 'n/2' and 'n/2 + 1'
	 * 	- start merge process of merge sort
	 *  - while merging keep the count of processed elements
	 *  - as soon as the count reaches 'n/2', that means we are at middle
	 *  - take the average of elements at 'n/2' and 'n/2 + 1'
	 * 
	 * 
	 * If N is odd
	 *  - median is the element at 'n-1/2'
	 *  - start merge process of merge sort
	 *  - while merging keep the count of processed elements
	 *  - as soon as the count reaches 'n-1/2', that means we are at middle
	 *  - take the element at 'n-1/2'
	 * 
	 */
}
