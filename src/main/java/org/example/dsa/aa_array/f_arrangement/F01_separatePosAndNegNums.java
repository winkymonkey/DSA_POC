package org.example.dsa.aa_array.f_arrangement;

import java.util.Arrays;

/**
 * *******************************************************************************************************
 * Rearrange (separately) positive & negative numbers in an array (maintain ordering & no extra space)
 * *******************************************************************************************************
 * Input:  {12 11 -13 -5 6 -7 5 -3 -6}
 * Output: {-13 -5 -7 -3 -6 12 11 6 5}
 * 
 * *******************************************************************************************************
 */

public class F01_separatePosAndNegNums {
	/*
	 * --------------------------------------------
	 * ---MODIFIED QUICK SORT---(NOT ACCEPTABLE)---
	 * --------------------------------------------
	 * Use the "Partition process of the QuickSort" assuming the 'PIVOT = 0'
	 * Hence all negative numbers will be left aligned, all positive numbers will be right aligned
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * But it's NOT ACCEPTABLE -- as the order of the elements are not maintained here (this is how QuickSort works).
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------
	 * ---MODIFIED INSERTION SORT---
	 * -----------------------------
	 * Traverse the array from left to right
	 * When encounter a Negative number, copy it in KEY variable
	 * Then right-shift all the positive numbers in its left
	 * Then place the KEY in the newly opened slot
	 * 
	 * for (i=0 to length) {
	 *    KEY = A[i]
	 *    if (A[i] is negative) {
	 *       right-shift all positive numbers sitting at left of A[i]
	 *       place the KEY in the opened slot
	 *    }
	 * }
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * --------------------------------------------
	 * ---MODIFIED MERGE SORT---(NOT ACCEPTABLE)---
	 * --------------------------------------------
	 * We can use the "Merge process of the MergeSort" and while merging two sorted halves ensure that:
	 *  - first the negative elements of both the subarrays are copied
	 *  - then the positive elements of both the subarrays are copied
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(n)
	 * 
	 * But it's NOT ACCEPTABLE -- as extra O(n) space is used (this is how MergeSort works).
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------------
	 * ---FURTHER MODIFIED MERGE SORT---
	 * ---------------------------------
	 * Instead of using extra space while merging in above solution, we can use the concept of 'block reversal' in rotation
	 * 
	 * Let Ln and Lp denotes the negative part and positive part of left sub-array respectively.
	 * And Rn and Rp denotes the negative and positive part of right sub-array respectively.
	 *    [Ln Lp  Rn  Rp]
	 * -> [Ln Lp’ Rn’ Rp]		// Reverse Lp, Reverse Rn
	 * -> [Ln Rn  Lp  Rp]		// Reverse [Lp’ Rn’]
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(1)
	 * 
	 */
	
	
	public static void main(String[] args) {
		int A[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		rearrangePosNeg(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));
	}
	
	private static void rearrangePosNeg(int A[], int left, int right) {
		if (left < right) {
			int mid = (left+right)/2;
			rearrangePosNeg(A, left, mid);
			rearrangePosNeg(A, mid+1, right);
			merge(A, left, mid, right);
		}
	}
	
	private static void merge(int A[], int left, int mid, int right) {
		int x = left; 					// Initial index of left subarray
		int y = mid+1; 					// Initial index of right subarray

		while (x<=mid && A[x]<0)		// after traversal --- Ln = A[left] to A[x-1]	and 	Lp = A[x] to A[mid]
			x++; 

		while (y<=right && A[y]<0)		// after traversal --- Rn = A[mid+1] to A[y-1]	and		Rp = A[y] to A[right]
			y++; 

		reverse(A, x, mid);				// reverse Lp 		(A[i] to A[mid])
		reverse(A, mid+1, y-1);			// reverse Rn 		(A[mid+1] to A[j-1])
		reverse(A, x, y-1);				// reverse Lp'Rn' 	(A[i] to A[j-1]
	}
	
	private static void reverse(int A[], int left, int right) {
		while (left < right) {
			int temp = A[left];
			A[left] = A[right];
			A[right] = temp;
			
			left++;
			right--;
		}
	}
	
}
