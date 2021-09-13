package org.example.dsa.jj_binarytree.j_checking;

import org.example.dsa.jj_binarytree.Node;

/**
 * ***************************************************************************************
 * Check if the given Binary Tree is Heap or not
 * ***************************************************************************************
 * Binary tree need to fulfill the following two conditions for being a heap:
 * 	- It should be a complete tree (i.e. all levels except last should be full).
 *  - Every node’s value >= its child node (considering max-heap).
 * ***************************************************************************************
 * Input:
 *         97
 *       /    \
 *     46      37
 *    /  \    /  \
 *   12   3  7   31
 *  /  \
 * 6    9
 * 
 * Output: TRUE
 * --------------
 * Input:
 *       97
 *     /    \
 *   46      37
 *  /  \    /  \
 * 12   3  7   31
 *     / \
 *    2   4
 * 
 * Output: FALSE
 * ***************************************************************************************
 */

public class J13_isHeap {
	/*
	 * isHeap() = isComplete() + each node value should be greater than all of its child
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(9);
		root.right = new Node(8);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		root.left.left.left = new Node(3);
		root.left.left.right = new Node(2);
		root.left.right.left = new Node(1);
		
		int totalNodes = countNodes(root);
		boolean isComplete = isComplete(root, 0, totalNodes) && hasHeapProperty(root);
		System.out.println(isComplete);
	}
	
	
	
	
	
	private static int countNodes(Node node) {
		if (node == null)
			return 0;
		
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
	
	
	private static boolean isComplete(Node node, int i, int totalNodes) {
		if (node == null)
			return true;
		
		if (i > totalNodes)
			return false;
		
		return isComplete(node.left, (2*i)+1, totalNodes) && isComplete(node.right, (2*i)+2, totalNodes);
	}
	
	
	
	
	
	private static boolean hasHeapProperty(Node node) {
		if (node == null)
			return true;
		
		if (node.left == null && node.right == null)
			return true;

		if (node.right == null)
			return node.data >= node.left.data;
		
		if (node.data >= node.left.data && node.data >= node.right.data)
			return hasHeapProperty(node.left) && hasHeapProperty(node.right);
		
		return false;
	}

}
