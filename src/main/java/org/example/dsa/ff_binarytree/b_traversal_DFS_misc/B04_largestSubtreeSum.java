package org.example.dsa.ff_binarytree.b_traversal_DFS_misc;

import org.example.dsa.ff_binarytree.Node;

/**
 * *****************************************************************************
 * Find largest subtree sum in a tree
 * *****************************************************************************
 * Given a binary tree, task is to find subtree with maximum sum in tree.
 * *****************************************************************************
 * Input :       
 *      1
 *    /   \
 *   2      3
 *  / \    / \
 * 4   5  6   7
 * 
 * Output: 28		//As all the tree elements are positive, the "largest subtree sum" is the sum of all elements.
 * 
 * 
 * Input :       
 *      1
 *    /   \
 *  -2     3
 *  / \   /  \
 * 4   5 -6   2
 * 
 * Output : 7		//(subtree consisting of -2,4,5 is sum of 7) OR (entire tree has sum of 7) 
 * 
 * *****************************************************************************
 */

public class B04_largestSubtreeSum {
	/*
	 * Traverse the tree (in/pre/post)
	 * In each recursive call, calculate the sum of (value of current root), (value of left subtree), (value of right subtree)
	 * 	and keep maintaining the max till now
	 * 
	 */
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(-2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(-6);
		root.right.right = new Node(2);
		
		findSum(root);
		System.out.println(maxTillNow);
	}
	
	private static int maxTillNow = 0;
	
	private static int findSum(Node root) {
		if (root == null)
			return 0;
		
		int sum = root.data +  findSum(root.left) + findSum(root.right);
		if (sum > maxTillNow) {
			maxTillNow = sum;
		}
		return sum;
	}
	
}
