package org.example.dsa.aa_array.e_rotation;

/**
 * *************************************************************************
 * Find the PIVOT element in a sorted and rotated array
 * *************************************************************************
 * Input:  {5, 6, 7, 8, 9, 10, 1, 2, 3}
 * Output: 10
 * 
 * Input:  {40, 10, 20, 30}
 * Output: 40
 * 
 * *************************************************************************
 */

public class E02_sortedRotated_findPivot {
	/*
	 * ----------------------------
	 * ---LINEAR SEARCH APPROACH---
	 * ----------------------------
	 * traverse the array
	 * if (A[i] > A[i+1] --> then A[i] is the pivot
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ----------------------------
	 * ---BINARY SEARCH APPROACH---
	 * ----------------------------
	 * FUNC (start, end) {
	 *    mid = (start+end)/2
	 *    if (A[mid] > A[mid+1]) {			//it means A[mid] is pivot
	 *       return mid
	 *    }
	 *    
	 *    if (A[mid] >= A[start]) {
	 *       return FUNC(mid+1, end)		//look for pivot in second half of the array
	 *    }
	 *    else {
	 *       return FUNC(start, mid-1)		//look for pivot in first half of the array
	 *    }
	 * }
	 * 
	 * TIME --- O(Logn)
	 * SPACE -- O(1)
	 * 
	 */
}
