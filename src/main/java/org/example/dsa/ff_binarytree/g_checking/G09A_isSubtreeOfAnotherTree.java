package org.example.dsa.ff_binarytree.g_checking;

/**
 * *****************************************************************************
 * Check if a Binary Tree is subtree of another Binary Tree
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

public class G09A_isSubtreeOfAnotherTree {
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
