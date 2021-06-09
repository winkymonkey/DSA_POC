package org.example.dsa.aa_array.g_sort;

/**
 * *****************************************************************************
 * Find the minimum length unsorted subArray, sorting which makes the complete array sorted
 * *****************************************************************************
 * Input:  {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}
 * 		//	 0  1   2   3   4   5   6   7   8   9   10
 * Output: 3 to 8
 * 
 * Input:  {0, 1, 15, 25, 6, 7, 30, 40, 50}
 * 		//	0  1  2   3   4  5  6   7   8
 * Output: 2 to 5
 * 
 * *****************************************************************************
 */

public class G10_smallestUnsortedSubarray {
	/*
	 * In a sorted (increasing) array, each element is greater than its previous & smaller than its next.
	 * 
	 * for (i=0 to length)
	 *    find the index where current element is NOT SMALLER than its next
	 *    mark it as START
	 *    break
	 * 
	 * for (i=length to 0)
	 *    find the index where current element is NOT GREATER than its previous
	 *    mark it as END
	 *    break
	 * 
	 * Find the MIN in the range A[START......END]
	 * Find the MAX in the range A[START......END]
	 * 
	 * In the range A[0....START-1] find the first element (if any) which is greater than MIN
	 * Update START to this index
	 * 
	 * In the range A[END+1....length] find the first element (if any) which is smaller than MAX
	 * Update END to this index
	 * 
	 * Print START, END
	 * 
	 */
}
