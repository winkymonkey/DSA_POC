package org.example.dsa.aa_array.r_matrix;

/**
 * ***************************************************************************************
 * Given a m*n matrix if an element is 0, set its entire row & column to 0
 * ***************************************************************************************
 * Input:					Output:
 *    [[1,1,1]					[[1,0,1]
 *     [1,0,1]					 [0,0,0]
 *     [1,1,1]]					 [1,0,1]]
 * 
 * Input:					Output:
 *    [[0,1,2,0]				[[0,0,0,0]
 *     [3,4,5,2]				 [0,4,5,0]
 *     [1,3,1,5]]				 [0,3,1,0]]
 * 
 * ***************************************************************************************
 */

public class R01_setMartixZeros {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the matrix.
	 * Whenever we find a 0, we start traversing its row & columns and make every non-zero element to -1
	 * 
	 * Traverse the matrix again to convert all these -1 to 0.
	 * 
	 * TIME --- O(n*m) * O(n+m)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * Maintain an array to represent the matrix column
	 * Maintain an array to represent the matrix row
	 * 
	 * Traverse the matrix.
	 * Whenever we find a 0, make corresponding cell in row-array as 0 and column-array as 0
	 * 
	 * Traverse the matrix again.
	 * for each cell, if either of its corresponding row-array or column-array contains 0, convert the matrix cell as 0
	 * 
	 * TIME --- O(n*m)
	 * SPACE -- O(1)
	 * 
	 */
}
