package org.example.dsa.ff_binarytree.f_misc;

import org.example.dsa.ff_binarytree.Node;

/**
 * ***************************************************************************************
 * Subtree with given sum in a Binary Tree
 * ***************************************************************************************
 * You are given a Binary Tree and a given sum.
 * The task is to check if there exist a subtree whose sum of all nodes is equal to the given sum.
 * ***************************************************************************************
 *      1
 *    /   \
 *   3     6
 *  / \   /
 * 5   9 8
 * 
 * if given sum=17 	--> YES		// subtree as 3,5,9
 * if given sum=11  --> NO
 * 
 * ***************************************************************************************
 */

public class F02_subtreeWithGivenSum {
	/*
	 * ------------------
	 * Traverse the tree (in/pre/post) 
	 * In each recursive call, calculate the sum of (value of current root), (value of left subtree), (value of right subtree)
	 * 	and keep checking whether it matches with the given sum or not
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		root.right.left = new Node(8);
		
		int sumToFind = 17;
		findSum(root, sumToFind);
		System.out.println(isFound);
	}
	
	
	private static boolean isFound = false;
	
	
	private static int findSum(Node root, int sumToFind) {
		if (root == null)
			return 0;
		
		int sum = root.data + findSum(root.left, sumToFind) + findSum(root.right, sumToFind);
		if (sum == sumToFind) {
			isFound = true;
		}
		return sum;
	}
	
}
