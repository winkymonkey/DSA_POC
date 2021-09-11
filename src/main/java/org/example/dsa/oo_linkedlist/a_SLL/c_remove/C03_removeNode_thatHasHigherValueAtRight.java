package org.example.dsa.oo_linkedlist.a_SLL.c_remove;

/**
 * ***************************************************************************************
 * Delete nodes having greater value on right in a SLL
 * ***************************************************************************************
 * Input:	12->15->10->11->5->6->2->3
 * Output:	    15----->11---->6---->3
 * 
 * ***************************************************************************************
 */

public class C03_removeNode_thatHasHigherValueAtRight {
	/*
	 * If we observe carefully, we can see that after removal the sequence is always a decreasing sequence.
	 * So if we can remove those elements which are preventing the original sequence to be decreasing then our job is done.
	 * So if we can traverse from right (somehow) and keep deleting the elements which is less than "current max" then our job is done.
	 * But in SLL, traversal from right is not straight forward.
	 * So we reverse the list and apply the logic.
	 * 
	 * 1. Reverse the list
	 * 2. Traverse the reversed list
	 * 	  Keep max till now
	 *    If the next node is less than max, then delete the next node, otherwise max = next node
	 * 3. Reverse the list again to retain the original order
	 * 
	 * 
	 * TIME --- O(n)
	 * 
	 */
}
