package org.example.dsa.zz2_queue.a_designqueue;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Implement Queue using Stacks
 * ***************************************************************************************
 */
public class A02_designQueue_usingTwoStack {
	
	private static final Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		enqueue(stack, 10);
		enqueue(stack, 20);
		enqueue(stack, 30);
		System.out.println(stack);
		
		System.out.println(dequeue(stack));
		System.out.println(stack);
		
		enqueue(stack, 40);
		System.out.println(stack);
		enqueue(stack, 50);
		System.out.println(stack);
		
		System.out.println(dequeue(stack));
		System.out.println(stack);
	}
	
	private static void enqueue(Stack<Integer> stack, int elem) {
		stack.push(elem);
	}
	
	private static int dequeue(Stack<Integer> stack) {
		while (stack.size() != 1) {
			stack2.push(stack.pop());
		}
		int badElement = stack.pop();
		while (!stack2.isEmpty()) {
			stack.push(stack2.pop());
		}
		return badElement;
	}
	
}
