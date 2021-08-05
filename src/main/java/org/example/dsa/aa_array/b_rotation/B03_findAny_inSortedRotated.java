package org.example.dsa.aa_array.b_rotation;

/**
 * ***************************************************************************************
 * Find the GIVEN element in a sorted & rotated array
 * ***************************************************************************************
 * Input:  { 12, 14, 16, 2, 4, 6, 8, 10 }		key = 10
 * Output: 7
 * 
 * ***************************************************************************************
 */

public class B03_findAny_inSortedRotated {
	/*
	 * --------------------
	 * Instead of finding in linear search, we should opt for Binary search.
	 * 
	 * TIME --- O(Logn)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 8, 10, 12, 14, 16, 18, 20, 22, 2, 4, 6 };
		int pivot = findPivot(A, 0, A.length-1);
		
		int key = 10;
		if (key == A[pivot]) {											// if key is at pivot, simply print it
			System.out.println(pivot);
		}
		else if (key >= A[0]) {											// if key is greater than A[0], binary search in left half
			int index = binarySearch(A, 0, pivot-1, key);
			System.out.println(index);
		}
		else {															// if key is lesser than A[0], binary search in right half
			int index = binarySearch(A, pivot+1, A.length-1, key);
			System.out.println(index);
		}
	}
	
	
	private static int findPivot(int A[], int low, int high) {
		if (high < low)
            return -1;
        if (high == low)
            return low;
		
		int mid = (low+high)/2;
		
		if (mid < high && A[mid] > A[mid+1]) {						// it means A[mid] is pivot
			return mid;
		}
		else if (mid > low && A[mid] < A[mid-1]) {					// it means A[mid] is pivot
			return (mid-1);
		}
		else if (A[low] >= A[mid]) {
			return findPivot(A, low, mid-1);
		}
		else {
			return findPivot(A, mid+1, high);
		}
	}
	
	
	private static int binarySearch(int A[], int low, int high, int key) {		// standard binary search
		int mid = (low+high)/2;
		
		if (key == A[mid])
			return mid;
		else if (key < A[mid])
			return binarySearch(A, low, (mid-1), key);
		else
			return binarySearch(A, (mid+1), high, key);
	}
	
}
