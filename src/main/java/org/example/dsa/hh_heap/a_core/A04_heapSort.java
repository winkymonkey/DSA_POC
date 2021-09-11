package org.example.dsa.hh_heap.a_core;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Implement Heap Sort
 * ***************************************************************************************
 */

public class A04_heapSort {
	/*
	 * TIME --- O(nLogn)		max_heapify takes O(Logn) time and it happens for each of the n elements
	 * SPACE -- O(Logn)			call stack
	 */
	
	public static void main(String[] args) {
		int A[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		//index		0  1  2  3  4  5   6   7  8  9   10
		
		heapSort(A, A.length);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void heapSort(int A[], int n) {
		for (int i = (n/2)-1; i >= 0; i--) {			// build heap (rearrange array)
			max_heapify(A, n, i);
		}
		
		for (int i=n-1; i>0; i--) {						// One by one extract an element from heap, then move current node to root
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			
			max_heapify(A, i, 0);						// call max heapify on the reduced heap
		}
	}
	
	
	private static void max_heapify(int A[], int n, int i) {
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;

		if (l < n && A[l] > A[i])
			largest = l;

		if (r < n && A[r] > A[largest])
			largest = r;

		if (largest != i) {						// if `largest` and `current root` are not same, swap `A[largest]` and `A[i]` to send `A[i]` to `largest` index
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;

			max_heapify(A, n, largest);
		}
	}
	
}
