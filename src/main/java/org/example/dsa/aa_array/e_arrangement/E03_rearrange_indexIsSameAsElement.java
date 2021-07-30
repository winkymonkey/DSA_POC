package org.example.dsa.aa_array.e_arrangement;

/**
 * ***************************************************************************************
 * Rearrange an array such that A[i] = i in an array
 *   - all elements may not be present in the array
 *   - if the element is not present then it is denoted as -1 in that slot
 *   - while rearranging, if i is not present, place -1 at that slot
 * ***************************************************************************************
 * Input:  {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 *          0   1   2  3  4  5  6   7  8   9
 *        
 * Output: {-1, 1, 2, 3, 4, -1, 6, -1, -1, 9}
 * 
 * 
 * Input:  {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
 *          0   1  2  3   4   5   6  7  8  9  10  11  12 13 14  15  16 17  18  19
 * 
 * Output: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}
 * 
 * ***************************************************************************************
 */

public class E03_rearrange_indexIsSameAsElement {
	/*
	 * -------------------
	 * ---ANOTHER ARRAY---
	 * -------------------
	 * B[] 							//same length as A[]
	 * k = 0						//to traverse B[]
	 * for (i=0 to length) {
	 *    B[A[i]] = A[i]
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * -----------------
	 * ---SWAP METHOD---
	 * -----------------
	 * for (i=0 to length) {
	 *    if (A[i]>=0  &&  A[i]!=i) {
	 *       //swap A[i] and A[A[i]]
	 *    }
	 *    else {
	 *       i++			//already A[i]=i, so nothing to do
	 *    }
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
