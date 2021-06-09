package org.example.dsa.aa_array.a_core;


public class A02A_BinarySearch_recursive {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 40 };
		//	   	    0  1  2  3   4
		int KEY = 10;
		
		int l = 0;
		int r = A.length-1;
		
		System.out.println(recursiveSearch(A, l, r, KEY));
		System.out.println(iterativeSearch(A, l, r, KEY));
	}
	
	
	private static int recursiveSearch(int A[], int l, int r, int KEY) {
		if (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				return recursiveSearch(A, l, mid-1, KEY);
			else
				return recursiveSearch(A, mid+1, r, KEY);
		}
		return -1;
	}
	
	
	private static int iterativeSearch(int A[], int l, int r, int KEY) {
		while (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid])
				return mid;
			else if (KEY < A[mid])
				r = mid-1;
			else
				l = mid+1;
			
		}
		return -1;
	}
	
}
