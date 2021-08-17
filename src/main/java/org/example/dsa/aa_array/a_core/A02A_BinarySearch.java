package org.example.dsa.aa_array.a_core;

/**
 * ***************************************************************************************
 * Binary Search
 * ***************************************************************************************
 */

public class A02A_BinarySearch {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//	   	    0  1  2  3   4
		int KEY = 10;
		
		int l = 0;
		int r = A.length-1;
		
		System.out.println(recursiveSearch(A, l, r, KEY));
		System.out.println(iterativeSearch(A, l, r, KEY));
	}
	
	
	private static int recursiveSearch(int A[], int low, int high, int KEY) {
		if (low <= high) {
			int mid = (low+high)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				return recursiveSearch(A, low, mid-1, KEY);
			else
				return recursiveSearch(A, mid+1, high, KEY);
		}
		return -1;
	}
	
	
	private static int iterativeSearch(int A[], int low, int high, int KEY) {
		while (low <= high) {
			int mid = (low+high)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				high = mid-1;
			else
				low = mid+1;
			
		}
		return -1;
	}
	
}
