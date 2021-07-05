package org.example.dsa.ff_binarytree.j_constructTreeFromRepresentation;

/**
 * *****************************************************************************
 * Construct a complete binary tree from its LinkedList representation
 * *****************************************************************************
 * A complete binary tree can be represented in an array in the following approach.
 * If root node is stored at index i, its left, and right children are stored at indices 2i+1, 2i+2 respectively.
 * 
 * *****************************************************************************
 * Linked List Representation 
 * 		10->12->15->25->30->36
 * 
 * Tree Representation
 * 			10
 *         /   \
 *       12     15
 *      /  \   /  \
 *     25  30 36
 * 
 * *****************************************************************************
 */

public class J01_buildCompleteBinaryTree_from_linkedlistRepresentation {
	/*
	 * ------------------
	 * Create a queue.
	 * Pick the 1st node of the list, and set it as root, and enqueue it to the queue.
	 * Traverse the list
	 * 		- Dequeue one node from the queue which is the current root.
	 * 		- Traverse two nodes in the list, add them as children of the current parent.
	 * 		- Enqueue the two nodes into the queue.
	 * 		- repeat
	 * ------------------
	 */
}
