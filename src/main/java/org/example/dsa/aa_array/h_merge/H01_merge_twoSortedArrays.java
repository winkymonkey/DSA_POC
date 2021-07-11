package org.example.dsa.aa_array.h_merge;

/**
 * *****************************************************************************
 * Merge two sorted arrays into one array
 * *****************************************************************************
 * Input:  M[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 }		//-1 means empty
 * 		   N[] = { 5, 7, 9, 25 }
 * 
 * Output: { 2, 5, 7, 8, 9, 13, 15, 20, 25 }
 * 
 * *****************************************************************************
 */

public class H01_merge_twoSortedArrays {
	/*
	 * --------------------
	 * ---IN PLACE MERGE---
	 * --------------------
	 * Right-shift all POSITIVE elements of M[]
	 * 		{-1, -1, -1, -1, 2, 8, 13, 15, 20}
	 * 
	 * Keep N[] intact
	 * 		{5, 7, 9, 25}
	 * 
	 * i = index of first POSITIVE element in M[]
	 * j = index of first POSITIVE element in N[]
	 * k = 0
	 * 
	 * for (k=0 to m+n) {
	 *    if (M[i] < N[j]) {
	 *       M[k] = M[i];			// put smallest between M[i] and N[j] into M[k]
	 *       i++;
	 *    }
	 *    else {
	 *       M[k] = M[j];			// put smallest between M[i] and N[j] into M[k]
	 *       j++;
	 *    }
	 * }
	 * 
	 */
}
