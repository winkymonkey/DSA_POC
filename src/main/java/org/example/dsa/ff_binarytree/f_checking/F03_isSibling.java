package org.example.dsa.ff_binarytree.f_checking;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ******************************************************************************************
 * Check if two nodes in a Binary Tree are siblings
 * ******************************************************************************************
 * Sibling Nodes -- if two nodes are at same level and have different parents
 * ******************************************************************************************
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
 * ******************************************************************************************
 */

public class F03_isSibling {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		
		boolean isSibling = checkSibling(root, 10, 11);
		System.out.println(isSibling);
	}
	
	
	private static boolean checkSibling(Node node, int a, int b) {
		if (node == null || node.left == null || node.right == null)
			return false;
		
		if ((node.left.data==a && node.right.data==b) || (node.left.data==b && node.right.data==a))
			return true;
		
		return (checkSibling(node.left, a, b) || checkSibling(node.right, a, b));		
	}
	
}
