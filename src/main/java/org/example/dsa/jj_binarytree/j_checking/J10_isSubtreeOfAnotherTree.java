package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;

/**
 * ***************************************************************************************
 * Check if a Binary Tree is subtree of another Binary Tree
 * ***************************************************************************************
 * Tree1:    26
 *          /  \
 *         10   3
 *        /  \   \
 *       4    6   3
 *        \
 *        30
 * 
 * 
 * Tree2:    10
 *          /  \
 *         4    6
 *          \
 *          30
 * 
 * ***************************************************************************************
 */

public class J10_isSubtreeOfAnotherTree {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Tree1: 
	 * 		InOrder:  IN1[]  = 4 30 10 6 26 3 3
	 * 		PreOrder: PRE1[] = 26 10 4 30 6 3 3
	 * 
	 * Tree2:
	 * 		InOrder:  IN2[]  = 4 30 10 6
	 * 		PreOrder: PRE2[] = 10 4 30 6
	 * 
	 * If IN2[] is subarray of IN1[] and PRE2[] is subarray of PRE1[]
	 * then Tree2 is a subtree of Tree1
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * First check if both the trees are same or not (by comparing root nodes and children one by one).
	 * If yes, return true
	 * If no, then
	 * 		if (subtree from root1.left == subtree from root2) then return true
	 * 		if (subtree from root1 == subtree from root2.right)  then return true
	 * 		otherwise return false
	 * 
	 */

	public static void main(String args[]) {
		Node root1 = new Node(26);
		root1.left = new Node(10);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(6);
		root1.right.right = new Node(3);
		root1.left.left.right = new Node(30);

		Node root2 = new Node(10);
		root2.left = new Node(4);
		root2.right = new Node(6);
		root2.left.right = new Node(30);

		if (isSubtree(root1, root2))
			System.out.println("Tree2 is subtree of Tree1");
		else
			System.out.println("Tree2 is not a subtree of Tree1");
	}
	
	
	private static boolean isSubtree(Node root1, Node root2) {
		if (root2 == null) {
			return true;
		}
		else if (root1 == null) {
			return false;
		}
		else if (isSameTree(root1, root2)) {
			return true;
		}
		else {
			return isSubtree(root1.left, root2) || isSubtree(root1.right, root2);
		}
	}
	
	
	private static boolean isSameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data 
				&& isSameTree(root1.left, root2.left)
				&& isSameTree(root1.right, root2.right));
	}

}
