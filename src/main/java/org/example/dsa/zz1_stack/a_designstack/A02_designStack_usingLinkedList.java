package org.example.dsa.zz1_stack.a_designstack;

import org.example.dsa.zz1_stack.a_designstack.MyStack2.MyLinkedList.Node;


public class A02_designStack_usingLinkedList {
	
	public static void main(String[] args) throws Exception {
		MyStack2 stack = new MyStack2();
		System.out.println("initially:: " + stack);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
		
		stack.push(90);
		System.out.println("after a few push:: " + stack);
		
		stack.pop();
		System.out.println("after one pop:: " + stack);
	}
	
}




class MyStack2 {
	
	private MyLinkedList list;
	
	public MyStack2() {
		list = new MyLinkedList();
	}
	
	
	
	public boolean isEmpty() {
		return (list.head == null);
	}
	
	public int peek() {
		return list.head.data;
	}
	
	public void push(final int elem) {
		Node newNode = new Node(elem);
		if (list.head == null)
			list.head = newNode;
		else {
			newNode.next = list.head;
			list.head = newNode;
		}
	}
	
	public int pop() throws Exception {
		Node tempNode = list.head;
		if (tempNode == null)
			throw new Exception("stack underflow");
		else {
			list.head = list.head.next;
			tempNode.next = null;
			return tempNode.data;
		}
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sbu = new StringBuilder();
		Node temp = list.head;
		while (temp != null) {
			sbu.append(temp.data + " -> ");
			temp = temp.next;
		}
		sbu.append("NULL");
		return sbu.toString();
	}
	
	
	//LinkedList inner class
	static class MyLinkedList {
		Node head;
		
		static class Node {
			int data;
			Node next;
	          
			Node(int data) {
				this.data = data;
				this.next = null;
			}
	    }
	}
	
}