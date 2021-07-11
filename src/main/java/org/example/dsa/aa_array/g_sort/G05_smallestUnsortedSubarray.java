package org.example.dsa.aa_array.g_sort;

/**
 * *****************************************************************************
 * Find the smallest unsorted subarray, sorting which makes the complete array sorted
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

public class G05_smallestUnsortedSubarray {
	/*
	 * {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}
	 *   0  1   2   3   4   5   6   7   8   9   10
	 * 
	 * 
	 * Scan from left to right and find the first element which is greater than the next element. Let it be START.
	 * e.g START = 3
	 * 
	 * Scan from right to left and find the first element which is smaller than the next element. Let it be END.
	 * e.g. END = 7
	 * 
	 * Find the minimum and maximum values in ARR[START......END]
	 * e.g. in the range [30, 25, 40, 32, 31]
	 * MIN = 25, MAX = 40
	 * 
	 * Find the first element (if any) in ARR[0.....START-1] which is greater than MIN, change START to index of this element.
	 * Find the last element (if any) in ARR[END+1.....n-1] which is smaller than MAX, change END to index of this element.
	 * 
	 * Print START and END
	 * 
	 * 
	 * TIME:  O(n)
	 * SPACE: O(1)
	 * 
	 */
}
