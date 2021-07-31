package org.example.dsa.hh_linkedlist.a_SLL.a_core;

import org.example.dsa.hh_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.hh_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ***************************************************************************************
 * Reversely Print a SLL (without actually reversing the list)
 * ***************************************************************************************
 */

public class A09_reverselyPrint {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		reverselyPrint(list, list.head);
		System.out.println();
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
	
	
	
	
	
	private static void reverselyPrint(MyLinkedList list, Node node) {
		if (node == null)
			return;
		
		reverselyPrint(list, node.next);
		System.out.print(node.data + " ");
	}
	
}
