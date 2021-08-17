package org.example.dsa.aa_array.a_core;

/**
 * ***************************************************************************************
 * Find how many times a given element X occurs in a sorted array
 * ***************************************************************************************
 */

public class A02B_BinarySearch_handleDuplicates {
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 10, 10, 10, 10, 22, 40 };
		//			0  1  2  3   4   5   6   7   8
		int KEY = 10;
		
		int l = 0;
		int r = A.length-1;
		searchStartIndex(A, l, r, KEY);
		searchEndIndex(A, l, r, KEY);
	}
	
	
	private static void searchStartIndex(int A[], int l, int r, int KEY) {
		int startIndex = -1;
		while (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid]) {
				startIndex = mid;			//instead of returning 'mid', save it in a variable
				r = mid-1;					//move r
			}
			else if (KEY < A[mid])
				r = mid-1;
			else
				l = mid+1;			
		}
		System.out.println(startIndex);
	}
	
	
	private static void searchEndIndex(int A[], int l, int r, int KEY) {
		int endIndex = -1;
		while (l <= r) {
			int mid = (l+r)/2;
			
			if (KEY == A[mid]) {
				endIndex = mid;				//instead of returning 'mid', save it in a variable
				l = mid+1;					//move l
			}
			else if (KEY < A[mid])
				r = mid-1;
			else
				l = mid+1;
		}
		System.out.println(endIndex);
	}
	
}
