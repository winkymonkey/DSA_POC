package org.example.dsa.aa_array.f_twopointer;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Find a pair whose sum is closest to a given value
 * ***************************************************************************************
 * Input:  { 10, 22, 28, 29, 30, 40 }		X = 54
 * Output: 22 and 30
 * 
 * ***************************************************************************************
 */

public class F03_findPairSum_closestToGivenValue {
	/*
	 * -----------------------------
	 * ---USE TWO POINTER APROACH---
	 * -----------------------------
	 * TIME --- O(nLogn)+O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 10, 22, 28, 29, 30, 40 };
		int x = 54;
		minPairSumClosestToZero(A, x);
	}
	
	
	private static void minPairSumClosestToZero(int A[], int x) {
		Arrays.sort(A);												// 10, 22, 28, 29, 30, 40
		int n = A.length;
		
		int minDist = Integer.MAX_VALUE;
		int l = 0;
		int r = n-1;
		
		int minLeft = 0;
		int minRight = n-1;
		
		while (l < r) {
			int dist = A[l] + A[r] - x;								// dist = distance from pivot (=0)
			if (Math.abs(dist) < Math.abs(minDist)) {				// if current sum closer to pivot (=0) than the previous
				minDist = dist;
				minLeft = l;
				minRight = r;
			}
			if (dist < x)
				l++;
			else
				r--;
		}
		
		System.out.println(A[minLeft] + " and " + A[minRight]);
	}
}
