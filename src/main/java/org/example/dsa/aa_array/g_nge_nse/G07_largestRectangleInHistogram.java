package org.example.dsa.aa_array.g_nge_nse;

/**
 * ***************************************************************************************
 * Find the largest rectangle in histogram
 * ***************************************************************************************
 */

public class G07_largestRectangleInHistogram {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array and for every i,
	 * 		traverse the array from i to 0 to find the minimum height in left "leftMin"
	 * 		traverse the array from i to end to find the minimum height in right "rightMin"
	 * 		The largest rectangle in histogram is ----- (rightMin - leftMin +1)*A[i]
	 * 		Compute this value for each "i" and take the maximum
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---EFFICIENT SOLUION---
	 * -----------------------
	 * The above approach has a serious drawback
	 * To find the lowest bar on the left and right, array traversal is needed which reduces the efficiency of the solution.
	 * To make this efficient we must pre-compute the lowest bar on the left & right of every bar in linear time.
	 * Then we can use these pre-computed values to find largest rectangle in histogram for every array element.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
