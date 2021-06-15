package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ********************************************************************************
 * Do merge sort in a Linked List
 * ********************************************************************************
 */

public class A11_mergeSort {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
        print(list.head);
        
        list.head = mergeSort(list.head);
		print(list.head);
	}
	
	private static MyLinkedList createLinkedList() {
		MyLinkedList list = new MyLinkedList();
		list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(15);
		return list;
	}
	
	private static void print(Node n) {
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	
	private static Node mergeSort(Node n) {
		if (n == null || n.next == null)
			return n;
		
		Node middle = getMiddle(n);
		Node leftHead = n;
		Node rightHead = middle.next;
		middle.next = null;
		
		return merge(mergeSort(leftHead), mergeSort(rightHead));
	}
	
	
	private static Node merge(Node a, Node b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		Node head = null;
		if (a.data <= b.data) {
			head = a;
			head.next = merge(a.next, b);
		}
		else {
			head = b;
			head.next = merge(a, b.next);
		}
		return head;
	}
	
	
	private static Node getMiddle(Node n) {
		if (n == null)
			return n;

		Node p1 = n; 
		Node p2 = n;

		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		return p1;
	}
	
}
