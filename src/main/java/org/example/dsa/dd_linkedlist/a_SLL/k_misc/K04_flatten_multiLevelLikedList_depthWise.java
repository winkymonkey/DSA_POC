package org.example.dsa.dd_linkedlist.a_SLL.k_misc;

/**
 * *****************************************************************************
 * Flatten a multilevel Linked List (Depth wise)
 * *****************************************************************************
 * Input:   1 - 2 - 3 - 4
 *			    |
 *			    7 -  8 -  10 - 12
 *			    |    |    |
 *			    9    16   11
 *			    |    |
 *			    14   17 - 18 - 19 - 20
 *			    |                   |
 *			    15 - 23             21
 *	                 |
 *	                 24
 * 
 * Output: 1 - 2 - 7 - 9 - 14 - 15 - 23 - 24 - 8 - 16 - 17 - 18 - 19 - 20 - 21 - 10 - 11 - 12 - 3 - 4
 * 
 * NOTE: 9 appears before 8 (When we are at node 7, we process down pointer before right pointer)	
 * 
 * *****************************************************************************
 */

public class K04_flatten_multiLevelLikedList_depthWise {
	/*
	 * static Node last;
	 * 
	 * main() {
	 *    flattenList(list.head);
	 * }
	 * 
	 * Node flattenList(Node n) {
	 *    if (n == null)
	 *       return null;
	 *    
	 *    last = n;							//keep track of last visited node
	 *    
	 *    Node next = n.next;
	 *    
	 *    if (n.down != null)				//If down list exists, process it first, Add down list as next of current node
	 *       n.next = flattenList(n.down);
	 *    
	 *    if (next != null)					//If next exists, add it after the next of last added node
	 *       last.next = flattenList(next);
	 *    
	 *    return n;
	 * }
	 * 
	 */
}
