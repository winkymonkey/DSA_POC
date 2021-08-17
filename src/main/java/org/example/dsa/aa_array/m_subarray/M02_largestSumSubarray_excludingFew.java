package org.example.dsa.aa_array.m_subarray;

/**
 * ***************************************************************************************
 * Find the subarray that has the largest sum (excluding all elements of B[])
 * ***************************************************************************************
 * Input:  A[] = {1, 7, -10, 6, 2}
 * 		   B[] = {5, 6, 7, 1}
 * Output: 2						//{2}
 * 
 * Input:  A[] = {3, 4, 5, -4, 6}
 * 		   B[] = {1, 8, 5}
 * Output: 7						//{3,4}
 * 
 * ***************************************************************************************
 */

public class M02_largestSumSubarray_excludingFew {
	/*
	 * ---------------------------------
	 * ---MODIFIED KADANE'S ALGORITHM---
	 * ---------------------------------
	 * In legacy approach -----> We reset the sum when (sum<0)
	 * In this problem --------> We reset the sum when (sum<0 OR A[i] exists in B[])
	 * 
	 * 
	 * ----------
	 * maxSoFar = 0;
	 * sum = 0;
	 * for (i=0 to length) {
	 * 	  sum = sum + A[i]
	 * 	  
	 *    maxSoFar = max(maxSoFar, sum)
	 *    
	 *    if (sum < 0 || A[i] belongs to B[])	----> //only modification is in this line
	 *       sum = 0;
	 * }
	 * return maxSoFar;
	 * 
	 */
}
