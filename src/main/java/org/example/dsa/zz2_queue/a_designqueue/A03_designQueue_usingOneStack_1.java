package org.example.dsa.zz2_queue.a_designqueue;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Implement Queue using Stacks
 * ***************************************************************************************
 */
public class A03_designQueue_usingOneStack_1 {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		enqueue(stack, 10);
		enqueue(stack, 20);
		enqueue(stack, 30);
		System.out.println(stack);
		
		dequeue(stack);
		System.out.println(stack);
		
		enqueue(stack, 40);
		System.out.println(stack);
		enqueue(stack, 50);
		System.out.println(stack);
		
		dequeue(stack);
		System.out.println(stack);
	}
	
	
	private static void enqueue(Stack<Integer> stack, int elem) {
		stack.push(elem);
	}
	
	
	private static void dequeue(Stack<Integer> stack) {
		if(stack.size() == 1) {
			stack.pop();
			return;
		}
		int temp = stack.pop();
		dequeue(stack);
		stack.push(temp);
	}
	
}
