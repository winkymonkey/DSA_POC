package org.example.dsa.jj_binarytree.c_BFS_core;

import java.util.LinkedList;
import java.util.Queue;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print BFS traversal sequence
 * ***************************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *     8     9
 * 
 * BFS:   1 2 3 4 5 6 7 8 9
 * 
 * ***************************************************************************************
 */

public class C04B_BFS_usingExtraSpace {
	/*
	 * --------------------
	 * - add root in queue
	 * - as long as queue is not empty
	 *    - for (i=1 to queue size)
	 *       - poll queue & print
	 *       - add left child (if any)
	 *       - add right child (if any)
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		printBFS(root);
	}
	
	
	private static void printBFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int n = queue.size();
			
			for (int i=1; i<=n; i++) {				// Traverse all nodes of current level
				Node polled = queue.poll();
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
	
	
	// another way
//	private static void printBFS(Node root) {
//		Queue<Node> queue = new LinkedList<Node>();
//		queue.add(root);
//		
//		while (!queue.isEmpty()) {
//			Node polled = queue.poll();
//			System.out.print(polled.data + " ");
//			
//			if (polled.left != null)
//				queue.add(polled.left);
//			
//		 	if (polled.right != null)
//		 		queue.add(polled.right);
//		 	
//		 }
//	}
}
