package org.example.dsa.aa_array.p_hd;

/**
 * *****************************************************************************
 * The Double HeLiX
 * *****************************************************************************
 * Two finite, strictly increasing, integer sequences are given.
 * Any common integer between the two sequences constitute an intersection point.
 * 
 * Take for example the following two sequences:
 * 3 5 7 9 20 25 30 40 55 56 57 60 62
 * 1 4 7 11 14 25 44 47 55 57 100				//intersections are: 7, 25, 55, 57
 * 
 * You can ‘walk” over these two sequences in the following way:
 *  1. You may start at the beginning of any of the two sequences. Now start moving forward.
 *  2. At each intersection point, you have the choice of either continuing with the same sequence you’re currently on, or switching to the other sequence.
 * 
 * The objective is finding a path that produces the maximum sum of data you walked over.
 * In the above example, the largest possible sum is 450, which is the result of adding 3, 5, 7, 9, 20, 25, 44, 47, 55, 56, 57, 60, and 62
 * 
 * *****************************************************************************
 * Input:	{3 5 7 9 20 25 30 40 55 56 57 60 62} and {1 4 7 11 14 25 44 47 55 57 100}
 * Output:	450
 * 
 * Input:	{-5 100 1000 1005} and {-12 1000 1001}
 * Output:	2100
 * 
 * *****************************************************************************
 */

public class P07_DoubleHelixProblem {
	/*
	 * Traverse both the array independently using two pointers (one pointer for each array)
	 *  - for each array keep one temporary sum (sum1 & sum2)
	 *  - calculate the temporary sum till one junction point
	 *  - whichever temporary sum is higher add it in final sum
	 *  - reset both the temporary sums
	 *  - repeat
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {3, 5, 7, 9, 20, 25, 30, 40, 55, 56, 57, 60, 62};
		int B[] = {1, 4, 7, 11, 14, 25, 44, 47, 55, 57, 100};
		calculateMax(A, B);
	}
	
	
	private static void calculateMax(int A[], int B[]) {
		int max = 0;
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		int j = 0;
		
		while(i<A.length && j<B.length) {
			if (A[i] < B[j]) {
				sum1 = sum1 + A[i];
				i++;
			}
			else if (A[i] > B[j]) {
				sum2 = sum2 + B[j];
				j++;
			}
			else {
				max = max + Math.max(sum1, sum2) + A[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		
		while (i < A.length) {
			sum1 = sum1 + A[i];
			i++;
		}
		while (j < B.length) {
			sum2 = sum2 + B[j];
			j++;
		}
		
		max = max + Math.max(sum1, sum2);
		System.out.println(max);
	}
	
}
