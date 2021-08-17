package org.example.dsa.aa_array.a_core;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Merge Sort
 * ***************************************************************************************
 */

public class A05_MergeSort {
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		//			0   1   2   3  4  5   6
		
		int left = 0;
		int right = A.length-1;
		mergeSort(A, left, right);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void mergeSort(int arr[], int low, int high) {
		if (low < high) {
			int mid = (low+high)/2;
			mergeSort(arr, low, mid);			// Call mergeSort for left half (low to mid)
			mergeSort(arr, mid+1, high);		// Call mergeSort for right half (mid+1 to high)
			merge(arr, low, mid, high);			// Merge the sorted halves (CORE OF MERGE SORT)
		}
	}
	
	
	private static void merge(int arr[], int low, int mid, int high) {
		int n1 = mid-low+1;				// no of elements in left-sorted-half
		int n2 = high-mid; 				// no of elements in right-sorted-half
		
		int L[] = new int[n1];			// create L[] for left-sorted-half
		int R[] = new int[n2];			// create R[] for right-sorted-half
		
		for (int x=0; x<n1; x++)
			L[x] = arr[low+x];			// copy left-sorted-half to L[]
		
		for (int z=0; z<n2; z++)
			R[z] = arr[(mid+1)+z];		// copy right-sorted-half to R[]
		
		//smallest from each of L[] and R[] is placed in original array
		int i = 0;						// to traverse L[]
		int j = 0;						// to traverse R[]
		int k = low;					// to track merged array
		
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			}
			else {
				arr[k] = R[j];
				j++;
				k++;
			}
        }
		
		//copy remaining elements (if any) of L[] to original array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		//copy remaining elements (if any) of R[] to original array
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	
	/**
	 * --------------------------
	 * 		TIME COMPLEXITY
	 * --------------------------
	 * 
	 * -------------
	 * Theoretically
	 * ------------- 
	 *                      size n
	 *                     .
	 *                    .
	 *                   .
	 *                  . 
	 *                 /
	 *              size 8
	 *             /      \
	 *          size 4
	 *         /      \
	 *      size 2
	 *     /      \
	 *  size 1   size 1
	 * 
	 * 
	 * At each level, merge() method makes maximum 'n' comparisons and 'n' movements
	 * ==> At each level merge() method takes O(n) time at max
	 * 
	 * ==> Total work = (time taken at each level) * (no of levels)
	 *                = O(n) * O(Logn)
	 *                = O(nLogn)
	 * 
	 * --------------
	 * Mathematically
	 * --------------
	 * Recurrence relation
	 * T(n) = T(n/2) + T(n/2) + O(n)
	 *      = 2.T(n/2) + O(n)
	 *      = O(nLogn)				---using Master's Theorem
	 * 
	 * 
	 * 
	 * 
	 * --------------------------
	 * 		SPACE COMPLEXITY
	 * --------------------------
	 * size of the stack + an array of size 'n'
	 * = O(Logn) + O(n)
	 * = O(n)
	 * 
	 */
}
