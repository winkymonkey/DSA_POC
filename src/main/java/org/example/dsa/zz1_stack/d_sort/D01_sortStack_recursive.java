package org.example.dsa.zz1_stack.d_sort;

import java.util.Stack;

/**
 * *****************************************************************************
 * Sort a stack using recursion
 * *****************************************************************************
 * It's a modified version of "reverse a stack"
 * *****************************************************************************
 */

public class D01_sortStack_recursive {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(0);
		stack.push(1);
		stack.push(8);
		System.out.println(stack);
		
		sort(stack);
		System.out.println(stack);
	}
	
	
	private static void sort(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		
		else {
			int elem = stack.pop();
			sort(stack);			
			sortedInsert(stack, elem);		//Here we can't simply call "stack.push(elem)", as the element which was popped at last, will be pushed at first
		}
	}
	
	
	private static void sortedInsert(Stack<Integer> stack, int elem) {
		if (stack.isEmpty() || elem > stack.peek())
			stack.push(elem);
		
		else {
			int temp = stack.pop();
			sortedInsert(stack, elem);
			stack.push(temp);
		}
	}
	
}
