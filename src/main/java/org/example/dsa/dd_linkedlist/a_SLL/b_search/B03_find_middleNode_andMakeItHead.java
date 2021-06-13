package org.example.dsa.dd_linkedlist.a_SLL.b_search;

/**
 * *****************************************************************************
 * Make middle node head in a linked list
 * *****************************************************************************
 * Input:  1 2 3 4 5
 * Output: 3 1 2 4 5
 * 
 * Input:  1 2 3 4 5 6
 * Output: 4 1 2 3 5 6
 * 
 * *****************************************************************************
 */

public class B03_find_middleNode_andMakeItHead {
	/*
	 * p0, p1, p2 all points to head
	 * 
	 * while (p2!=null && p2.next!=null) {
	 * 	  p0 = p1;
	 * 	  p1 = p1.next;
	 * 	  p2 = p2.next.next;
	 * }
	 * 
	 * p2 points to last node
	 * p1 points to middle node
	 * p0 points to previous of middle node
	 * 
	 * p0.next = p1.next;	//previous and next node is now connected
	 * p1.next = head;		//current node (central node) connects to head
	 * head = p1;			//head points to central node
	 * 
	 */
}
