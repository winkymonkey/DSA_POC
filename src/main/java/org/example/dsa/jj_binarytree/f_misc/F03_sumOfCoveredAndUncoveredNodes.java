package org.example.dsa.jj_binarytree.f_misc;

/**
 * ***************************************************************************************
 * Check sum of Covered and Uncovered nodes (appears either on left / right boundary) of Binary Tree
 * ***************************************************************************************
 * Input:
 *           9
 *         /   \
 *        4     17
 *       / \      \
 *      3   6      22
 *         / \     /
 *        5   7   20
 * 
 * Covered Nodes ---- 6,5,7
 * Uncovered Nodes -- 9,4,3,17,22,20
 * 
 * ***************************************************************************************
 */

public class F03_sumOfCoveredAndUncoveredNodes {
	/*
	 * ------------------
	 * THIS PROBLEM IS RELATED TO BOUNDARY TRAVERSAL
	 * 
	 * TRAVERSE LEFT BOUNDARY (sum_left)
	 * 	- start from root, keep going to left until left child is available.
	 * 	- if no left child, go to right child & again follow same procedure until you reach a leaf node.
	 * 	- in each step update the sum_left by adding the value of the current node.
	 * 
	 * TRAVERSE RIGHT BOUNDARY (sum_right)
	 * 	- start from root, keep going to left until right child is available.
	 * 	- if no right child, go to left child & again follow same procedure until you reach a leaf node.
	 * 	- in each step update the sum by adding the value of the current node.
	 * 
	 * TRAVERSE ENTIRE TREE (sum_all)
	 *  - traverse full tree and calculate the sum of all nodes.
	 * 
	 * 
	 * sum_uncovered = sum_left + sum_right
	 * sum_covered = sum_all - sum_uncovered
	 * 
	 * check if "sum_covered" is equals to "sum_uncovered"
	 * ------------------
	 */
}
