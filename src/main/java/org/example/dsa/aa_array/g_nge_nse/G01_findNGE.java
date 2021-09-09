package org.example.dsa.aa_array.g_nge_nse;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ***************************************************************************************
 * Find Next Greater Element (NGE) of each element in array
 * Elements for which no greater element exist, consider the next greater element as -1.
 * ***************************************************************************************
 * Input:	{4, 5, 2, 25}
 * Output:	{5, 25, 25, -1}
 * 
 * Input:	{13, 7, 6, 12}
 * Output:	{-1, 12, 12, -1}
 * 
 * Input:	{5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4}
 * Output:	{10, 10, 10, 12, 8, 12, 4, 12, -1, -1, -1}
 * 
 * ***************************************************************************************
 */

public class G01_findNGE {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array
	 * for each element, traverse the entire array to find out the NGE and store it in another array
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * NEVER STORE A HEAVY ELEMENT OVER A SMALL ELEMENT
	 * 
	 * Push A[0] in stack
	 * 
	 * For each elements in the array:
	 * 	  - If A[i] <= stackTop || stack is empty:
	 * 	       - push A[i] in stack
	 * 	  
	 *    - If A[i] > stackTop:
	 *         - the NGE of stackTop is A[i]
	 * 	       - keep popping from stack as long as (A[i] > stackTop) && (stack not empty)
	 * 
	 * Once the array is traversed, if there are elements left in the stack, then for all of those elements the NGE is -1
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4};
		findNextGreaterElement(A);
		findNextGreaterElement_sameOrderAsInput(A);
	}
	
	
	private static void findNextGreaterElement(int A[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(A[0]);
		
		for (int i=1; i<A.length; i++) {
			if (stack.isEmpty() || A[i] <= stack.peek()) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && A[i] > stack.peek()) {
					System.out.println("NGE of "+stack.peek()+" is "+A[i]);
					stack.pop();
				}
				stack.push(A[i]);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.println("NGE of "+stack.peek()+" is -1");
			stack.pop();
		}
	}
	
	
	/*
	 * Instead of printing the output, save the elements along with its NGE in a map
	 * at the end, traverse A[] and for each element do a lookup in the map and prints corresponding NGE
	 */
	private static void findNextGreaterElement_sameOrderAsInput(int A[]) {
		Map<Integer,Integer> map = new HashMap<>();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(A[0]);
		
		for (int i=1; i<A.length; i++) {
			if (stack.isEmpty() || A[i] <= stack.peek()) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && A[i] > stack.peek()) {
					//System.out.println("NGE of "+stack.peek()+" is "+A[i]);
					map.put(stack.peek(), A[i]);
					stack.pop();
				}
				stack.push(A[i]);
			}
		}
		
		while (!stack.isEmpty()) {
			//System.out.println("NGE of "+stack.peek()+" is -1");
			map.put(stack.peek(), -1);
			stack.pop();
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println(A[i] + " ---> " + map.get(A[i]));
		}
	}
	
}
