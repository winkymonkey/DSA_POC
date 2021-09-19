package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Check if two nodes are siblings in a Binary Tree
 * ***************************************************************************************
 * Sibling Nodes -- if two nodes are at same level and have different parents
 * ***************************************************************************************
 * 
 * 		     1
 *        /      \
 *      2          3
 *    /   \       /  \
 *   4     5     6    7
 *    \   / \   / \   /
 *     8 9  10 11 12 13
 * 
 * isSibling(4,6) = FALSE
 * isSibling(6,7) = TRUE
 * 
 * ***************************************************************************************
 */

public class J03_areSibling {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		
		boolean isSibling = isSibling(root, 10, 11);
		System.out.println(isSibling);
	}
	
	
	private static boolean isSibling(Node node, int a, int b) {
		if (node == null || node.left == null || node.right == null)
			return false;
		
		if ((node.left.data==a && node.right.data==b) || (node.left.data==b && node.right.data==a))
			return true;
		
		return (isSibling(node.left, a, b) || isSibling(node.right, a, b));			// if the siblings(a,b) exist in left subtree OR in right subtree	
	}
	
}
