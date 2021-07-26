package org.example.dsa.dd_linkedlist.a_SLL.b_search;

/**
 * ***************************************************************************************
 * Make middle node head in a SLL
 * ***************************************************************************************
 * Input:  1 2 3 4 5
 * Output: 3 1 2 4 5
 * 
 * Input:  1 2 3 4 5 6
 * Output: 4 1 2 3 5 6
 * 
 * ***************************************************************************************
 */

public class B03_find_middleNode_andMakeItHead {
	/*
	 * p0, p1, p2 all points to head
	 * 
	 * while (p2!=null && p2.next!=null) {
	 * 	  p0 = p1;								// post traversal, p0 will point to previous of middle node
	 * 	  p1 = p1.next;							// post traversal, p1 will point to middle node
	 * 	  p2 = p2.next.next;					// post traversal, p2 will point to last node
	 * }
	 * 
	 * p0.next = p1.next;	// previous and next node is now connected
	 * p1.next = head;		// current node (central node) connects to head
	 * head = p1;			// head points to central node
	 * 
	 */
}
