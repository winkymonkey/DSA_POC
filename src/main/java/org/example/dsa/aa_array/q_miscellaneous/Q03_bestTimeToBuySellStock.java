package org.example.dsa.aa_array.q_miscellaneous;

/**
 * ***************************************************************************************
 * Best Time to BUY and SELL stocks
 * ***************************************************************************************
 * You are given an array prices where prices[i] is the price of a given stock on the i'th day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * ***************************************************************************************
 */

public class Q03_bestTimeToBuySellStock {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array and for each 'i' (loop i)
	 *    Traverse array from 'i+1' to 'END' (loop j)
	 *       maxProfit = 0
	 *       profit = A[j]-A[i]
	 *       if (profit > maxProfit) { 
	 *          update maxProfit as profit
	 *       }
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
	 * Traverse the array and for each 'i' (loop i)
	 *    if (A[i] < minTillNow) { 
	 *       update minTillNow as A[i]
	 *    }
	 * 	  profit = A[i] - minTillNow
	 * 	  if (profit > maxProfit) { 
	 *       update maxProfit as profit
	 *    }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
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
