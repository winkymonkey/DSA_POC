package org.example.dsa.bbbbbbb_slidingWindow.fixed;

/**
 * ***************************************************************************************
 * Find the subarray that has the least average of size `k`
 * ***************************************************************************************
 * Input:	A[] = {3, 7, 90, 20, 10, 50, 40}
 * 			k = 3
 * Output:  index 3,4,5							//{20,10,50}
 * 
 * Input:	A[] = {3, 7, 5, 20, -10, 0, 12}
 * 			k = 2
 * Output:  index 4,5							//{-10,0}
 * 
 * ***************************************************************************************
 */

public class A06_leastAvgSubarrayOfSizeK {
	/*
	 * ------------------------------
	 * ---USE FIXED SLIDING WINDOW---
	 * ------------------------------
	 * The idea is to use sliding window of size `k`
	 * Keep track of sum of current `k` elements
	 * To compute sum of next window, remove first element of current window & add next element
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * ----------------------
	 * startIndex = 0
	 * sum = 0;
	 * for (i=0 to k-1)
	 * 	  sum += A[i];
	 * 
	 * minSum = sum;
	 * 
	 * for (i=k to n-1) {
	 * 	  sum = sum + A[i] - A[i-k];		//Add current item & remove first item of previous subarray
	 * 	  if (sum < minSum) {
	 *       minSum = sum;
	 *       startIndex = i-k+1;
	 * 	  }
	 * }
	 * 
	 * The range is between 'startIndex' and 'startIndex + k - 1'
	 * 
	 */
}
