package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find maximum difference between nearest left and right smaller elements
 * *****************************************************************************
 * Given an array of integers, the task is to 
 * find the maximum absolute difference between the nearest left & the right smaller element 
 * of every element in the array.
 * 
 * Note: 
 * If there is no smaller element on right/left side of any element then we take zero as the smaller element.
 * For example for the leftmost element, the nearest smaller element on the left side is considered as 0.
 * Similarly, for rightmost elements, the smaller element on the right side is considered as 0.
 * *****************************************************************************
 * I/P: {2, 1, 8}
 * O/P: 1						//Left smaller  LS[] = {0,0,1}
 * 								//Right smaller RS[] = {1,0,0}
 * 								//Max_diff = abs(LS[i]-RS[i]) = 1 
 * 
 * I/P: {2, 4, 8, 7, 7, 9, 3}
 * O/P: 4						//Left smaller  LS[] = {0,2,4,4,4,7,2}
 * 								//Right smaller RS[] = {0,3,7,3,3,3,0}
 * 								//Max_diff = abs(LS[i]-RS[i]) = 7-3 = 4
 * 
 * *****************************************************************************
 */

public class D12_maxDiff_nearestLeftAndRightSmallerElements {
	/*
	 * This is based on "Next Greater Element"
	 *  - Find Next Smaller Element & maintain them in an array LS[]
	 *  - Reverse the input array
	 *  - Find Next Smaller Element & maintain them in an array RS[]
	 *  - Traverse a loop & compare LS[i] and RS[i]
	 * 
	 */
}
