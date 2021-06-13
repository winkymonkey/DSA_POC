package org.example.dsa.dd_linkedlist.a_SLL.e_merge;

/**
 * *****************************************************************************
 * Merge two sorted linked lists such that merged list is in reverse order
 * *****************************************************************************
 * Input:  5->10->15->40		2->3->20
 * Output: 40->20->15->10->5->3->2
 * 
 * *****************************************************************************
 */

public class E02_mergeTwoSortedLists_descendingOrder {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * reverse listA
	 * reverse listB
	 * now merge these two
	 * 
	 * OR
	 * 
	 * merge both the list and then reverse the resultant list
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT SOLUTION---
	 * ------------------------
	 * Traverse both lists from beginning to end.
	 * Compare current nodes of both lists and insert smaller of two at the beginning of the result list.
	 * 
	 */
}
