package org.example.dsa.ff_binarytree.a_DFS_core;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ******************************************************************************************
 * Print InOrder, PreOrder, PostOrder traversal sequence using iterative approach
 * ******************************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *     8     9
 * 
 * InOrder:   4 8 2 5 1 6 3 9 7
 * PreOrder:  1 2 4 8 5 3 6 7 9
 * PostOrder: 8 4 5 2 6 9 7 3 1
 * 
 * ******************************************************************************************
 */

public class A01A_DFS_InPrePost_recursive {

	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();

		System.out.print("InOrder:::");
		inOrder(root);

		System.out.print("\nPreOrder::");
		preOrder(root);

		System.out.print("\nPostOrder:");
		postOrder(root);
	}
	

	private static void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	
	private static void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	private static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

}
