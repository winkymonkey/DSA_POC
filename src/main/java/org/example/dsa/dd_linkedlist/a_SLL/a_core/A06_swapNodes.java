package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * ***************************************************************************************
 * Swap nodes in a SLL (without swapping data)
 * ***************************************************************************************
 */

public class A06_swapNodes {
	/*
	 * Suppose we need to swap C and H
	 * 
	 * A -> B -> C -> D -> E -> F -> G -> H -> I -> J 
	 *      ^    ^                   ^    ^
	 *      |    |                   |    |
	 *    prev1  n1                prev2  n2
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		swapNodes(list, 4, 7);
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
		while (null != n) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	
	
	
	
	private  static void swapNodes(MyLinkedList list, int key1, int key2) {
		Node head = list.head;
		Node prev1 = null;
		Node prev2 = null;
		Node n1 = head;
		Node n2 = head;

		if (head == null) {
			return;
		}
		if (key1 == key2) {
			return;
		}

		while (n1 != null && n1.data != key1) {
			prev1 = n1;
			n1 = n1.next;
		}
		while (n2 != null && n2.data != key2) {
			prev2 = n2;
			n2 = n2.next;
		}

		if (n1 != null && n2 != null) {
			if (prev1 != null)
				prev1.next = n2;
			else
				head = n2;

			if (prev2 != null)
				prev2.next = n1;
			else
				head = n1;

			Node temp = n1.next;		// swap n1.next and n2.next
			n1.next = n2.next;
			n2.next = temp;
		}
		else {
			System.out.println("Swapping is not possible");
		}
	}
	
}
