package org.example.dsa.aa_array.q_miscellaneous;

/**
 * ***************************************************************************************
 * Trapping Rain Water problem
 * ***************************************************************************************
 */

public class Q04_trappingRainWater {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array and for every i,
	 * 		traverse the array from i to 0 to find the maximum height in left "leftMax"
	 * 		traverse the array from i to end to find the maximum height in right "rightMax"
	 * 		The amount of water that will be stored in this column is ----- min(leftMax,rightMax) - A[i]
	 * 		Add this value to the total amount of water stored
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ---------------------------------
	 * ---USE PREFIX MAX & SUFFIX MAX---
	 * ---------------------------------
	 * The above approach has a serious drawback
	 * To find the highest bar on the left and right, array traversal is needed which reduces the efficiency of the solution.
	 * 
	 * To make this efficient 
	 * For every bar A[i], we pre-compute the highest bar on the left in linear time. ---- PREFIX MAX
	 * For every bar A[i], we pre-compute the highest bar on the right in linear time.
	 * Then we can use these pre-computed values to find the amount of water in every array element.
	 * 
	 * ----------
	 * LEFT[0] = A[0]
	 * Traverse A[] (from 1 to n-1)
	 * For every i,
	 * 		LEFT[i] = max(LEFT[i-1], A[i])
	 * 
	 * RIGHT[n-1] = A[n-1]
	 * Traverse A[] (from n-2 to 0)
	 * For every i,
	 * 		RIGHT[i] = max(RIGHT[i+1], A[i])
	 * 
	 * Traverse the main array
	 * The amount of water that will be stored in this column is ----- min(LEFT[i],RIGHT[i]) - A[i]
	 * Add this value to total amount of water stored
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(calculateWater(A));
	}
	
	
	private static int calculateWater(int A[]) {
		int n = A.length;
		int leftHighest[] = new int[n];					// PrefixMax
		int rightHighest[] = new int[n];				// SuffixMax
		
		leftHighest[0] = A[0];
		for (int i=1; i<n; i++)
			leftHighest[i] = Math.max(leftHighest[i-1], A[i]);			// 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3
		
		rightHighest[n-1] = A[n-1];
		for (int i=n-2; i>=0; i--)
			rightHighest[i] = Math.max(rightHighest[i+1], A[i]);		// 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1
		
		int water = 0;
		for (int i=0; i<n; i++)
			water += Math.min(leftHighest[i],rightHighest[i]) - A[i];
		
		return water;
	}
	
}
