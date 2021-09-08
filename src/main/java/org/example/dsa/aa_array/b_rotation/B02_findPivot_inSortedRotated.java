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
		int A[] = { 8, 10, 12, 14, 16, 18, 20, 22, 2, 4, 6 };		// 22 is pivot
		
		// int A[] = { 16, 18, 20, 22, 2, 4, 6, 8, 10, 12, 14 };
		int pivot = findPivot(A, 0, A.length-1);
		System.out.println(pivot);
	}
	
	
	private static int findPivot(int A[], int low, int high) {
		if (high < low)
            return -1;
        if (high == low)
            return low;
		
		int mid = (low+high)/2;
		
		if (mid < high && A[mid] > A[mid+1]) {				// it means A[mid] is pivot
			return mid;
		}
		else if (mid > low && A[mid-1] > A[mid]) {			// it means A[mid-1] is pivot
			return (mid-1);
		}
		else if (A[low] >= A[mid]) {
			return findPivot(A, low, mid-1);
		}
		else {
			return findPivot(A, mid+1, high);
		}
	}
	
}
