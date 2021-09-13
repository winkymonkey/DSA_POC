package org.example.dsa.jj_binarytree.c_BFS_core;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print BFS traversal sequence (without extra space)
 * ***************************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *     8     9
 * 
 * BFS:   1 2 3 4 5 6 7 8 9
 * 
 * ***************************************************************************************
 */

public class C04A_BFS_withoutExtraSpace {
	/*
	 * --------------------
	 * TIME --- O(n^2)			// printThisLevel takes O(n) which is called for each levels. In skewed tree, for n nodes there is n levels
	 * SAPCE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		printBFS(root);
	}
	
	
	private static void printBFS(Node root) {
		int maxLevel = getMaxLevel(root);				// get the maximum level of the tree
		
		for (int i=1; i<=maxLevel; i++) {
			printThisLevel(root, 1, i);					// print each level
		}
	}
	
	
	private static int getMaxLevel(Node root) {
		if (root == null)
			return 0;
		
		int leftLevel = getMaxLevel(root.left);
		int rightLevel = getMaxLevel(root.right);
		
		if (leftLevel > rightLevel)
			return leftLevel+1;
		else
			return rightLevel+1;
	}
	
	
	private static void printThisLevel(Node node, int currentLevel, int targetLevel) {
		if (node == null)
			return;
		
		if (currentLevel == targetLevel) {
			System.out.print(node.data + " ");
		}
		else {
			printThisLevel(node.left, currentLevel+1, targetLevel);
			printThisLevel(node.right, currentLevel+1, targetLevel);
		}
	}
	
}
