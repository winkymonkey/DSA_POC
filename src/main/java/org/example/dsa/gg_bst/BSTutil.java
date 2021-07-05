package org.example.dsa.gg_bst;


public class BSTutil {
	
	/**
	 * *********************************
	 * BST STRUCTURE
	 *       3
	 *     /   \
	 *    2     5
	 *  /   \
	 * 1     4
	 * *********************************
	 */
	public static Node createNewBST1() {
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		return root;
	}
	
	
	/**
	 * *********************************
	 * BST STRUCTURE
	 *       7
	 *     /   \
	 *    5     9
	 *     \   / \
	 *      6 8  10
	 * *********************************
	 */
	public static Node createNewBST2() {
		Node root = new Node(7);
		root.left = new Node(5);
		root.right = new Node(9);
		
		root.left.right = new Node(6);
		
		root.right.left = new Node(8);
		root.right.right = new Node(10);
		
		return root;
	}
	
	
	/**
	 * *********************************
	 * BST STRUCTURE
	 *           10
	 *           /
	 *          9
	 *         /
	 *        8
	 *       /
	 *      7
	 *     /
	 *    6
	 *   /
	 *  5
	 * *********************************
	 */
	public static Node createNewBST3() {
		Node root = new Node(10);
		root.left = new Node(9);
		root.left.left = new Node(8);
		root.left.left.left = new Node(7);
		root.left.left.left.left = new Node(6);
		root.left.left.left.left.left = new Node(5);
		
		return root;
	}
	
}
