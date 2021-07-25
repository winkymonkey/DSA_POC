package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ********************************************************************************
 * Search an element in a SLL (Iterative and Recursive)
 * ********************************************************************************
 */

public class A03_searchAnElement {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		searchNodeByKey(list, 5);
		searchNodeByKeyRecursive(list.head, 4);
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
		while (null != n) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	
	private static void searchNodeByKey(MyLinkedList list, int key) {
		Node n = list.head;
		while (n != null && n.data!=key) {
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	private static void searchNodeByKeyRecursive(Node n, int key) {
		if (n==null)
			return;
		
		if (n.data == key)
			System.out.println(n.data);
		else
			searchNodeByKeyRecursive(n.next, key);
	}
	
}
