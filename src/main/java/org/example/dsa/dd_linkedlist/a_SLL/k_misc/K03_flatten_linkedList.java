package org.example.dsa.dd_linkedlist.a_SLL.k_misc;

/**
 * *****************************************************************************
 * Flatten a Linked List
 * *****************************************************************************
 * Given a linked list where every node represents a linked list and contains two pointers of its type:
 * (1) pointer to next node in the main list (we call it 'right' pointer)
 * (2) pointer to a linked list where this node is head (we call it 'down' pointer)
 * 
 * Write a function flatten() to flatten the lists into a single linked list.
 * The flattened linked list should also be sorted.
 * 
 * *****************************************************************************
 * Input:  	5 -> 10 -> 19 -> 28
 * 			|    |     |     |
 * 			7    20    22    35
 * 			|          |     |
 * 			8          50    40
 * 			|                |
 * 			30               45
 * 
 * Output: 5->7->8->10->19->20->22->28->30->35->40->45->50
 * 
 * *****************************************************************************
 */

public class K03_flatten_linkedList {
	/*
	 * Flatten the list in O(n) time
	 * After flattening it should look like below:
	 * 
	 *    5->7->8->30->10->20->19->22->50->28->35->40->45
	 * 
	 * 
	 * Now sort this flattened list
	 * After sort it should look like below:
	 * 
	 *    5->7->8->10->19->20->22->28->30->35->40->45->50
	 * 
	 */
}
