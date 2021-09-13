package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Check if it's a COMPLETE Binary Tree
 * ***************************************************************************************
 */

public class J08_isComplete {
	/*
	 * --------------------
	 * COMPLETE:
	 * every level (except possibly the last) is completely filled & all nodes are as far left as possible.
	 * --------------------
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		
		int totalNodes = countNodes(root);
		boolean isComplete = isComplete(root, 0, totalNodes);
		System.out.println(isComplete);
	}
	
	
	private static int countNodes(Node node) {
		if (node == null)
			return 0;
		
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
	
	
	private static boolean isComplete(Node node, int i, int totalNodes) {
		if (node == null)
			return true;
		
		if (i > totalNodes)
			return false;
		
		return isComplete(node.left, (2*i)+1, totalNodes) && isComplete(node.right, (2*i)+2, totalNodes);
	}
	
}
