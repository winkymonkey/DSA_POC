package org.example.dsa.zz2_queue.a_designqueue;

import java.util.Stack;

/**
 * *****************************************************************************
 * Implement Queue using Stacks
 * *****************************************************************************
 */
public class A04_designQueue_usingOneStack_2 {
	
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
		int badElement;
		if(stack.size() == 1) {
			return stack.pop();
		}
		else {
			int temp = stack.pop();
			badElement = dequeue(stack);
			stack.push(temp);
			return badElement;
		}
	}
	
}
