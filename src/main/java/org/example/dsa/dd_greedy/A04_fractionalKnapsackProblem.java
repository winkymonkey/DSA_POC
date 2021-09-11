package org.example.dsa.dd_greedy;

/**
 * ***************************************************************************************
 * Fractional Knapsack Problem
 * ***************************************************************************************
 * Given weights and values of n items, we need to put these items in a knapsack of capacity W
 * to get the maximum total value in the knapsack.
 * Unlike the 0-1 Knapsack problem, here you can break items.
 * Your objective is to maximize the total value of knapsack.
 * ***************************************************************************************
 * Input:
 * W = 50
 * A[] = {{60, 10}, {100, 20}, {120, 30}} 		//value,weight pair
 * 
 * Output:
 * 240		// full item of weight 10 + full item of weight 20 + 2/3 fraction of weight 30
 * ***************************************************************************************
 */

public class A04_fractionalKnapsackProblem {
	/*
	 * --------------------
	 * As we can break items, our objective should be to pick the items which has highest weight of unit weight (i.e. value/weight)
	 * Item-1: value/weight = 60/10 = 6
	 * Item-2: value/weight = 100/20 = 5
	 * Item-3: value/weight = 120/30 = 4
	 * 
	 * --------------------
	 */
}
