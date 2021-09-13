package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Check if it's a PERFECT Binary Tree
 * ***************************************************************************************
 */

public class J09_isPerfect {
	/*
	 * ------------------
	 * PERFECT:
	 * all internal nodes have two children and all leaves are at same level
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA1();
		
		int depth = depth(root);
		boolean isPerfect = isPerfect(root, 1, depth);
		System.out.println(isPerfect);
	}
	
	
	private static int depth(Node node) {
		int depth = 0;
		while (node != null) {
			node = node.left;
			depth++;
		}
		return depth;
	}
	
	
	private static boolean isPerfect(Node node, int level, int anyDepth) {
		if (node == null)
			return true;
		
		if (node.left == null && node.right == null)		// if leaf node, it's level should be equal to other leaves
			return (level == anyDepth);
		
		if (node.left == null || node.right == null)		// if any one child exists, then it's not perfect
			return false;
		
		return isPerfect(node.left, level+1, anyDepth) && isPerfect(node.right, level+1, anyDepth);		// otherwise it will perfect only if both of its children are perfect
	}
	
}
