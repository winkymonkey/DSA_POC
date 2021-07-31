package org.example.dsa.jj_binarytree.e_otherTraversal;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Boundary Traversal of Binary Tree
 * ***************************************************************************************
 * Input:
 * 		  1
 *      /   \
 *     2     3
 *   /   \    \
 *  4     5    6
 *   \   / \   /
 *    7 8   9 10
 * 
 * Output:
 * 1 2 4 7 8 9 10 6 3
 * 
 * ***************************************************************************************
 */

public class E03_boundaryTraversal {
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA5();
		
		if (root != null) {
			System.out.print(root.data + " ");
			
			printBoundaryLeft(root.left);			// we could have called these methods with 'root' but in that case it would print the root twice (once for left edge traversal & one for right edge traversal) 
			printLeaves(root.left);
			printLeaves(root.right);
			printBoundaryRight(root.right);
		}
	}
	
	
	//to ensure top down order, first print the node, then recursively call itself for subtree
	private static void printBoundaryLeft(Node node) {
		if (node == null)
			return;

		if (node.left != null) {					// nodes in left edge that has left child
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		}
		else if (node.right != null) {				// nodes in left edge that has only right child
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
		else {										// Leaf node (do nothing to avoid duplicates in output)
			
		}
	}
	
	
	private static void printLeaves(Node node) {
		if (node == null)
			return;
		
		if (node.left == null && node.right == null) 	// Leaf node
			System.out.print(node.data + " ");
		
		printLeaves(node.left);
		printLeaves(node.right);
	}
	
	
	//to ensure bottom up order, first recursively call itself for subtree, then print the node
	private static void printBoundaryRight(Node node) {
		if (node == null)
			return;
		
		if (node.right != null) {					// nodes in right edge that has right child
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		}
		else if (node.left != null) {				// nodes in right edge that has only left child
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
		else {
													// Leaf node (do nothing to avoid duplicates in output)
		}
	}
	
}
