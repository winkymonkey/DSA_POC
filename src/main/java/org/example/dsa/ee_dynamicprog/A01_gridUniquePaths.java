package org.example.dsa.ee_dynamicprog;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Grid unique paths
 * ***************************************************************************************
 * A robot is located at top-left corner of a m*n grid.
 * The robot can only move in either right or down at any point of time.
 * The robot is trying to reach bottom-right corner of the grid.
 * How many possible unique paths are there.
 * ***************************************************************************************
 */

public class A01_gridUniquePaths {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Suppose the grid looks like:
	 * 
	 *    - - -
	 *    - - -
	 * 
	 * Starting from (0,0) we can make two recursive calls: one for right path, another for bottom path
	 * Recursion tree looks like:
	 *                              (0,0)
	 *                    ____________|____________
	 *                   /                         \
	 *                 (1,0)                      (0,1)
	 *                 __|__                   _____|_____
	 *                /     \                 /           \
	 *             (2,0)  (1,1)            (1,1)         (0,2)
	 *                     __|__           __|__         __|__
	 *                    /     \         /     \       /     \
	 *                 (2,1)   (1,2)   (2,1)   (1,2) (1,2)   (0,3)
	 * 
	 * As we are looking for all possible combinations, the time complexity is going to be exponential.
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * We can observer that there are few states in the recursion tree which are being repeated.
	 * That means the problems contain overlapping subproblems.
	 * Hence we can use dynamic programming.
	 * 
	 * We are following a top-down (memoization) approach here.
	 * 
	 */
	
	private static int row = 2;
	private static int col = 3;
	private static int table[][] = new int[row][col];
	
	
	public static void main(String[] args) {
		System.out.println(findPath(0, 0));
		
		for (int i=0; i<table.length; i++) {
			Arrays.fill(table[i], -1);
		}
		System.out.println(findPathDynamic(0, 0));
	}
	
	
	private static int findPath(int i, int j) {
		if (i>=row || j>=col)
			return 0;
		if (i==row-1 && j==col-1)
			return 1;
		
		return findPath(i+1, j) + findPath(i, j+1);
	}
	
	
	private static int findPathDynamic(int i, int j) {
		if (i>=row || j>=col)
			return 0;
		if (i==row-1 && j==col-1)
			return 1;
		
		if (table[i][j] != -1)
			return table[i][j];
		else
			return table[i][j] = findPath(i+1, j) + findPath(i, j+1);		// store the result in table[i][j] and then return
	}
	
}
