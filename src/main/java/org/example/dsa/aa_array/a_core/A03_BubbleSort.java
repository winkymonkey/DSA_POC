package org.example.dsa.aa_array.a_core;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Bubble Sort
 * ***************************************************************************************
 */

public class A03_BubbleSort {
	/*
	 * --------------------
	 * Traverse from 0 to n-1
	 *    - Swap two adjacent elements, keeping the larger element at right & smaller element at left.
	 *    - After one full iteration, the largest element will be at extreme right which is its final slot.
	 * 
	 * Traverse from start to n-2
	 *    - repeat
	 *    - repeat
	 * 
	 * Traverse from start to n-3
	 *    - repeat
	 *    - repeat
	 * .....
	 * .....
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		//			0   1   2   3  4  5   6
		
		bubbleSort(A);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void bubbleSort(int A[]) {
		int temp;
		for (int i=0; i<A.length; i++) {			// traverse 0 to n-1		// After each iteration, the largest element will be at extreme right which is its final slot.
			for (int j=1; j<A.length-i; j++) {		// traverse 1 to n-1, 1 to n-2, 1 to n-3.......
				if (A[j-1] > A[j]) {				// send larger element at right
					//swap
					temp = A[j-1];  
                    A[j-1] = A[j];  
                    A[j] = temp;  
				}
			}
		}
	}
	
}
