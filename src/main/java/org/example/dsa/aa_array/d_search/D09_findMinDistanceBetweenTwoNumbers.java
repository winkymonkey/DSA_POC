package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find the minimum distance between two distinct numbers in an array
 * The array may contain duplicates
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
	 * So the basic approach is to check only consecutive pairs of X and Y.
	 * 
	 * For every element X or Y, check the index of the previous occurrence of X or Y 
	 * 	and if the previous occurring element is not similar to current element update the minimum distance.
	 * 
	 * But a question arises what if an X is preceded by another X and that is preceded by a Y, 
	 * 	then how to get the minimum distance between pairs.
	 * 
	 * By analyzing closely it can be seen that every X followed by a Y or vice versa can only be the closest pair (minimum distance) so ignore all other pairs.
	 * 
	 * -----------
	 * prev = -1
	 * min_dist = INT_MAX
	 * 
	 * for (i=0 to n) {
	 * 	  if (A[i] == X || A[i] == Y) {
	 *       if (prev!=-1 && A[i]!=A[prev])				//one of them is 3, another one is 6
	 *          min_dist = MIN(min_dist, i-prev)
	 *       
	 *       prev = i
	 * 	  }
	 * }
	 * 
	 * if (min_dist==INT_MAX)
	 *    print "not found"
	 * else
	 *    print min_dist
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
