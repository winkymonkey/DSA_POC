package org.example.dsa.aa_array.g_nge_nse;

/**
 * ***************************************************************************************
 * Stock span problem
 * ***************************************************************************************
 * Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
 * The span of the stock's price today is defined as 
 * --- the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.
 * ***************************************************************************************
 * Input  = { 100, 80, 60, 70, 60, 75, 85 }
 * Output = { 1, 1, 1, 2, 1, 4, 6 }
 * 
 * ***************************************************************************************
 */

public class G09_stockSpanProblem {
	/*
	 * --------------------
	 * ---NAIVE SOLUTION---
	 * --------------------
	 * Traverse the array and for each i
	 *    traverse the array from i to 0 and increment the span value of it while elements on the left side are smaller.
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -------------
	 * ---USE LGE---
	 * -------------
	 * This solution is based on the concept of Left Greater Element
	 * But here we will store indices instead of elements
	 * We will have an array called "leftGreaterIndexArr"
	 * 
	 * For each element in the array,
	 * 	- compute and store leftGreaterIndex and store it in the leftGreaterIndexArr
	 * 
	 * For example,
	 * 		For input { 100, 80, 60, 70, 60, 75, 85 } the Left Greater Elements will be { -1, 100, 80, 80, 70, 80, 100 }
	 * 		Hence we can say that leftGreaterIndexArr will become { -1, 0, 1, 1, 3, 1, 0 }
	 * 
	 * Now for each elements in the leftGreaterIndexArr, the stock span will be
	 * 		leftGreaterIndex - currentIndex
	 * 		= leftGreaterIndexArr[i] - i
	 * 
	 * 
	 */
}
