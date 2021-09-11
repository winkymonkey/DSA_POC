package org.example.dsa.aa_array.n_binarysearch;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * EcoFriendly Wood Cutting
 * ***************************************************************************************
 * Mirko needs to chop down M meters of wood. (1 ≤ M ≤ 2,000,000,000)
 * Mirko is only allowed to cut N number of trees. (1 ≤ N ≤ 1,000,000)
 * 
 * His machine works as follows:
 *  - Mirko sets a height parameter H (in meters), and the machine raises a giant saw blade to that height and cuts off all tree parts higher than H
 *  - Obviously, trees not higher than H meters remain intact
 *  - Mirko then takes the parts that were cut off. 
 * 
 * Mirko is ecologically minded, so he doesn't want to cut off more wood than necessary.
 * That's why he wants to set his saw blade as high as possible.
 * Help Mirko find the maximum integer height of the saw blade that still allows him to cut off at least M meters of wood.
 * 
 * ***************************************************************************************
 * Input:	Trees = {20, 15, 10, 17}		Required Wood(M) = 7
 * Output:	15
 * 
 * Input:	Trees = {4, 42, 40, 26, 46}		Required Wood(M) = 20
 * Output:	36
 * 
 * ***************************************************************************************
 */

public class N03_EcoFriendlyWoodCutting {
	/*
	 * --------------------
	 * Our objective is to keep the saw blade as high as possible so that the the cut-down wood is minimum yet sufficient for his need.
	 * But if we increase the blade height beyond a certain limit, we will not be able to cut-down the desired quantity of wood.
	 * 
	 * We can start with a greedy approach.
	 * So we set the blade height at 0 and calculate the amount of wood that is cut down
	 * Then we set the blade height at 1 and calculate the amount of wood that is cut down.
	 * Then we set the blade height at 2 and calculate the amount of wood that is cut down
	 * .....
	 * .....
	 * We keep on increasing the blade height unless we collect less wood than required.
	 * Suppose we are able to collect sufficient wood by placing the blade height at 'x'.
	 * But if we increase the blade height further to 'x+1' then we collect less wood than required.
	 * So we can say that 'x' is the optimal answer.
	 * 
	 * Now let us observe something,
	 *  - the minimum height where the blade can be placed ----- 0
	 *  - the maximum height where the blade can be placed ----- tallest tree
	 * 
	 * So we are doing nothing but searching 'x' in the above range.
	 * And that is also linearly.
	 * 
	 * 
	 * So obviously we can optimize the solution by changing it to Binary Search.
	 * 
	 * 
	 * TIME --- O(log N)
	 * SPACE -- O(1)
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = {4, 42, 40, 26, 46};
		int required = 20;
		
		Arrays.sort(A);
		System.out.println(find(A, required));
	}
	
	
	private static int find(int A[], int required) {
		if (required > Arrays.stream(A).sum())
			return -1;
		
		int low = 0;										// 0
		int high = Arrays.stream(A).max().getAsInt();		// max height
		int result = -1; 
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (isSufficientWoodCollected(A, required, mid)) {
				result = mid;
				low = mid+1;								// even though sufficient wood is collected, we should try to minimize "maxBladeHeight"
			}
			else {
				high = mid-1;								// decrease "maxBladeHeight", so that more wood can be collected
			}
		}
		return result;
	}
	
	
	private static boolean isSufficientWoodCollected(int A[], int required, int maxBladeHeight) {
		int totalWood = 0;										// total collected wood
		for (int i=0; i<A.length; i++) {
			if (A[i] > maxBladeHeight) {						// if current tree is taller than blade's height
				totalWood = totalWood + (A[i]-maxBladeHeight);	// add excess wood in your collection
			}
		}
		if (totalWood >= required)								// if collected wood is equal/more than that is required, we are good 
			return true;
		else
			return false;
	}
	
}
