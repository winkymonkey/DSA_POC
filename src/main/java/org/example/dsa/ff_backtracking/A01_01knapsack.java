package org.example.dsa.ff_backtracking;

import java.util.Arrays;

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
	 * We start from the last element.
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int weights[] = { 1, 3, 4, 5 };
		int profits[] = { 10, 40, 50, 70 };
		int capacity = 7;
		int n = weights.length;
		
		int maxProfit = knapsack(weights, n, capacity, profits);
		System.out.println(maxProfit);
		
		int maxProfit2 = knapsack_dynamic(weights, n, capacity, profits);
		System.out.println(maxProfit2);
	}
	
	
	private static int knapsack(int weights[], int n, int capacity, int profits[]) {
		if (capacity == 0 || n == 0)
			return 0;
		
		if (weights[n-1] <= capacity) {
			int profit1 = profits[n-1] + knapsack(weights, n-1, capacity-weights[n-1], profits);	// PICK weight[n-1] element
			int profit2 = knapsack(weights, n-1, capacity, profits);								// NOT PICK weight[n-1] element
			
			return Math.max(profit1, profit2);
		}
		else {
			return knapsack(weights, n-1, capacity, profits);
		}
	}
	
	
	/*
	 * --------------------
	 * Dynamic Programming solution
	 * --------------------
	 */
	private static int lookup[][] = new int[100][100];												// should be 'n'*'capacity' size
	static {
		for (int i=0; i<lookup.length; i++) {
			Arrays.fill(lookup[i], -1);
		}
	}
	
	private static int knapsack_dynamic(int weights[], int n, int capacity, int profits[]) {
		if (capacity == 0 || n == 0)
			return 0;
		
		if (lookup[n][capacity] != -1) {
			return lookup[n][capacity];
		}
		
		if (weights[n-1] <= capacity) {
			int profit1 = profits[n-1] + knapsack(weights, n-1, capacity-weights[n-1], profits);	// PICK weight[n-1] element
			int profit2 = knapsack(weights, n-1, capacity, profits);								// NOT PICK weight[n-1] element
			
			return lookup[n][capacity] = Math.max(profit1, profit2);
		}
		else {
			return lookup[n][capacity] = knapsack(weights, n-1, capacity, profits);
		}
	}
	
}
