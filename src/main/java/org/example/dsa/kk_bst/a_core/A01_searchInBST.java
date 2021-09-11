package org.example.dsa.kk_bst.a_core;

import org.example.dsa.kk_bst.BSTutil;
import org.example.dsa.kk_bst.Node;

/**
 * ***************************************************************************************
 * Search an element in BST
 * ***************************************************************************************
 */

public class A01_searchInBST {
	/*
	 * ------------------
	 * Start searching from the root.
	 * if the desired element is smaller than current node, then recursively search in left subtree
	 * if the desired element is greater than current node, then recursively search in right subtree
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST2();
		
		Node foundNode = search(root, 8);
		if (foundNode==null)
			System.out.println("not found");
		else
			System.out.println("found");
	}
	
	
	private static Node search(Node root, int k) {
		if (root == null || root.data == k)
			return root;
		
		if (k < root.data)
			return search(root.left, k);
		else
			return search(root.right, k);
	}
	
}
