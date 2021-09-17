package org.example.dsa.aa_array.f_twopointer;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Pair sum ---------- closest to zero
 * ***************************************************************************************
 * Find a pair whose sum is closest to zero
 * ***************************************************************************************
 * Input:  { 1, 60, -10, 70, -80, 85, -72 }
 * Output: -72 and 70
 * 
 * ***************************************************************************************
 */

public class F02_pairSum_closestToZero {
	/*
	 * -----------------------------
	 * ---USE TWO POINTER APROACH---
	 * -----------------------------
	 * Sort the array ----- { -80, -72, -10, 1, 60, 70, 85 }
	 * Now use two pointer approach
	 * 
	 * 
	 * TIME --- O(nLogn)+O(n) = O(nLogn)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 1, 60, -10, 70, -80, 85, -72 };
		
		minPairSumClosestToZero(A);
	}
	
	
	private static void minPairSumClosestToZero(int A[]) {
		Arrays.sort(A);												// { -80, -72, -10, 1, 60, 70, 85 }
		int n = A.length;
		
		int minDist = Integer.MAX_VALUE;
		int l = 0;
		int r = n-1;
		
		int minLeft = 0;
		int minRight = n-1;
		
		while (l < r) {
			int dist = A[l] + A[r];									// dist = distance from pivot (=0)
			if (Math.abs(dist) < Math.abs(minDist)) {				// if current sum closer to pivot (=0) than the previous
				minDist = dist;
				minLeft = l;
				minRight = r;
			}
			if (dist < 0)
				l++;
			else
				r--;
		}
		
		System.out.println(A[minLeft] + " and " + A[minRight]);
	}
	
}
