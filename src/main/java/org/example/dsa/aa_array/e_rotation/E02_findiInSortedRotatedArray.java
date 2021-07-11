package org.example.dsa.aa_array.e_rotation;

/**
 * *************************************************************************
 * Find the PIVOT element in a sorted & rotated array
 * Find the MIN element in a sorted & rotated array
 * Find the GIVEN element in a sorted & rotated array
 * *************************************************************************
 */

public class E02_findiInSortedRotatedArray {
	/*
	 * Instead of finding anything using linear search, we should opt for Binary search.
	 * 
	 * -----------------------
	 * 		Finding Pivot
	 * -----------------------
	 * FUNC (start, end) {
	 *    mid = (start+end)/2
	 *    
	 *    if (A[mid] > A[mid+1]) {			// it means A[mid] is pivot
	 *       return mid
	 *    }
	 *    else if (A[mid] >= A[start]) {
	 *       return FUNC(mid+1, end)		// recursively search for pivot in 2nd half of the array
	 *    }
	 *    else {
	 *       return FUNC(start, mid-1)		// recursively search for pivot in 1st half of the array
	 *    }
	 * }
	 * 
	 * TIME --- O(Logn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * -----------------------
	 * 		Finding Min
	 * -----------------------
	 * The next element of Pivot is the smallest one
	 * 
	 * 
	 * 
	 * -----------------------
	 * 		Finding Any
	 * -----------------------
	 * pivot = findPivot(A);				// find pivot in O(Logn) time
	 * 
	 * if (A[0]<KEY && KEY<pivot) {
	 *    Binary Search in left segment		// recursively search for KEY in left half of the array 
	 * }
	 * else {
	 *    Binary Search in right segment	// recursively search for KEY in right half of the array
	 * }
	 * 
	 * 
	 * 
	 * -------------------------------
	 * 		Finding Rotation Count
	 * -------------------------------
	 * pivot = findPivot(A);				// find pivot in O(Logn) time
	 * 
	 * rotationCount = A.length - pivot +1
	 * 
	 * 
	 */
}
