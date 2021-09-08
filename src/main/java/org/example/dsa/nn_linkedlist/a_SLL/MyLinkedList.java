package org.example.dsa.nn_linkedlist.a_SLL;


public class MyLinkedList {
	public Node head; 			// head of list

	public static class Node { 	// This inner class is made static so that main() can access it
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(data);
		}
	}
	
}
