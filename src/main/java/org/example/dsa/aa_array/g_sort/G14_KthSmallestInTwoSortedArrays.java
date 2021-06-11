package org.example.dsa.aa_array.g_sort;

/**
 * ****************************************************************************************
 * K'th Smallest/Largest element in two Sorted Arrays
 * ****************************************************************************************
 */

public class G14_KthSmallestInTwoSortedArrays {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Merge these two arrays using merge method of merge sort. And put all elements into a new array.
	 * Now the K'th element in the new array is the answer
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(m+n)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * We can tweak the above approach a little.
	 * In the merge method, we will NOT put all elements into a new array. 
	 * Rather Keep taking smaller of the current elements of two sorted arrays and keep incrementing K
	 * 
	 * TIME --- O(k)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 6, 7, 9 };
		int B[] = { 1, 4, 8, 10 };
		int K = 5;

		System.out.println(lookup(A, B, K));
	}
	
	private static int lookup(int A[], int B[], int K) {
		int i=0, j=0, pos=0;

		while (i<A.length && j<B.length) {
			if (A[i] < B[j]) {
				pos++;
				if (pos == K)
					return A[i];
				i++;
			}
			else {
				pos++;
				if (pos == K)
					return B[j];
				j++;
			}
		}
		
		while (i<A.length) {			// If B[] is fully traversed, but A[] still have some elements left
			pos++;
			if (pos == K)
				return A[i];
			i++;
		}
		
		while (j<B.length) {			// If A[] is fully traversed, but B[] still have some elements left
			pos++;
			if (pos == K)
				return B[j];
			j++;
		}
		return -1;
	}
	
}
