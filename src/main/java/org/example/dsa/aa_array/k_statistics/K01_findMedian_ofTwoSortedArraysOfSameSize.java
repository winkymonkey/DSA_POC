package org.example.dsa.aa_array.k_statistics;

/**
 * ***************************************************************************************
 * Find median of two sorted arrays of same size
 * ***************************************************************************************
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
 * ***************************************************************************************
 */

public class K01_findMedian_ofTwoSortedArraysOfSameSize {
	/*
	 * Total size of two arrays = n+n = 2n 		=>always even
	 * 
	 * As total size is even, median is the average of the elements at 'n' and 'n+1'
	 * So start merge process of merge sort
	 *  	- while merging keep the count of processed elements
	 *  	- as soon as the count reaches 'n', it means that we are at middle
	 *  	- take the average of elements at 'n' and 'n+1'
	 * 
	 */
}
