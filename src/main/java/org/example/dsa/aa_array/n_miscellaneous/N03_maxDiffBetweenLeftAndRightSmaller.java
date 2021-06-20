package org.example.dsa.aa_array.n_miscellaneous;

import java.util.Stack;

/**
 * *****************************************************************************
 * Find maximum absolute difference between left smaller and right smaller elements of every element in the array of integers.
 * If there is no smaller element on right/left side of any element then we take 0 as the smaller element.
 * *****************************************************************************
 * Input:	{2, 1, 8}
 * Output:	1						// Left smaller  LS[] = {0, 0, 1}
 * 									// Right smaller RS[] = {1, 0, 0}		=> Max_diff of abs(LS[i]-RS[i]) = 1
 * 
 * Input:	{2, 4, 8, 7, 7, 9, 3}
 * Output:	4						// Left smaller  LS[] = {0, 2, 4, 4, 4, 7, 2}
 * 									// Right smaller RS[] = {0, 3, 7, 3, 3, 3, 0}		=> Max_diff of abs(LS[i]-RS[i]) = 7-3 = 4
 * 
 * *****************************************************************************
 */

public class N03_maxDiffBetweenLeftAndRightSmaller {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse the array and for each elements find the left smaller element and store it in LS[]
	 * Traverse the array and for each elements find the right smaller element and store it in RS[]
	 * Now traverse both the arrays and compare each elements to figure out the maximum of them all
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * Find the NSE of all elements in regular way & keep tracking of such smaller elements in an array LSE[]
	 * Reverse the input array
	 * Find the NSE of all elements in regular way & keep tracking of such smaller elements in an array RSE[]
	 * Now traverse both LSE[] and RSE[].. compare each elements and keep tracking of the max
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {2, 4, 8, 7, 7, 9, 3};
		
		int LSE[] = new int[A.length];
		findNSE(A, LSE);
		
		int RSE[] = new int[A.length];
		reverse(A);
		findNSE(A, RSE);
		
		int max = findMax(LSE, RSE);
		System.out.println(max);
	}
	
	
	private static void findNSE(int A[], int SE[]) {
		Stack<Integer> stack = new Stack<>();
		int i=0;
		stack.push(A[i]);
		
		for (i=1; i<A.length; i++) {
			if (stack.isEmpty() || stack.peek() < A[i]) {
				stack.push(A[i]);
			}
			else {
				while (!stack.isEmpty() && stack.peek() > A[i]) {
					//System.out.println("NGE of "+stack.peek()+" is "+A[i]);
					stack.pop();
				}
				if (!stack.empty())
					SE[i] = stack.peek();
				else
					SE[i] = 0;
				
				stack.push(A[i]);
			}
		}
	}
	
	
	private static int findMax(int LSE[], int RSE[]) {
		int result = -1;
		for (int i=0; i<LSE.length; i++) {
			result = Math.max(result, Math.abs(LSE[i] - RSE[LSE.length- 1- i]));
		}
		return result;
	}
	
	
	private static void reverse(int A[]) {
		int i = 0;
		int j = A.length - 1;
		while (i < j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
	}
	
}
