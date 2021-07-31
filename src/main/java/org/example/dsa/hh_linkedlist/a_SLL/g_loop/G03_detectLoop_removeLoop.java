package org.example.dsa.hh_linkedlist.a_SLL.g_loop;

/**
 * ***************************************************************************************
 * Detect and Remove Loop in a SLL
 * ***************************************************************************************
 */

public class G03_detectLoop_removeLoop {
	/*
	 * In the Node definition, add a new boolean variable 'isVisited'.
	 * 
	 * Now traverse the list.
	 * if current node's isVisited flag is marked, it means that this node visited earlier. Hence stop.
	 * and update node's pointer to null which will break the loop.
	 * otherwise mark current node as visited.
	 * 
	 * 
	 * 
	 * -------------------
	 * void detectLoop() {
	 *    Node n = list.head;
	 *    n.isVisited = true;
	 *    
	 *    while (n!=null && n.next!=null) {
	 *       if (n.next.isVisited) {				// it's a loop
	 *          n.next = null
	 *          break;								// n.next is the starting point of the loop
	 *       }
	 *       else {
	 *          n.isVisited = true;
	 *       }
	 *       n = n.next;
	 *    }
	 * }
	 * 
	 */
}
