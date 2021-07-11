package org.example.dsa.aa_array.g_sort;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Sort an array in a single loop
 * *****************************************************************************
 */

public class G04_sortInSingleLoop {
	
	public static void main(String[] args) {
		int A[] = {38, 27, 43, 3, 9, 82, 10};
		sortInSingleLoop(A);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void sortInSingleLoop(int A[]) {
		for (int i=0, j=i+1; i<A.length && j<A.length; ) {
			if (A[i] > A[j]) {
				//swap A[i] and A[j]
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i=0;
				j=i+1;
			}
			else {
				i++;
				j++;
			}
		}
	}
	
}
