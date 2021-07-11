package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find duplicate elements in a special array that contains elements from 0 to n-1
 * *****************************************************************************
 * Input:  {1, 2, 3, 6, 3, 6, 1}
 * Output: 1,3,6					// The numbers 1 , 3 and 6 appears more than once
 * 
 * Input:  {1, 2, 3, 4 ,3}
 * Output: 3						// The number 3 appears more than once in the array
 * 
 * *****************************************************************************
 */
public class D08_findDuplicateElements_specialArray {
	/*
	 * Traverse the array
	 * for each `i`, go to `A[i] th` index
	 *    if it is positive ---> make it negative
	 *    if it is negative ---> print it
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
		System.out.println("The repeating elements are : ");
		printRepeating(arr);
	}
	
	
	private static void printRepeating(int A[]) {
		for (int i=0; i<A.length; i++) {
			int val = Math.abs(A[i]);
			if (A[val] >= 0)
				A[val] = -A[val];
			else
				System.out.print(val + " ");
		}
	}
	
}
