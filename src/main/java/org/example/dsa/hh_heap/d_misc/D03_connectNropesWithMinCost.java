package org.example.dsa.hh_heap.d_misc;

/**
 * ***************************************************************************************
 * Connect 'n' ropes with minimum cost
 * ***************************************************************************************
 * Input:	{4, 3, 2, 6}
 * Output:	29				// 3+2 = 5		array after step-1: {4, 5, 6}
 * 							// 4+5 = 9		array after step-1: {9, 6}
 * 							// 9+6 = 15		array after step-1: {15}
 * 							// cost = 5+9+15 = 29
 * 
 * ***************************************************************************************
 */

public class D03_connectNropesWithMinCost {
	/*
	 * Create a minHeap and insert all elements into it
	 * 
	 * While number of elements > 1
	 * 	- Extract the MIN and 2nd MIN from minHeap
	 *  - Add these two and push the 'sum' in the heap
	 *  - after every push, keep adding the 'sum' in another variable called 'cost'
	 * 
	 * Return the value of 'cost'
	 * 
	 */
}
