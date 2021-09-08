package org.example.dsa.hh_binarytree.d_BFS_misc;

import java.util.LinkedList;
import java.util.Queue;

import org.example.dsa.hh_binarytree.Node;

/**
 * ***************************************************************************************
 * Right side view of Binary Tree
 * ***************************************************************************************
 * Input:
 *        10
 *      /    \
 *     2      3
 *    / \    / \
 *   7   8  12 15
 *  /
 * 14
 * 
 * Output: 10 3 15 14
 * 
 * ***************************************************************************************
 */

public class D04_rightSideView {
	/*
	 * ------------------
	 * If we observe carefully, we will see that our main task is to print the right most node of every level.
	 * So, we will do a level order traversal on the tree and print the right most node at every level.
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(15);
		root.left.left.left = new Node(14);
		
		printRightView(root);
	}
	
	
	private static void printRightView(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int n = queue.size();
			
			for (int i=1; i<=n; i++) {				// Traverse all nodes of current level
				Node polled = queue.poll();
				if (i == n)
					System.out.print(polled.data + " ");
				
				if (polled.left != null) {
					queue.add(polled.left);
				}
			 	if (polled.right != null) {
			 		queue.add(polled.right);
			 	}
			}
		}
	}
	
}
