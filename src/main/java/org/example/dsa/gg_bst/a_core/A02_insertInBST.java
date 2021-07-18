package org.example.dsa.gg_bst.a_core;

import org.example.dsa.gg_bst.BSTutil;
import org.example.dsa.gg_bst.Node;

/**
 * *********************************************************************************
 * Insert an element in BST
 * *********************************************************************************
 */

public class A02_insertInBST {
	/*
	 * ------------------
	 * A new element is always inserted at the leaf, but we need to find that leaf.
	 * Start searching from the root.
	 * if the new element is smaller than current node, then recursively search in left subtree until we hit a leaf
	 * if the new element is greater than current node, then recursively search in right subtree until we hit a leaf
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST2();
		
		searchAndInsert(root, 4);
		searchAndInsert(root, 16);
		searchAndInsert(root, 12);
		System.out.println(root);
	}
	
	
	private static Node searchAndInsert(Node root, int k) {
		if (root==null) {
			root = new Node(k);
			return root;
		}
		
		if (k < root.data) {
			root.left = searchAndInsert(root.left, k);
			return root;
		}
		else {
			root.right = searchAndInsert(root.right, k);
			return root;
		}
	}
	
}
