package org.example.dsa.oo_linkedlist.c_CLL;


public class MyCircularLinkedList {
	public Node head; 			// head of list

	public static class Node { 	// This inner class is made static so that main() can access it
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
}
