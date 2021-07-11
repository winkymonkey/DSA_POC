package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find the minimum distance between two distinct numbers in an array (may contain duplicates)
 * *****************************************************************************
 * Input:  {1, 2}		 							X=1, Y=2
 * Output: 1
 * 
 * Input:  {3, 4, 5}								X=3, Y=5
 * Output: 2
 * 
 * Input:  {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}		X=3, Y=6
 * Output: 4
 * 
 * Input:  {2, 5, 3, 5, 4, 4, 2, 3}					X=3, Y=2
 * Output: 1
 * 
 * Input:  {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}		X=3, Y=6
 * Output: 1
 * 
 * *****************************************************************************
 */

public class D09_findMinDistanceBetweenTwoNumbers {
	/*
	 * For every X or Y, we can compare current index with the index of the next occurrence of Y or X.
	 * And if the next element is not same as current element, then compute the distance and compare with the minimum distance till now.
	 * 
	 * But what if an X is followed by another X and that is followed by a Y, then how to get the minimum distance between pairs.
	 * After close observation, we can say that every X followed by a Y or vice versa can only be the closest pair (minimum distance) so ignore all other pairs.
	 * 
	 * -----------
	 * prev = -1
	 * min_dist = INT_MAX
	 * 
	 * for (i=0 to n) {
	 * 	  if (A[i] == X || A[i] == Y) {
	 *       if (prev != -1 && A[i] != A[prev])			// current element is not same as previous
	 *          min_dist = MIN(min_dist, i-prev)
	 *       
	 *       prev = i									// point prev to current which is either X or Y
	 * 	  }
	 * }
	 * 
	 * if (min_dist==INT_MAX)
	 *    print "not found"
	 * else
	 *    print min_dist
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
