package org.example.dsa.nn_linkedlist.a_SLL.e_merge;

import org.example.dsa.nn_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.nn_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ***************************************************************************************
 * Merge 2 sorted SLL (ascending order)
 * ***************************************************************************************
 * Input:  5->10->15		2->3->20
 * Output: 2->3->5->10->15->20
 * 
 * ***************************************************************************************
 */

public class E01_mergeTwoSortedLists_ascendingOrder {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse both the lists simultaneously
	 * Compare heads of both the lists
	 * Insert smaller of these two at the beginning of the result list
	 * Increment pointer of the list from where the element is chosen
	 * Once a list exhausts, copy the remaining nodes of other list one by one
	 * 
	 * TIME --- O(n+m)
	 * SPACE -- O(n+m)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT SOLUTION--- (in place solution)
	 * ------------------------
	 * Traverse both the lists simultaneously
	 * Compare heads of both the lists
	 * The current element will point to the smaller between the above two nodes
	 * The rest elements of both lists will appear after that.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		MyLinkedList list1 = createLinkedList1();
		MyLinkedList list2 = createLinkedList2();
		Node mergedhead = merge(list1.head, list2.head);
		print(mergedhead);
	}
	
	private static MyLinkedList createLinkedList1() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(15);
		return list;
	}
	
	private static MyLinkedList createLinkedList2() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(20);
		return list;
	}
	
	private static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	private static Node merge(Node head1, Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		
		if (head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		}
		else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
	}
	
}
