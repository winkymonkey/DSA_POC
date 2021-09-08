package org.example.dsa.hh_binarytree.e_otherTraversal;

/**
 * ***************************************************************************************
 * Diagonal Traversal of Binary Tree
 * ***************************************************************************************
 * Input:
 *      8
 *    /   \
 *   3    10
 *  /    /  \
 * 1    6    14
 *     / \   /
 *    4   7 13
 * 
 * Output:
 * 		8 10 14
 * 		3 6 7 13
 * 		1 4
 * 
 * ***************************************************************************************
 */

public class E01_diagonalTraversal {
	/*
	 * Starting from root, for every node 
	 *  - print root's right child
	 *  - push root's left child in the queue
	 *  - navigate to root's right child 
	 * 
	 * 
	 * 
	 * ---------------------
	 * Queue.add(root)
	 * 
	 * while (Queue is not empty) {
	 *    Node polled = Queue.poll()
	 *    
	 *    while (polled != null) {
	 *       print polled.data
	 *       if (polled.left != NULL)
	 *          queue.add(polled.left);
	 *       
	 *       polled = polled.right;
	 *    }
	 * }
	 * 
	 */
}
