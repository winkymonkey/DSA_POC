package org.example.dsa.jj_binarytree.c_BFS_core;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print a specific level in a Binary Tree in reverse
 * ***************************************************************************************
 */

public class C03_printSpecificLevel_inReverse {
	/*
	 * --------------------
	 * TIME --- O(n)
	 * SAPCE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		int targetLevel = 3;
		printThisLevel(root, 1, targetLevel);
	}
	
	
	private static void printThisLevel(Node node, int currentLevel, int targetLevel) {
		if (node == null)
			return;
	
		if (currentLevel == targetLevel) {
			System.out.print(node.data + " ");
		}
		else {
			printThisLevel(node.right, currentLevel+1, targetLevel);
			printThisLevel(node.left, currentLevel+1, targetLevel);
		}
	}
	
}
