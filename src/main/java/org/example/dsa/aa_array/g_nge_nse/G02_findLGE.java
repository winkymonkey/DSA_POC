package org.example.dsa.aa_array.g_nge_nse;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Find LeftGreaterElement(LGE) of each element
 * ***************************************************************************************
 * If no such element is found, return -1
 * ***************************************************************************************
 * Input:  { 10, 4, 2, 20, 40, 12, 30 }
 * Output: { -1, 10, 4, -1, -1, 40, 40}
 * 
 * ***************************************************************************************
 */

public class G02_findLGE {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * For each element in array, traverse the entire array to find out the LGE
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 10, 4, 2, 20, 40, 12, 30 };
		
		findLGE(A);
	}
	
	private static void findLGE(int A[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<A.length; i++) {
			while (!stack.empty() && stack.peek() < A[i]) {
				stack.pop();
			}
			
			if (stack.empty())
				System.out.println(A[i]+"---->"+(-1));
			else
				System.out.println(A[i]+"---->"+stack.peek());
			
			stack.push(A[i]);
		}
	}
	
}
