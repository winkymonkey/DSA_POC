package org.example.dsa.aa_array.p_miscellaneous;

/**
 * *****************************************************************************
 * Trapping Rain Water problem
 * *****************************************************************************
 */

public class P02_trappingRainWater {
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
	 * TIME --- O(N^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---EFFICIENT SOLUION---
	 * -----------------------
	 * The above approach has a serious drawback
	 * To find the highest bar on the left and right, array traversal is needed which reduces the efficiency of the solution.
	 * To make this efficient we must pre-compute the highest bar on the left & right of every bar in linear time.
	 * Then we can use these pre-computed values to find the amount of water in every array element.
	 * 
	 * -------
	 * LEFT[n]
	 * Traverse A[] (from 0 to n-1)
	 * For every i,
	 * 		LEFT[i] = max(LEFT[i-1], A[i])
	 * 
	 * RIGHT[n]
	 * Traverse A[] (from n-1 to 0)
	 * For every i,
	 * 		RIGHT[i] = max(RIGHT[i+1], A[i])
	 * 
	 * Traverse the main array
	 * The amount of water that will be stored in this column is ----- min(LEFT[i], RIGHT[i]) - A[i]
	 * Add this value to total amount of water stored
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(calculateWater(A));
	}
	
	
	private static int calculateWater(int A[]) {
		int n = A.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int water = 0;
		
		left[0] = A[0];
		for (int i=1; i<n; i++)
			left[i] = Math.max(left[i-1], A[i]);
		
		right[n-1] = A[n-1];
		for (int i=n-2; i>=0; i--)
			right[i] = Math.max(right[i+1], A[i]);
		
		for (int i=0; i<n; i++)
			water += Math.min(left[i], right[i]) - A[i];
		
		return water;
	}
	
}
