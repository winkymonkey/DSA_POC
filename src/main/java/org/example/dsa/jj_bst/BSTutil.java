package org.example.dsa.jj_bst;


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
	
	
	
	/**
	 * *********************************
	 * BST STRUCTURE
	 *              25
	 *         /          \
	 *      18             50
	 *     /  \          /    \
	 *   19    20      35     60
	 *    \   /  \    /  \   /  \
	 *    15 19  25  20  40 55   70
	 *                \
	 *                25
	 * *********************************
	 */
	public static Node createNewBST4() {
		Node root = new Node(25);
		root.left = new Node(18);
		root.left.left = new Node(19);
		root.left.right = new Node(20);
		root.left.left.right = new Node(15);
		root.left.right.left = new Node(19);
		root.left.right.right = new Node(25);
		
		root.right = new Node(50);
		root.right.left = new Node(35);
		root.right.right = new Node(60);
		root.right.left.left = new Node(20);
		root.right.left.right = new Node(40);
		root.right.left.left.right = new Node(25);
		root.right.right.left = new Node(55);
		root.right.right.right = new Node(70);
		
		return root;
	}
	
}
