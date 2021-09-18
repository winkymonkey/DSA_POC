package org.example.dsa.ff_backtracking;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Coin Change Problem --- min number of coins
 * ***************************************************************************************
 * any coins can be picked unlimited number of times
 * ***************************************************************************************
 * Input:  A = {2, 5, 3, 6}		target = 10
 * Output: 2									// {5,5}
 * 
 * ***************************************************************************************
 */

public class A05_coinChange_minNumOfCoins {
	/*
	 * --------------------
	 * ALMOST SAME AS "TargetSubsetSum_repeat"
	 * -------------------- 
	 */
	
	public static void main(String args[]) {
		int A[] = {2, 3, 5, 6};				// { 2, 3, 5, 6, 2, 4, 7, 3, 5, 8, 1, 8, 4, 5, 4,2,4,5,7,8,1,1,1,3,4,5,8,1,2,6,3,2,8 };
		int target = 10;					// 26
		
		int minCoins = minCoins(A, A.length, target);
		System.out.println(minCoins);
		
		int minCoins2 = minCoins_dynamic(A, A.length, target);
		System.out.println(minCoins2);
		
	}
	
	
	private static int minCoins(int A[], int n, int target) {
		if (target == 0)
			return 0;
		
		if (n == 0)
			return Integer.MAX_VALUE - 1;					// we are doing -1 because during recursion when we add 1 to answer, it causes overflow
		
		if (A[n-1] <= target) {
			int coins1 = minCoins(A, n, target-A[n-1]) + 1;
			int coins2 = minCoins(A, n-1, target);
			return Math.min(coins1, coins2);
		}
		else {
			return minCoins(A, n-1, target);
		}
	}
	
	
	
	
	/*
	 * --------------------
	 * Dynamic Programming solution
	 * --------------------
	 */
	private static int lookup[][] = new int[1000][1000];
	static {
		for (int i=0; i<lookup.length; i++) {
			Arrays.fill(lookup[i], -1);
		}
	}
	
	private static int minCoins_dynamic(int A[], int n, int target) {
		if (target == 0)
			return 0;
		
		if (n == 0)
			return Integer.MAX_VALUE - 1;
		
		if (lookup[n-1][target] != -1)
			return lookup[n-1][target];
		
		if (A[n-1] <= target) {
			int coins1 = minCoins_dynamic(A, n, target-A[n-1]) + 1;
			int coins2 = minCoins_dynamic(A, n-1, target);
			return lookup[n-1][target] = Math.min(coins1, coins2);
		}
		else {
			return lookup[n-1][target] = minCoins(A, n-1, target);
		}
	}
	
}
