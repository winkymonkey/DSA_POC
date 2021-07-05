package org.example.dsa.ff_binarytree.c_BFS_core;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ********************************************************************************
 * Print a specific level in a binary tree
 * ********************************************************************************
 */

public class C02_printSpecificLevel {
	
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
			printThisLevel(node.left, currentLevel+1, targetLevel);
			printThisLevel(node.right, currentLevel+1, targetLevel);
		}
	}
	
}