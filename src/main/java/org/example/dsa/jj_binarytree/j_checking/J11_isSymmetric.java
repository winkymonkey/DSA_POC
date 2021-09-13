package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;

/**
 * ***************************************************************************************
 * Symmetric Tree (Mirror Image of itself)
 * Given a Binary Tree, check whether it is a mirror of itself.
 * ***************************************************************************************
 * 
 *      1
 *    /   \
 *   2     2
 *  / \   / \
 * 3   4 4   3		YES
 * 
 * 
 *     1
 *    / \
 *   2   2
 *    \   \
 *     3   3		NO
 * 
 * ***************************************************************************************
 */

public class J11_isSymmetric {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		
		root.right.left = new Node(4);
		root.right.right = new Node(3);
		
		boolean isSymmetric = isMirror(root, root);
		System.out.println(isSymmetric);
	}
	
	
	private static boolean isMirror(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		
		if (node1!=null && node2!=null 
				&& node1.data == node2.data 
				&& isMirror(node1.left, node2.right) 
				&& isMirror(node1.right, node2.left))
			return true;
		
		else
			return false;
	
	}
	
}
