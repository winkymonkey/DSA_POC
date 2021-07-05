package org.example.dsa.ff_binarytree.c_BFS_core;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * *****************************************************************************
 * Print BFS traversal sequence (without extra space)
 * *****************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *    8      9
 * 
 * BFS:   1 2 3 4 5 6 7 8 9
 * 
 * ******************************************************************************
 */

public class C04B_BFS_withoutExtraSpace {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		printBFS(root);
	}
	
	
	private static void printBFS(Node root) {
		int maxLevel = getMaxLevel(root);				//get the Maximum Level Of the Tree.
		
		for (int i=1; i<=maxLevel; i++) {
			printThisLevel(root, 1, i);					//print Current Level
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
