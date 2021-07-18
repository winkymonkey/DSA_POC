package org.example.dsa.gg_bst.c_find;

import org.example.dsa.gg_bst.BSTutil;
import org.example.dsa.gg_bst.Node;

/**
 * *******************************************************************************************
 * Find the LCA (lowest common ancestor) between two given nodes n1 and n2 in a BST
 * *******************************************************************************************
 * Input:
 *       20
 *     /    \
 *    8     22
 *  /  \
 * 4   12
 *    /  \
 *   10  14
 * 
 * Output:
 * 	LCA of 10,14 ---- 12
 *  LCA of 8,14 ----- 8
 *  LCA of 10,22 ---- 20
 * 
 * *******************************************************************************************
 */

public class C03_findLCA {
	/*
	 * ----------------
	 * We recursively traverse the BST in such a way that,
	 * If node’s value > both n1,n2 -----> then the LCA lies in the left side of the node
	 * If node’s value < both n1,n2 -----> then the LCA lies in the right side of the node
	 * Otherwise the root is LCA
	 * ----------------
	 */
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST2();
		findLCA(root, 10, 14);
	}
	
	private static Node findLCA(Node root, int n1, int n2) {
		if (root == null)
			return null;
		
		if (root.data > n1 && root.data > n2) {
			return findLCA(root.left, n1, n2);
		}
		else if (root.data < n1 && root.data < n2) {
			return findLCA(root.right, n1, n2);
		}
		else {
			return root;
		}
	}
	
}
