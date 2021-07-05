package org.example.dsa.ff_binarytree.b_traversal_DFS_misc;

/**
 * *********************************************************************************************
 * Replace each node in binary tree with the sum of its InOrder predecessor and successor
 * *********************************************************************************************
 * Input:
 *        1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7			
 * 
 * Output:
 *       11
 *      /  \
 *     9    13
 *    / \   / \
 *   2   3 4   3
 * 
 * For 1: InOrder predecessor=5, successor=6, Sum=11
 * For 2: InOrder predecessor=4, successor=5, Sum=9
 * For 4: InOrder predecessor=0, successor=2, Sum=2
 * 
 * *********************************************************************************************
 */

public class B02_inorderPredecessorSuccessor_sum {
	/*
	 * ------------------
	 * Do the InOrder traversal and then
	 * 		A[0]	= 0							// because inorder predecessor of leftmost leaf is not present
	 * 		A[1...] = inorder sequence
	 * 		A[n]	= 0							// because inorder successor of rightmost leaf is not present
	 * 
	 * 
	 * Now traverse the array from index 1
	 * For each index i, the sum of inorder predecessor & inorder successor will be A[i-1] + A[i+1]
	 * ------------------
	 */
}
