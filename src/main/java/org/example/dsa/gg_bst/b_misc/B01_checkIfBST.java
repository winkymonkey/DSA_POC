package org.example.dsa.gg_bst.b_misc;

import org.example.dsa.gg_bst.BSTutil;
import org.example.dsa.gg_bst.Node;

/**
 * ***************************************************************************************
 * Check if a tree is a BST or not
 * ***************************************************************************************
 * 
 *       7
 *     /   \
 *    5     9
 *     \   / \
 *      6 8  10
 * 
 * ***************************************************************************************
 */

public class B01_checkIfBST {
	/*
	 * ---------------
	 * Write a function that recursively checks whether the left & right subtrees are BST or not.
	 * In each recursive call, we MUST pass the allowed MIN & MAX value that can occur in that subtree.
	 * If any subtree violates the constraint, then we can conclude that the entire Binary Tree is not a BST.
	 * --------------- 
	 */
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST2();
		
		boolean isBst = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(isBst);
	}
	
	
	private static boolean isBST(Node node, int min, int max) {
		if (node == null)
			return true;

		if (node.data < min || node.data > max)													// this node violates the min/max constraints
			return false;

		return (isBST(node.left, min, node.data-1) && isBST(node.right, node.data+1, max));		// check the subtrees recursively tightening the min-max constraints
	}
	
}
