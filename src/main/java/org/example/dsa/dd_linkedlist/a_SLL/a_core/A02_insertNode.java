package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;

/**
 * *****************************************************************************
 * Insert node in a SLL
 * *****************************************************************************
 * 		insert at front
 * 		insert after a given node
 * 		insert at the end
 * 		insert before a given node
 * *****************************************************************************
 */

public class A02_insertNode {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		insertAtFront(list, 25);				// insert 25 at the beginning
		print(list.head);
		
		insertAfterGivenNode(list, 5, 50);		// insert 50 after the node 5
		print(list.head);
		
		insertAtEnd(list, 99);					// insert 99 at the end
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
	
	
	
	
	
	private static void insertAtFront(MyLinkedList list, int newKey) {
		Node newHead = new Node(newKey);
		newHead.next = list.head;
		list.head = newHead;
	}
	
	private static void insertAfterGivenNode(MyLinkedList list, int refKey, int newKey) {
		Node n = list.head;
		while (n.next!=null) {
			if (n.data == refKey) {
				Node newNode = new Node(newKey);
				newNode.next = n.next;
				n.next = newNode;
				break;
			}
			n = n.next;
		}		
	}
	
	private static void insertAtEnd(MyLinkedList list, int newKey) {
		Node n = list.head;
		while (n.next!=null) {
			n = n.next;
		}
		Node newNode = new Node(newKey);
		n.next = newNode;
	}
	
}
