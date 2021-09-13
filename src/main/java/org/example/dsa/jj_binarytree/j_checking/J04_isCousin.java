package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Check if two nodes are cousins in a Binary Tree
 * ***************************************************************************************
 * Cousin Nodes -- if two nodes are at same level and have different parents
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
 * isCousin(8,9) = TRUE
 * isCousin(6,7) = FALSE
 * isCousin(8,6) = FALSE
 * 
 * ***************************************************************************************
 */

public class J04_isCousin {
	/*
	 * ------------------
	 * isCousin = if both the nodes are at the same level && nodes are not sibling
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA3();
		
		boolean isSibling = isCousin(root, 10, 11);
		System.out.println(isSibling);
	}
	
	
	private static boolean isCousin(Node node, int a, int b) {
		return ((getLevel(node, a, 1) == getLevel(node, b, 1)) && (!isSibling(node, a, b)));
	}
	
	
	private static int getLevel(Node node, int num, int level) {
		if (node == null)
			return 0;
		
		if (node.data == num)
			return level;
		
		int levelViaLeft = getLevel(node.left, num, level+1);
		int levelViaRight = getLevel(node.right, num, level+1);
		
		if (levelViaLeft != 0)
			return levelViaLeft;
		else if (levelViaRight != 0)
			return levelViaRight;
		else return 0;
	}
	
	
	private static boolean isSibling(Node node, int a, int b) {
		if (node == null || node.left == null || node.right == null)
			return false;
		
		if ((node.left.data==a && node.right.data==b) || (node.left.data==b && node.right.data==a))
			return true;
		
		return (isSibling(node.left, a, b) || isSibling(node.right, a, b));			// if the siblings(a,b) exist in left subtree OR in right subtree	
	}
}
