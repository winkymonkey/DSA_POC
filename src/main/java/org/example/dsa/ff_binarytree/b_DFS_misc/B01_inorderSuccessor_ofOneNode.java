package org.example.dsa.ff_binarytree.b_DFS_misc;

import org.example.dsa.ff_binarytree.Node;

/**
 * *****************************************************************************
 * InOrder Successor of a node in Binary Tree
 * *****************************************************************************
 * InOrder Successor of a node is the next node in InOrder traversal.
 * InOrder Successor is NULL for the last node in InOrder traversal.
 * 
 * Example:
 * 		1
 *     / \
 *    2   3
 *   / \   \
 *  4   5   6
 * 
 * InOrder successor of node 3 is 6
 * InOrder successor of node 4 is 2
 * InOrder successor of node 5 is 1
 * InOrder successor of node 6 is NULL
 * 
 * *****************************************************************************
 */

public class B01_inorderSuccessor_ofOneNode {
	/*
	 * To find the InOrder Successor of a given node 'X', we need to take care of 3 cases.
	 * 
	 * ----------------------------------------------------------------------------------------------------------------
	 * CASE-1:	IF [X.right != null]														//successor of 1 or 2 or 3
	 * ----------------------------------------------------------------------------------------------------------------
	 * Recursively find the leftmost node in the right subtree of X
	 * //successor is the leftmost Node
	 * 
	 * 
	 * -----------------------------------------------------------------------------------------------------------
	 * CASE-2:	IF [X.right == null] and [X is NOT the rightMost Node of entire tree]		//successor of 4 or 5
	 * -----------------------------------------------------------------------------------------------------------
	 * In this case, we keep finding the parent (P) of the given node X such that P.left = X
	 * For example in the above tree,
	 * 		initially, parent of 5 is 2 but 2.left != 5
	 * 		so now, parent of 2 is 1, but 1.left = 2
	 * 		Therefore, InOrder successor of 5 is 1
	 * 
	 * ALGO:
	 * 	Start traversing the tree from root & find X recursively
	 * 	If (root == X), stop recursion otherwise find X recursively for left and right subtrees
	 * 	After finding the node X, recur­sion will back­track to the root
	 * 	Every recursive call will return the node itself to the calling function, we will store this in a temporary node TEMP
	 * 	Now, when it back­tracked to its par­ent which will be root now, check whether root.left=TEMP, if not, keep going up
	 * 
	 * 
	 * ------------------------------------------------------------------------------------------------------
	 * CASE-3:	IF [X.right == null] and [X is the rightMost Node of entire tree]			//successor of 6
	 * ------------------------------------------------------------------------------------------------------
	 * //successor is NULL
	 * 
	 */
	
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		findInorderSuccesor(root, root);				// case 1 (X = 1)
		findInorderSuccesor(root, root.left);			// case 1 (X = 2)
		findInorderSuccesor(root, root.right);			// case 1 (X = 3)
		findInorderSuccesor(root, root.left.left);		// case 2 (X = 4)
		findInorderSuccesor(root, root.left.right);		// case 2 (X = 5)
		findInorderSuccesor(root, root.right.right);	// case 3 (X = 6)
	}
	
	
	private static void findInorderSuccesor(Node root, Node X) {
		if (X.right != null) {													// Case1: If right child is not null
			Node node = leftMostNode(X.right);
			System.out.println("Inorder Successor of "+X.data+" is "+node.data);
		}
		if (X.right == null && rightMostNode(root) != X) {						// Case2: If right child is null and X is NOT the right most node
			find(root, X);
		}
		if (X.right == null && rightMostNode(root) == X) {						// Case3: If right child is null and X is the right most node
			System.out.println("Inorder Successor of " + X.data + " is NULL");
		}
	}
	
	
	private static Node leftMostNode(Node node) {
		while (node != null && node.left != null)
			node = node.left;
		return node;
	}
	private static Node rightMostNode(Node node) {
		while (node != null && node.right != null)
			node = node.right;
		return node;
	}
	
	
	private static Node temp;
	
	private static Node find(Node root, Node X) {
		if (root == null)
			return null;
		
		if (root == X)
			return root;
		
		if ( (temp = find(root.left, X)) != null || (temp = find(root.right, X)) != null ) {
			if (root.left == temp) {
				System.out.println("Inorder Successor of " + X.data + " is " + root.data);
				return null;
			}
			else {
				return root;		// when root.right == temp
			}
		}
		return null;				// when neither leftChild nor rightChild contains X
	}
}
