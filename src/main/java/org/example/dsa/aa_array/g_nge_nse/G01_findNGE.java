package org.example.dsa.aa_array.g_nge_nse;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ***************************************************************************************
 * Find Next Greater Element (NGE) of each element in array
 * ***************************************************************************************
 * If no such element is found, return -1
 * ***************************************************************************************
 * Input:  { 10, 4, 2, 20, 40, 12, 30 }
 * Output: { 20, 20, 20, 40, -1, 30, -1 }
 * 
 * ***************************************************************************************
 */

public class G01_findNGE {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * For each element in array, traverse the entire array to find out the NGE
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
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 10, 4, 2, 20, 40, 12, 30 };
		
		findNGE(A);
		System.out.println();
		findNGE_sameOrderAsInput(A);
	}
	
	
	private static void findNGE(int A[]) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i=0; i<A.length; i++) {
			if (stack.isEmpty() || stack.peek() >= A[i]) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && stack.peek() < A[i]) {
					System.out.println(stack.peek()+"----->"+A[i]);
					stack.pop();
				}
				stack.push(A[i]);
			}
		}
		
		while (!stack.isEmpty()) {									// after traversal, if there are elements present in the stack
			System.out.println(stack.peek()+"----->"+(-1));			// then for all of those the NGE is -1
			stack.pop();
		}
	}
	
	
	/*
	 * Instead of printing an element as output, save the element (as key) and its NGE (as value) in a map
	 * At the end, for each element in A[] find its NGE from map
	 */
	private static void findNGE_sameOrderAsInput(int A[]) {
		Map<Integer,Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int i=0; i<A.length; i++) {
			if (stack.isEmpty() || A[i] <= stack.peek()) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && A[i] > stack.peek()) {
					map.put(stack.peek(), A[i]);
					stack.pop();
				}
				stack.push(A[i]);
			}
		}
		while (!stack.isEmpty()) {
			map.put(stack.peek(), -1);
			stack.pop();
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println(A[i]+"----->"+map.get(A[i]));
		}
	}
	
}
