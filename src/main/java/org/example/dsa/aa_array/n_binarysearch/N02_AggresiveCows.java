package org.example.dsa.aa_array.n_binarysearch;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Aggressive cows
 * ***************************************************************************************
 * Farmer John has built a new long barn, with N stalls (2 <= N <= 100,000).
 * The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).
 * 
 * His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall.
 * To prevent the cows from hurting each other, 
 * John wants to assign the cows to the stalls such that the minimum distance between any two of them is as large as possible.
 * What is the largest minimum distance?  
 * 
 * ***************************************************************************************
 * Input:	Barn = 17		Stalls(N) = 6 //{1, 5, 8, 11, 13, 16}		Cows(C) = 4
 * 
 * ***************************************************************************************
 */

public class N02_AggresiveCows {
	/*
	 * --------------------
	 * Our objective is to adjust the cows among stalls in such a way that cows stay at maximum possible distance.
	 * But if we increase the distance between cows beyond a certain limit, we will fall short of stalls.
	 * 
	 * We can start with a greedy approach.
	 * So we place the cows at minimum 1 distance apart.
	 * Then we place the cows at minimum 2 distance apart.
	 * Then we place the cows at minimum 3 distance apart.
	 * .....
	 * .....
	 * We keep on increasing min distance between cows unless we fall short of stalls.
	 * Suppose we successfully placed cows at 'x' distance apart.
	 * But if we increase the min distance between cows to 'x+1' then we fall short of stalls.
	 * So we can say that 'x' is the optimal answer.
	 * 
	 * Now let us observe something,
	 * 	- The minimum possible distance between cows is ----- 0
	 * 	- The maximum possible distance between cows is ----- distance between first & last stall 
	 * 														(because if we try to place cows at distance bigger than this, then no more than 1 cow can be accommodated)
	 * 
	 * So we are doing nothing but searching 'x' in the above range.
	 * And that is also linearly.
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
		int A[] = {1, 5, 8, 11, 13, 16};
		int cows = 4;
		
		Arrays.sort(A);
		System.out.println(find(A, cows));
	}
	
	
	private static int find(int A[], int cows) {
		if (cows > A.length)
			return -1;
		
		int low = 0;								// 0
		int high = A[A.length-1] - A[0];			// gap between last & 1st
		int result = -1;
		
		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (isPossible(A, cows, mid)) {
				result = mid;
				low = mid+1;						// even though it's a valid possibility, we should try to maximize "minDist"
			}
			else {
				high = mid-1;						// decrease "minDist" between cows, so that all cows can be fitted in stalls
			}
		}
		return result;
	}
	
	
	private static boolean isPossible(int A[], int cows, int minDist) {
		int count = 1;								// count of required cows
		int prevCowPos = A[0];
		
		for (int i=1; i<A.length; i++) {
			if (A[i] - prevCowPos >= minDist) {		// if distance between previously placed cow and current cow >= min allowed distance.
				count++;							// cow can be placed at this position.
				prevCowPos = A[i];					// update cow position
				
				if (count == cows) {				// as soon as we accommodate all cows (doesn't matter if more stalls are left or not), it means it's POSSIBLE
					return true;
				}
			}
		}
		return false;
	}
	
}
