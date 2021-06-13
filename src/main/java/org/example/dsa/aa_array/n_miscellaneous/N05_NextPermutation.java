package org.example.dsa.aa_array.n_miscellaneous;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Find next higher permutation of elements of a given array
 * *****************************************************************************
 * Input:	{1, 2, 3}
 * Output:	{1, 3, 2}
 * 
 * Input:	{1, 3, 5, 4, 2}
 * Output:	{1, 4, 2, 3, 5}
 * 
 * *****************************************************************************
 */

public class N05_NextPermutation {
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
	 * ------------------------
	 * So our objectives are:
	 *    1. Starting from the right side, find out where the 'increasing sequence` breaks. Let us call this element as breakpoint.
	 *       In the array {1, 3, 5, 4, 2} --- the breakpoint is {3}
	 *       So, if we can replace this element with some other element in the array, then it's done
	 *       But which element should it be replaced with?
	 *    
	 *    2. For that, we should look at the `increasing sequence from right` and find the immediate higher element as the `nextGreater`
	 *    
	 *    3. So, we should swap these elements
	 *    
	 *    4. But did we reach our goal? NOT YET!! 
	 *       Because now the array is obviously greater than the given array, but it is not the NEXT GREATER.
	 *    
	 *    5. Hence, to get the NEXT GREATER sequence, we should take the right side of the `breakpoint` and take the lowest ranking sequence (of dictionary)
	 *       For that, reversing the above sequence can do the job.
	 * 
	 * ------------------------
	 */

	public static void main(String args[]) {
		int A[] = {1, 3, 5, 4, 2};
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
		
		A = swap(A, nextGreater, breakpoint);			// swap the nextGreater and the breakpoint
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
