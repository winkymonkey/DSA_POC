package org.example.dsa.ff_binarytree.g_checking;

import org.example.dsa.ff_binarytree.Node;

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

public class G09_isSubtreeOfAnotherTree {
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
	 * If "root1" & "root2" are identical, then both the trees are identical.
	 * Otherwise compare "root2" with "root1.left" and "root1.right" to decide whether they are identical or not.
	 * While checking for identity, both the subtrees must be equal by each nodes.
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
		if (root2 == null)
			return true;

		if (root1 == null)
			return false;

		if (areIdentical(root1, root2))
			return true;
		else
			return isSubtree(root1.left, root2) || isSubtree(root1.right, root2);
	}
	
	
	private static boolean areIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data 
				&& areIdentical(root1.left, root2.left)
				&& areIdentical(root1.right, root2.right));
	}

}
