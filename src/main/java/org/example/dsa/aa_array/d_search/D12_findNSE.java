package org.example.dsa.aa_array.d_search;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Find Next Smaller Element (NSE) of each element in array
 * Elements for which no greater element exist, consider the next greater element as -1.
 * ***************************************************************************************
 * Input:	{4, 5, 2, 25}
 * Output:	{5, 25, 25, -1}
 * 
 * Input:	{13, 7, 6, 12}
 * Output:	{-1, 12, 12, -1}
 * 
 * Input:	{5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4}
 * Output:	{-1, 12, 12, -1}
 * 
 * ***************************************************************************************
 */

public class D12_findNSE {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array
	 * for each element, traverse the entire array to find out the NSE and store it in another array
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * TIP:
	 * NEVER STORE A SMALL ELEMENT OVER A HEAVY ELEMENT
	 * 
	 * Push the first element to stack
	 * For each elements in the array:
	 * 		- If CURRENT <= stack-top:
	 * 			- keep popping from stack until the CURRENT is less than or equal to the stack-top (or stack is empty)
	 * 			- each popped element, the next greater element is CURRENT
	 * 		- If CURRENT > stack-top:
	 * 			- push CURRENT in stack
	 * 
	 * Once the array is empty, if there are elements left in the stack, then for all of those elements the next greater element is -1
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {11, 13, 21, 3};
		findNextSmallerElement(A);
	}
	
	
	private static void findNextSmallerElement(int A[]) {
		Stack<Integer> stack = new Stack<>();
		int i=0;
		stack.push(A[i]);
		
		for (i=1; i<A.length; i++) {
			if (stack.isEmpty() || stack.peek() < A[i]) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && stack.peek() > A[i]) {
					System.out.println("NSE of "+stack.peek()+" is "+A[i]);
					stack.pop();
				}
				stack.push(A[i]);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.println("NSE of "+stack.peek()+" is -1");
			stack.pop();
		}
	}
	
}
