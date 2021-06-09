package org.example.dsa.aa_array.j_statistics;

/**
 * *****************************************************************************
 * Find median of two sorted arrays of same size
 * *****************************************************************************
 * Input:  A[] = {1, 12, 15, 26, 38}
 * 		   B[] = {2, 13, 17, 30, 45}
 * 
 * Output: 16	//average of 15,17
 * 
 * 
 * Input:  A[] = {10, 15, 20, 25, 30}
 * 		   B[] = {50, 55, 60, 65, 70}
 * 
 * Output: 40	//average of 30,50
 * 
 * 
 * *****************************************************************************
 */

public class J01_findMedian_ofTwoSortedArraysOfSameSize {
	/*
	 * As the size of both the arrays are 'n'. Hence merged array size will be '2n' that means always even.
	 * Hence the median will be 'average of the middle two numbers'
	 * 
	 * Use merge procedure of merge sort
	 *  - while merging, keep the count of processed elements
	 *  - as soon as the count reaches 'n', that means we are at middle
	 *  - take the average of the elements at 'n' and 'n+1' in the merged array
	 * 
	 */
}
