package org.example.dsa.aa_array.m_optimize;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Minimize the maximum difference between the heights
 * ***************************************************************************************
 * Given heights of n towers and a value k.
 * We need to either increase or decrease height of every tower by k (only once) where k > 0.
 * The task is to minimize the difference between the heights of the longest & shortest tower after modifications, 
 * and output this difference.
 * ***************************************************************************************
 * Input:  A[] = {1, 15, 10}
 * 		   k = 6
 * Output: Maximum difference is 5			//after change--{6, 9, 4}
 * 
 * 
 * Input:  A[] = {1, 5, 15, 10} 
 * 		   k = 3
 * Output: Maximum difference is 8			//after change--{4, 8, 12, 7}
 * 
 * 
 * Input:  A[] = {1, 15, 10}
 * 		   k = 6
 * Output: Maximum difference is 5			//after change--{6, 9, 4}
 * 
 * 
 * Input:  A[] = {4, 6}
 * 		   k = 10
 * Output: Maximum difference is 2			//after change--{14, 16} OR {-6, -4}
 * 
 * 
 * Input:  A[] = {6, 10}
 * 		   k = 3
 * Output: Maximum difference is 5			//after change--{9, 7}
 * 
 * 
 * Input:  A[] = {1, 10, 14, 14, 14, 15}
 * 		   k = 6
 * Output: Maximum difference is 5			//after change--{7, 4, 8, 8, 8, 9}
 * 
 * 
 * Input:  A[] = {1, 2, 3}
 * 		   k = 2
 * Output: Maximum difference is 2			//after change--{3, 4, 5}
 * 
 * *****************************************************************************
 */

public class M02_minimizeTheMaximumDifference {
	
	public static void main(String[] args) {
		int arr[] = {1, 5, 15, 10};
		int k = 3;
		System.out.println("Maximum difference is " + getMinDiff(arr, k));
	}
	
	
	private static int getMinDiff(int A[], int k) {
		int n = A.length;
		if (n == 1)
			return 0;
		
		Arrays.sort(A);							//1, 5, 10, 15
		int initialDiff = A[n-1] - A[0];
		
		// Handle corner elements
		int small = A[0] + k;
		int big = A[n-1] - k;
		if (small > big) {
			//swap small and big
			int temp = small;
			small = big;
			big = temp;
		}
		
		for (int i=1; i<n-1; i++) {				//Traverse middle elements (except first & last)
			int minus = A[i] - k;
			int plus = A[i] + k;

			// If 'small' is still smaller than 'minus' OR 'big' is still bigger than 'plus'
			// it doesn't matter whether we increase or decrease current element
			if (small <= minus || plus <= big) 
				continue;

			int diffAfterPlus = plus - small;
			int diffAfterMinus = big - minus;
			
			if (diffAfterMinus <= diffAfterPlus)
				small = minus;					//don't go for plus, rather go for minus, and update 'minus' as the new 'small'
			else
				big = plus;						//don't go for minus, rather go for plus, and update 'plus' as the new 'big'
		}
		
		return Math.min(initialDiff, big-small);
	}
}
