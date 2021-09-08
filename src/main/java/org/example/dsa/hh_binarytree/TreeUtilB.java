package org.example.dsa.hh_binarytree;


public class TreeUtilB {
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		  1
	 *      /   \
	 *     2     3
	 *    /       \
	 *   4         7
	 *  /           \
	 * 8            15
	 * *********************************
	 */
	public static Node createNewTreeB1() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		
		root.right.right.right = new Node(15);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		 1
	 *      /
	 *     2
	 *    /
	 *   4
	 *  /
	 * 8
	 * *********************************
	 */
	public static Node createNewTreeB2() {
		Node root = new Node(1);
		root.left = new Node(2);
		
		root.left.left = new Node(4);
		
		root.left.left.left = new Node(8);
		
		return root;
	}
	
	
	
	
	/**
	 * *********************************
	 * TREE STRUCTURE
	 * 		   1
	 *          \
	 *           3
	 *            \
	 *             7
	 *              \
	 *              15
	 * *********************************
	 */
	public static Node createNewTreeB3() {
		Node root = new Node(1);
		root.right = new Node(3);
		
		root.right.right = new Node(7);
		
		root.right.right.right = new Node(15);
		
		return root;
	}
	
}
