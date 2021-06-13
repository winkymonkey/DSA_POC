package org.example.dsa.dd_linkedlist.a_SLL.c_remove;

/**
 * *****************************************************************************
 * Given a linked list of line segments, remove middle points
 * *****************************************************************************
 * Given a linked list of coordinates where adjacent points either form a vertical line or a horizontal line. 
 * Delete points from the linked list which are in the middle of a horizontal or vertical line.
 * 
 * *****************************************************************************
 * Input:  (0,10)->(1,10)->(5,10)->(7,10)
 * 								     |
 * 								   (7,5)->(20,5)->(40,5)
 * 
 * Output: Linked List should be changed to following
 *         (0,10)->(7,10)
 * 				     |
 * 				   (7,5)->(40,5)
 * 
 * The given linked list represents a horizontal line from (0,10) to (7, 10)
 * followed by a vertical line from (7, 10) to (7, 5)
 * followed by a horizontal line from (7, 5) to (40, 5)
 * 
 * 
 * Input:  (2,3)->(4,3)->(6,3)->(10,3)->(12,3)
 * 
 * Output: Linked List should be changed to following
 *         (2,3)->(12,3)
 * 
 * *****************************************************************************
 */

public class C03_removeMiddleFrom_linkedListOfLineSegments {
	/*
	 * class MyLinkedList {
	 *    Node head;
	 *    static class Node {
	 * 	     int data1;
	 * 	     int data2;
	 * 	     Node next;
	 *       
	 *       Node(int data1, int data2) {
	 *          this.data1 = data1;
	 *          this.data2 = data2;
	 *       }
	 *    }
	 * }
	 * 
	 * 
	 * while (n!=null) {
	 * 	  if (n.data2 == n.next.data2)
	 * 	     n.next = n.next.next			//next node is deleted
	 * 	  else
	 * 	     nothing to do
	 * }
	 * 
	 */
}
