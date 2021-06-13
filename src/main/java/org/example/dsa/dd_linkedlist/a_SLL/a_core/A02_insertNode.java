package org.example.dsa.dd_linkedlist.a_SLL.a_core;

import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList;
import org.example.dsa.dd_linkedlist.a_SLL.MyLinkedList.Node;


public class A02_insertNode {
	
	public static void main(String[] args) {
		MyLinkedList list = createLinkedList();
		print(list.head);
		
		insertAtFront(list, 25);
		print(list.head);
		
		insertAfterGivenNode(list.head.next.next, 50);
		print(list.head);
		
		insertAtEnd(list, 99);
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
	
	private static void insertAfterGivenNode(Node refNode, int newKey) {
		if (refNode==null)
			System.out.println("reference node cannot be null");
		else {
			Node tmpNode = refNode.next;
			
			Node newNode = new Node(newKey);
			refNode.next = newNode;
			newNode.next = tmpNode;
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
