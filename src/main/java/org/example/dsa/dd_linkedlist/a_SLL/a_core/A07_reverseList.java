package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ********************************************************************************
 * Reverse a Linked List
 * ********************************************************************************
 */

public class A07_reverseList {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		reverse(list);
		print(list.head);
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
	
	
	
	
	
	
	
	private static void reverse(MyLinkedList list) {
		Node PREV = null;
		Node CURR = list.head;
		Node NEXT = null;

		while (CURR != null) {
			NEXT = CURR.next;
			CURR.next = PREV;
			PREV = CURR;
			CURR = NEXT;
		}
		list.head = PREV; 			// prev is the new head
	}
	
}
