package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Check if it's a FULL Binary Tree
 * ***************************************************************************************
 */

public class J07_isFull {
	/*
	 * --------------------
	 * FULL:
	 * all nodes have either 0 or 2 child nodes
	 * --------------------
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		
		boolean isComplete = isFull(root);
		System.out.println(isComplete);
	}
	
	
	private static boolean isFull(Node node) {
		if (node == null)
			return true;
		
		if (node.left == null && node.right == null)			// if leaf node, it's full
			return true;
		
		if (node.left != null && node.right != null)				// if both children exists, then it will be full only if both of its children are full
			return isFull(node.left) && isFull(node.right);
		
		return false;
	}
	
}
