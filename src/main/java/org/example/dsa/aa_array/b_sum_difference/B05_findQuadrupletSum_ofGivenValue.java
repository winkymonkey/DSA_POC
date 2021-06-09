package org.example.dsa.aa_array.b_sum_difference;

/**
 * *****************************************************************************
 * Given an array A[], find a quadruplet whose sum is equals to a given value
 * *****************************************************************************
 * Input:  {10, 2, 3, 4, 5, 9, 7, 8}		SUM = 23
 * Output: YES								//3 5 7 8
 * 
 * *****************************************************************************
 */

public class B05_findQuadrupletSum_ofGivenValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * for (i=0 to n-3)
	 *    for (j=i+1 to n-2)
	 *       for (k=j+1 to n-1)
	 *          for (m=k+1 to n)
	 *             if (A[i] + A[j] + A[k] + A[m] == SUM)
	 *                return true
	 * 
	 * TIME --- O(n^4)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---SORT & SLIDING DOOR TECHNIQUE---
	 * -----------------------------------
	 * Sort the array		{2, 3, 4, 5, 7, 8, 9, 10}
	 * 
	 * for (i=0 to n-3) {
	 *    for (j=i+1 to n-2) {
	 *       l = j+1;
	 *       r = n-1;
	 *       while (l < r) {
	 *          if (A[i] + A[j] + A[l] + A[r] == SUM)
	 *             return true
	 *          else if (A[i] + A[j] + A[l] + A[r] < SUM)
	 *             l++
	 *          else if (A[i] + A[j] + A[l] + A[r] > SUM)
	 *             r--
	 *       }
	 *    }
	 * }
	 * 
	 * TIME --- O(nLogn) + O(n^3) = O(n^3)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ------------------------------------------------------
	 * ---CREATE SUM ARRAY & SORT & SLIDING DOOR TECHNIQUE---
	 * ------------------------------------------------------
	 * Create an auxiliary array AUX[] and store sum of all possible pairs in AUX[]
	 *   If size of A[] is n, the size of AUX[] will be = (n-1)+(n-2)+(n-3)+...+1 = n*(n-1)/2
	 * 
	 * Sort AUX[]
	 * 
	 * Now the problem reduces to find two elements in AUX[] with sum equal to X
	 * 
	 * We can now apply 'sliding door' technique
	 * 	 but while picking two elements from AUX[], then confirm that these two elements doesn't have an element of A[] in common
	 *   E.G, if AUX[1]=A[1]+A[2] and AUX[2]=A[2]+A[4], then AUX[1] and AUX[2] don’t represent four distinct elements of A[] 
	 * 
	 * NOTE: easy to do in C using pointers but tough to do in java
	 * 
	 * TIME --- O(n^2) + O(n^2 * Log n^2) = O(n^2 Log n) -------- (to store sum of all pairs)+(to sort AUX[] of size O(n^2))
	 * SPACE -- O(n*(n-1)/2) = O(n^2)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Store sums of all pairs in a HashTable [KEY=A[i]+A[j], value=new Pair(i,j)]
	 * Traverse through all pairs again and search for 'SUM-KEY' in the HashTable
	 * If found, then confirm that these two are not made up with any common element from A[]
	 * 
	 * TIME --- O(n^2) + O(n) = O(n^2) --------- (to store sum of all pairs)+(to traverse hashmap)
	 * SPACE -- O(n^2)
	 * 
	 */
}
