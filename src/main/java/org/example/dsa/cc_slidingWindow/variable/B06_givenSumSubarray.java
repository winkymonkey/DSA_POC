package org.example.dsa.cc_slidingWindow.variable;

/**
 * ***************************************************************************************
 * Find the subarray that has the given sum
 * ***************************************************************************************
 * Input:	A[] = {1, 4, 20, 3, 10, 5}
 * 			SUM = 33
 * Output: index 2,3,4
 * 
 * Input:	A[] = {1, 4, 0, 0, 3, 10, 5}
 * 			SUM = 7
 * Output: index 1,2,3.4
 * 
 * Input:	A[] = {1, 4}
 * 			SUM = 0
 * Output: Not found
 * 
 * ***************************************************************************************
 */

public class B06_givenSumSubarray {
	/*
	 * ---------------------------------
	 * ---USE VARIABLE SLIDING WINDOW---
	 * ---------------------------------
	 * A[] = {1, 4, 20, 3, 10, 5}			SUM=33
	 * 
	 * step-1:
	 * [1], 4, 20, 3, 10, 5
	 * ==> sum = 1							< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-2:
	 * [1, 4], 20, 3, 10, 5
	 * ==> sum = 1+4 = 5					< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-3:
	 * [1, 4, 20], 3, 10, 5
	 * ==> sum = 1+4+20 = 25				< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-4:
	 * [1, 4, 20, 3], 10, 5
	 * ==> sum = 1+4+20+3 = 28				< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-5:
	 * [1, 4, 20, 3, 10], 5
	 * ==> sum = 1+4+20+3+10 = 38			> SUM
	 * ==> decrease right bound
	 * ==> increase left bound
	 * 
	 * 
	 * step-6:
	 * 1, [4, 20, 3], 10, 5
	 * ==> sum = 4+20+3 = 27				< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-7:
	 * 1, [4, 20, 3, 10], 5
	 * ==> sum = 4+20+3+10 = 37				> SUM
	 * ==> decrease right bound
	 * ==> increase left bound
	 * 
	 * 
	 * step-8:
	 * 1, 4, [20, 3], 10, 5
	 * ==> sum = 20+3 = 23					< SUM
	 * ==> increase right bound
	 * 
	 * 
	 * step-9:
	 * 1, 4, [20, 3, 10], 5
	 * ==> sum = 20+3+10 = 33				= SUM
	 * print the BOUND
	 * 
	 */
}
