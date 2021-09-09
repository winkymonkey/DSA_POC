package org.example.dsa.aa_array.g_nge_nse;

/**
 * ***************************************************************************************
 * Find the largest rectangle in histogram
 * ***************************************************************************************
 * A[] = { 2, 1, 5, 6, 2, 3, 1 }
 * 
 * 
 * ***************************************************************************************
 */

public class G06_largestRectangleInHistogram {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * For each element in the array, 
	 * 	- We traverse leftwards until we find a bar smaller than A[i].
	 *  - Let us call it leftSmallerIndex.
	 *  - We traverse rightwards until we find a bar smaller than A[i].
	 * 	- Let us call it rightSmallerIndex.
	 * 	- This boundary from leftSmallerIndex to rightSmallerIndex forms the width.	//width = rightSmallerIndex - leftSmallerIndex + 1 
	 *  - So total area = A[i] * width
	 * 
	 * We need to pick the maximum value of the area computed for all elements in the array.
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------
	 * ---USE LSE and RSE---
	 * ---------------------
	 * This approach is based on the concept of "Left Smaller Element" and "Right Smaller Element"
	 * But here we will store indices instead of elements
	 * We will two arrays called "leftSmallerIndexArr" and "rightSmallerIndexArr"
	 * 
	 * For each element in the array,
	 * 	- compute and store leftSmallerIndex and store it in the leftSmallerIndexArr
	 * 
	 * For each element in the array,
	 *  - compute and store rightSmallerIndex and store it in the rightSmallerIndexArr
	 * 
	 * 
	 * Now for each "i" compute ----- 
	 * 		width = rightSmallerIndexArr[i] - leftSmallerIndexArr[i] + 1
	 * 		total area = A[i] * width
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */

}
