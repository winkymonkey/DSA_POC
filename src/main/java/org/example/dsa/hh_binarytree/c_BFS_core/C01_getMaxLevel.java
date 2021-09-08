package org.example.dsa.hh_binarytree.c_BFS_core;

import org.example.dsa.hh_binarytree.Node;
import org.example.dsa.hh_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Find the maximum level of a Binary Tree
 * ***************************************************************************************
 */

public class C01_getMaxLevel {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		int maxLevel = getMaxLevel(root);
		System.out.println(maxLevel);
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
	
}
