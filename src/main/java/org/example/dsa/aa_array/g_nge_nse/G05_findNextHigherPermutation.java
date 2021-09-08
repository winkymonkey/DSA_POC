package org.example.dsa.aa_array.g_nge_nse;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Find next higher permutation of elements of a given array
 * ***************************************************************************************
 * Input:	{1, 2, 3}
 * Output:	{1, 3, 2}
 * 
 * Input:	{1, 3, 5, 4, 2}
 * Output:	{1, 4, 2, 3, 5}
 * 
 * Input:	{5, 3, 4, 9, 7, 6}
 * Output:	{5, 3, 6, 4, 7, 9}
 * 
 * ***************************************************************************************
 */

public class G05_findNextHigherPermutation {
	/*
	 * ------------------------
	 * Any dictionary word always look like this where from right hand side there is an increasing sequence.
	 * {1, 3, 5, 4, 2}
	 *     5
	 *   3   4
	 * 1       2
	 * 
	 * Here the "increasing sequence from right" is {5, 4, 2}
	 * ------------------------
	 * In fact, the "increasing sequence from right" can be as small as one element 
	 *     3
	 *   2
	 * 1
	 * 
	 * Here the "increasing sequence from right" is {3}
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * Traverse the array from right side
	 * As soon as we find a digit which is greater than its left index, we call this breakpoint as IDX
	 * If no BREAKPOINT is found that means that given array is decreasing order
	 * 		In {5, 3, 4, 9, 7, 6} the IDX IS 9
	 * 
	 * Now we need to find out the smallest element in the range of IDX to END which is greater than IDX-1
	 * 		In {5, 3, 4, 9, 7, 6} we will search the smallest element in the range {9, 7, 6} which is greater than 4
	 * 		So it will be 6 (PREV)
	 * 
	 * Now we will swap IDX-1 and PREV
	 * 		So we will swap 4 and 6
	 * 		So {5, 3, 4, 9, 7, 6} becomes {5, 3, 6, 9, 7, 4}
	 * 
	 * Now we will sort all the digits in the range of IDX to END
	 * 		So {5, 3, 6, 9, 7, 4} becomes {5, 3, 6, 4, 7, 9}
	 * 
	 * ------------------------
	 */
	
	public static void main(String[] args) {
		int A[] = {5, 3, 4, 9, 7, 6};
		//         0  1  2  3  4  5
		nextPermutaion(A);
	}
	
	
	private static void nextPermutaion (int A[]) {
		int idx = -1;
		int n = A.length;
		
		for(int i=n-1; i>0; i--) {
			if (A[i] > A[i-1]) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			System.out.println("ALREADY IS IN DESCENDING ORDER");
		}
		else {
			int prev = idx;									// prev = smallest element greater than idx-1
			for (int i=idx; i<n; i++) {
				if (A[i]>A[idx-1] && A[i]<=A[prev]) {		// if current element is greater than idx-1, and lesser than smallest as of now
					prev = i;
				}
			}
			swap(A, idx-1, prev);
			reverse(A, idx, n-1);
			System.out.println(Arrays.toString(A));
		}
	}
	
	
	private static void reverse(int A[], int start, int end) {
		while (start < end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
	}
	
	
	private static void swap(int A[], int p, int q) {
		int temp = A[p];
		A[p] = A[q];
		A[q] = temp;
	}
	
}
