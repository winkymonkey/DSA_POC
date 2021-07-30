package org.example.dsa.aa_array.b_rotation;

/**
 * ***************************************************************************************
 * Find the PIVOT element in a sorted & rotated array
 * ***************************************************************************************
 * Input:  { 12, 14, 16, 2, 4, 6, 8, 10 }
 * Output: 2
 * 
 * ***************************************************************************************
 */

public class B02_findPivot_inSortedRotated {
	/*
	 * --------------------
	 * Instead of finding in linear search, we should opt for Binary search.
	 * 
	 * TIME --- O(Logn)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 12, 14, 16, 2, 4, 6, 8, 10 };
		int pivot = findPivot(A, 0, A.length-1);
		System.out.println(pivot);
	}
	
	
	private static int findPivot(int A[], int start, int end) {
		int mid = (start+end)/2;
		if (A[mid] > A[mid+1]) {				// it means A[mid] is pivot
			return mid;
		}
		else if (A[mid] >= A[start]) {			// it means pivot lies in the left half, so recursively search pivot in the left half
			return findPivot(A, mid+1, end);
		}
		else {
			return findPivot(A, start, mid-1);	// it means pivot lies in the right half, so recursively search pivot in the right half
		}
	}
	
}
