package org.example.dsa.zz1_stack.c_reverse;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Reverse a stack using recursion
 * ***************************************************************************************
 */

public class C02_reverseStack_recursive {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(0);
		stack.push(1);
		stack.push(8);
		System.out.println(stack);
		
		reverse(stack);
		System.out.println(stack);
	}
	
	
	private static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		
		else {
			int elem = stack.pop();
			reverse(stack);
			insertAtBottom(stack, elem);	//Here we can't simply call "stack.push(elem)", as the element which was popped at last, will be pushed at first
		}
	}
	
	
	private static void insertAtBottom(Stack<Integer> stack, int elem) {
		if (stack.isEmpty())
			stack.push(elem);
		
		else {
			int temp = stack.pop();
			insertAtBottom(stack, elem);
			stack.push(temp);
		}
	}
	
}
