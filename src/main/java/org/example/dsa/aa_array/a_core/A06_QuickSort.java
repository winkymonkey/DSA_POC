package org.example.dsa.aa_array.a_core;

import java.util.Arrays;


public class A06_QuickSort {
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		//			0   1   2   3  4  5   6
		
		int left = 0;
		int right = A.length-1;
		quickSort(A, left, right);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void quickSort(int A[], int left, int right) {
		if (left < right) {
			int pi = partition(A, left, right);	//pi is partitioning index, A[pi] is now at right place
			quickSort(A, left, pi-1);			//Call quickSort for first part
			quickSort(A, pi+1, right);			//Call quickSort for second part
		}
	}
	
	
	private static int partition(int A[], int left, int right) {
		int pivot = A[right];
		int k = left-1; 						//index of smaller element
		
		for (int i=left; i<right; i++) {
			if (A[i] <= pivot) {				//if current element is smaller than or equal to pivot
				k++;
				//swap A[i] and A[k]
				int temp = A[k];
				A[k] = A[i];
				A[i] = temp;
			}
		}
		
		//swap A[k+1] and pivot
		int temp = A[k+1];
		A[k+1] = A[right];
		A[right] = temp;

		return k+1;
	}
	
	
	
	/**
	 * --------------------------
	 * 		TIME COMPLEXITY
	 * --------------------------
	 * in case of merge sort, the array is divided in two equal halves
	 * But in case of quick sort, the 'partitioning place' depends on the 'partitioning algorithm'
	 * ---------
	 * BEST CASE
	 * --------- 
	 * When the partition process picks the middle element as pivot.
	 * Hence the array is divided into two equal halves.
	 * 
	 * T(n) = [time taken to sort 1st part] + [time taken to sort 2nd part] + [partitioning process]
	 *      = T(n/2) + T(n/2) + O(n)
	 *      = 2.T(n/2) + O(n)
	 *      = O(nLogn)
	 * 
	 * ----------
	 * WORST CASE
	 * ----------
	 * When the partition process picks greatest OR smallest element as pivot OR when all elements are same.
	 * Hence one partition contains 0 elements and another partition contains (n-1) elements 
	 * 
	 * T(n) = [time taken to sort 1st part] + [time taken to sort 2nd part] + [partitioning process]
	 *      = T(0) + T(n-1) + O(n)
	 *      = T(n-1) + O(n)
	 *      = T(n-1) + c.n
	 *      = T(n-2) + c(n-1) + c.n
	 *      = T(n-3) + c(n-2) + c(n-1) + c.n
	 *      = ......
	 *      = ......
	 *      = 0 + c.1 + c.2 + c.3 + .......+ c.n
	 *      = c(1+2+3+.....n)
	 *      = c(n*(n+1)/2)
	 *      = O(n^2)
	 * 
	 * 
	 * 
	 * --------------------------
	 * 		SPACE COMPLEXITY
	 * --------------------------
	 * ---------
	 * BEST CASE
	 * --------- 
	 * in this case, the array is divided into two equal halves
	 *    hence the recursion tree is balanced 
	 * 	  hence total space is 'height of the tree' which is O(Logn)
	 * 
	 * ----------
	 * WORST CASE
	 * ----------
	 * in this case, one partition contains 0 elements, and another partition contains (n-1) elements
	 *    hence the recursion tree is skewed
	 *    hence total space is 'O(n)'
	 * 
	 */
}
