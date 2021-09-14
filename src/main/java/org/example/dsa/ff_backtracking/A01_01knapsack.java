package org.example.dsa.ff_backtracking;

/**
 * ***************************************************************************************
 * 0-1 Knapsack Problem
 * ***************************************************************************************
 * A weight[] and a profit[] array is given which denotes the weight and profits of n items.
 * You are given a bag of capacity W.
 * Your task is selectively put some items in the bag in order to maximize the profit.
 * ***************************************************************************************
 * Input:
 * 		weights[] = { 1, 3, 4, 5 }
 * 		profits[] = { 10, 40, 50, 70 }
 * 		Capacity = 7
 * ***************************************************************************************
 */

public class A01_01knapsack {
	/*
	 * --------------------
	 * For each item below scenarios can appear:
	 * 	- Item weight > bag capacity
	 *  - Item weight < bag capacity
	 *  	- we may pick the item
	 *  	- we may not pick the item
	 * 
	 * Depending upon the above, a decision tree appears.
	 * 
	 * So we can start from the last element and go through the above 3 scenarios.
	 * After that we can move to the 2nd last element.
	 * After that we can move to the 3rd last element.
	 * ....
	 * ....
	 * In this was we traverse all elements
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int weights[] = { 1, 3, 4, 5 };
		int profits[] = { 10, 40, 50, 70 };
		int capacity = 7;
		int n = weights.length;
		
		int maxProfit = knapsack(weights, profits, capacity, n);
		System.out.println(maxProfit);
	}
	
	
	// returns maximum profit
	private static int knapsack(int weights[], int profits[], int capacity, int n) {
		if (capacity == 0 || n == 0)
			return 0;
		
		if (weights[n-1] <= capacity) {
			int profitIfPick = profits[n-1] + knapsack(weights, profits, capacity-weights[n-1], n-1);
			int profitIfNotPick = knapsack(weights, profits, capacity, n-1);
			
			return Math.max(profitIfPick, profitIfNotPick);
		}
		else {
			return knapsack(weights, profits, capacity, n-1);
		}
	}
	
}
