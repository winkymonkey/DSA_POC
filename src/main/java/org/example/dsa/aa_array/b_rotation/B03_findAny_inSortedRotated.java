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
		int A[] = { 12, 14, 16, 2, 4, 6, 8, 10 };
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
	
	
	private static int findPivot(int A[], int start, int end) {
		if (start > end)
			return -1;
		if (start == end)
			return start;
		
		int mid = (start+end)/2;
		if (A[mid] > A[mid+1])				// it means A[mid] is pivot
			return mid;
		else if (A[mid] >= A[start])			// it means pivot lies in the left half, so recursively search pivot in the left half
			return findPivot(A, mid+1, end);
		else
			return findPivot(A, start, mid-1);	// it means pivot lies in the right half, so recursively search pivot in the right half
	}
	
	
	private static int binarySearch(int A[], int start, int end, int key) {
		int mid = (start+end)/2;
		
		if (key == A[mid])
			return mid;
		else if (key < A[mid])
			return binarySearch(A, start, (mid-1), key);
		else
			return binarySearch(A, (mid+1), end, key);
	}
	
}
