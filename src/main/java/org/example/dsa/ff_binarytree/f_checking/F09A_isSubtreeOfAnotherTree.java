package org.example.dsa.ff_binarytree.f_checking;

/**
 * *****************************************************************************
 * Check if a binary tree is subtree of another binary tree
 * *****************************************************************************
 * Tree1:
 *     26
 *    /  \
 *   10   3
 *  /  \   \
 * 4    6   3
 *  \
 *  30
 * 
 * 
 * Tree2:
 *   10
 *  /  \
 * 4    6
 *  \
 *  30
 * 
 * *****************************************************************************
 */

public class F09A_isSubtreeOfAnotherTree {
	/*
	 * ------------------
	 * Tree1: 
	 * 		InOrder:  IN1[]  = 4 30 10 6 26 3 3
	 * 		PreOrder: PRE1[] = 26 10 4 30 6 3 3
	 * 
	 * Tree2:
	 * 		InOrder:  IN2[]  = 4 30 10 6
	 * 		PreOrder: PRE2[] = 10 4 30 6
	 * 
	 * If IN2[] is subarray of IN1[] and PRE2[] is subarray of PRE1[]
	 * then Tree2 is a subtree of Tree1
	 * ------------------
	 */
}
