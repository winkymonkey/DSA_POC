package org.example.dsa.aa_array.p_miscellaneous;

/**
 * *****************************************************************************
 * Best Time to BUY and SELL stocks
 * *****************************************************************************
 */

public class P04_stockBuySell {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array (loop i)
	 * For each 'i' traverse from i+1 to END (loop j)
	 * 
	 * maxProfit = 0
	 * At each step profit = A[j]-A[i]
	 * if profit > maxProfit ------- update maxProfit as profit
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * minTillNow = 99999999
	 * maxProfit = 0
	 * 
	 * Traverse the array (loop i)
	 * At each step
	 * 		if A[i] < minTillNow ------- update minTillNow as A[i]
	 * 		profit = A[i] - minTillNow
	 * 		if profit > maxProfit ------- update maxProfit as profit
	 * 
	 */
	
	public static void main(String[] args) {
		int prices[] = {7, 1, 5, 3, 6, 4};
		System.out.println(findMaxProfit(prices));
	}
	
	
	private static int findMaxProfit(int A[]) {
		int minTillNow = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i] < minTillNow)
				minTillNow = A[i];
			else if (A[i] - minTillNow > maxProfit)
				maxProfit = A[i] - minTillNow;
		}
		return maxProfit;
	}
	
}
