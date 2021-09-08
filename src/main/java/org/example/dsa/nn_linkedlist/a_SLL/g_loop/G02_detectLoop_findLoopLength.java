package org.example.dsa.nn_linkedlist.a_SLL.g_loop;

/**
 * ***************************************************************************************
 * Find length of loop in a SLL
 * ***************************************************************************************
 */

public class G02_detectLoop_findLoopLength {
	/*
	 * In the Node definition, add a new boolean variable 'isVisited = false'
	 * In the Node definition, add a new int variable 'count = 0'
	 * 
	 * Now traverse the list
	 * for each node increment count value (for 1st node count=1, for 2nd node count=2 etc)
	 * if current node's isVisited flag is marked, it means that this node visited earlier. Hence stop.
	 * so loop length = present value of count - existing value of count in node
	 * otherwise mark current node as visited.
	 * 
	 * 
	 * 
	 * -------------------
	 * void detectLoopAndFindLoopLength() {
	 *    count = 0;
	 *    Node n = list.head;
	 *    n.isVisited = true;
	 *    
	 *    while (n!=null && n.next!=null) {
	 *       count++;
	 *       if (n.next.isVisited) {					// it is a loop
	 *          loopLength = count - n.next.data;
	 *          break;									// n.next is the starting point of the loop
	 *       }
	 *       else {
	 *          n.isVisited = true;
	 *          n.count = count;
	 *       }
	 *       n = n.next;
	 *    }
	 * }
	 * 
	 */
}
