package org.example.dsa.hh_heap.a_core;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Convert an array into Heap
 * ***************************************************************************************
 * Input:	{1, 6, 9, 8, 7, 10, 3, 12, 4, 14}
 * Output:	{14, 12, 10, 8, 7, 9, 3, 1, 4, 6}
 * 
 * ***************************************************************************************
 */

public class A01A_buildMaxHeap {
	/*
	 * --------------------
	 * A given array may not have all its elements in Heap structure.
	 * To convert an array to Max Heap we need some algorithm where 'max_heapify()' is the heart of it.
	 * --------------------
	 */

	public static void main(String[] args) {
		int A[] = { 1, 6, 9, 8, 7, 10, 3, 12, 4, 14 };
		//index		0  1  2  3  4  5   6  7   8  9
		
		buildMaxHeap(A);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void buildMaxHeap(int A[]) {
		int n = A.length;
		for (int i = (n/2)-1; i>=0; i--) { 			// non-leaves are from 0 to Floor(n/2)-1   and   leaves are from Floor(n/2) to n-1
			max_heapify(A, n, i);
		}
	}
	
	
	private static void max_heapify(int A[], int n, int i) {
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if (l < n && A[l] > A[i])		// if left child exists and left child > current root
			largest = l;
		
		if (r < n && A[r] > A[largest])	// if right child exists and right child > largest element
			largest = r;
		
		if (largest != i) {				// if `largest` != `current root`, swap `largest` & `current root` to send `current root` to `largest` index
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;

			max_heapify(A, n, largest);
		}
	}
	
	
	/*
	 * --------
	 * EXAMPLE:
	 * --------
	 * INPUT
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   8     7  10  3
	 *  / \   /
	 * 12  4 14
	 * 
	 * HEAPIFY FOR 7 --- so swap 7 with 14
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   8    14  10  3
	 *  / \   /
	 * 12  4 7
	 * 
	 * HEAPIFY FOR 8 --- so swap 8 with 12
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   12   14  10  3
	 *  / \   /
	 * 8   4 7
	 * 
	 * HEAPIFY FOR 9 --- so swap 9 with 10
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6      10
	 *    /   \    / \
	 *   12   14  9   3
	 *  / \   /
	 * 8   4 7
	 * 
	 * HEAPIFY FOR 6 --- so swap 6 with 14 --- then swap 6 with 7
	 * 
	 * 
	 *          1
	 *       /     \
	 *     14      10
	 *    /   \    / \
	 *   12   6   9   3
	 *  / \   /
	 * 8   4 7
	 * 
	 *          1
	 *       /     \
	 *     14      10
	 *    /   \    / \
	 *   12   7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 * HEAPIFY FOR 1 --- so swap 1 with 14 --- then swap 1 with 12 --- then swap 1 with 8
	 * 
	 * 
	 *         14
	 *       /     \
	 *      1      10
	 *    /   \    / \
	 *   12   7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 *         14
	 *       /     \
	 *     12      10
	 *    /   \    / \
	 *   1    7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 *         14
	 *       /     \
	 *     12      10
	 *    /   \    / \
	 *   8    7   9   3
	 *  / \   /
	 * 1   4 6
	 * 
	 */
}
