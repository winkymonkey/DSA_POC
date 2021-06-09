package org.example.dsa.aa_array.b_sum_difference;

/**
 * *****************************************************************************
 * Given an array A[], find a triplet whose sum is equals to a given value
 * *****************************************************************************
 * Input:  {12, 3, 4, 1, 6, 9}		SUM = 24
 * Output: YES						//12,3,9
 * 
 * *****************************************************************************
 */

public class B04_findTripletSum_equalsToGivenValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for (i=0 to n-2)
	 *    for (j=i+1 to n-1)
	 *       for (k=j+1 to n)
	 *          if (A[i] + A[j] + A[k] == SUM)
	 *             return true
	 * 
	 * TIME --- O(n^3)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array		{1, 3, 4, 6, 9, 12}
	 * 
	 * for (i=0 to n-2) {						//fix the first element A[i] of the possible triplet
	 *    l = i+1;
	 *    r = n-1;
	 *    while (l < r) {						//apply sliding door technique from (i+1) to (end)
	 *       if (A[i]+A[l]+A[r] == SUM)
	 *          return true
	 *       else if (A[i]+A[l]+A[r] < SUM)
	 *          l++
	 *       else if (A[i]+A[l]+A[r] > SUM) 
	 *          r--
	 * 	  }
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n^2) = O(n^2)
	 * SPACE -- O(1)
	 * 
	 */
}
