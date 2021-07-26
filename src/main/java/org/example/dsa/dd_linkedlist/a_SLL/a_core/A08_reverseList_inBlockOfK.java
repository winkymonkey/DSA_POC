package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ***************************************************************************************
 * Reverse a SLL in block of K
 * ***************************************************************************************
 * Input:  1->2->3->4->5->6->7->8->NULL		k = 3 (every group of 3 elements will be reversed)
 * Output: 3->2->1->6->5->4->8->7->NULL
 * 
 * ***************************************************************************************
 */

public class A08_reverseList_inBlockOfK {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		Node currentHead = reverse(list.head, 3);
		print(currentHead);
	}
	
	private static MyLinkedList createLinkedList() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
		return list;
	}
	
	private static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	private static Node reverse(Node head, int k) {
		if (head == null)
			return null;
		
		Node PREV = null;
		Node CURR = head;
		Node NEXT = null;
		
		int count = 0;
		while (count < k && CURR != null) {
			NEXT = CURR.next;
			CURR.next = PREV;
			PREV = CURR;
			CURR = NEXT;
			count++;
		}
		
		if (NEXT != null)						// at the end both CURR & NEXT will be null, so we can check either of these to be non-null
			head.next = reverse(NEXT, k);
		
		return PREV;
	}
	
}
