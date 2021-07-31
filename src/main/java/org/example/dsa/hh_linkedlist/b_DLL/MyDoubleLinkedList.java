package org.example.dsa.hh_linkedlist.b_DLL;


public class MyDoubleLinkedList {
	public Node head; 			// head of list

	public static class Node { 	// This inner class is made static so that main() can access it
		public Node prev;
		public int data;
		public Node next;

		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}
	
}
