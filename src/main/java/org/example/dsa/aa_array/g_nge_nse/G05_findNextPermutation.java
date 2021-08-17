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

public class G05_findNextPermutation {
	/* 
	 * ------------------------
	 * Any dictionary word always look like this where from right hand side there is an increasing sequence.
	 * {1, 3, 5, 4, 2}
	 *     5
	 *   3   4
	 * 1       2
	 * 
	 * Here the `increasing sequence from right` is {5, 4, 2}
	 * ------------------------
	 * In fact, the `increasing sequence from right` can be as small as one element 
	 *     3
	 *   2
	 * 1
	 * 
	 * Here the `increasing sequence from right` is {3}
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * Traverse the array from right side, keep traversing till we find a digit "breakpoint" which is smaller than the previously traversed digit.
	 * If we do not find such a digit, then output is “Not Possible”.
	 *    E.g. For {5, 3, 4, 9, 7, 6} we stop at 4 because it is smaller than 9.
	 * 
	 * Now search the right side of the "breakpoint" and find the smallest digit greater than "breakpoint".
	 *    The right side of "breakpoint" contains 976.
	 *    So the smallest digit greater than 4 is 6.
	 * 
	 * Swap above two digits
	 *    So we swap 4 and 6
	 *    So it becomes {5, 3, 6, 9, 7, 4}
	 * 
	 * Now sort all digits at right side of "breakpoint".
	 * This is the desired number
	 *    So it becomes {5, 3, 6, 4, 7, 9}
	 * 
	 * ------------------------
	 */

	public static void main(String args[]) {
		int A[] = {5, 3, 4, 9, 7, 6};
		boolean isPossible = findNextPermutation(A);
		
		if (isPossible)
			System.out.println(Arrays.toString(A));
		else
			System.out.println("SORRY!!");
	}
	
	
	private static boolean findNextPermutation(int A[]) {
		if (A.length <= 1) {
			return false;
		}
		
		int breakpoint = -1;
		for (int i=A.length-2; i>=0; i--) {				// find the longest non-increasing sequence from right and find the breakpoint
			if (A[i] < A[i+1]) {
				breakpoint = i;
				break;
			}
		}
		if (breakpoint < 0) {
			return false;								// the given sequence is strictly increasing from right to left. So no higher order permutation possible
		}
		
		int nextGreater = A.length - 1;
		for (int i=A.length-1; i>breakpoint; i--) {		// find the element from right which is greater than the breakpoint
			if (A[i] > A[breakpoint]) {
				nextGreater = i;
				break;
			}
		}
		
		A = swap(A, nextGreater, breakpoint);			// swap the nextGreater & the breakpoint
		A = reverse(A, breakpoint+1, A.length-1);		// Reverse entire array after the breakpoint element
		return true;
	}
	
	
	private static int[] swap(int A[], int left, int right) {
		int temp = A[left];
		A[left] = A[right];
		A[right] = temp;
		return A;
	}
	
	
	private static int[] reverse(int A[], int left, int right) {
		while (left < right) {
			int temp = A[left];
			A[left++] = A[right];
			A[right--] = temp;
		}
		return A;
	}
	
}
