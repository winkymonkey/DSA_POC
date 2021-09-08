package org.example.dsa.aa_array.j_merge;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Merge two sorted arrays without any extra space
 * ***************************************************************************************
 * Input:  A[] = {1, 5, 9, 10, 15, 20}
 * 		   B[] = {2, 3, 8, 13}
 * 
 * Output: A[] = {1, 2, 3, 5, 8, 9}
 * 		   B[] = {10, 13, 15, 20}
 * 
 * ***************************************************************************************
 */

public class J03_merge_twoSortedArraysIntoTwoArrays {
	/*
	 * A[] = {1, 5, 9, 10, 15, 20}
	 * B[] = {2, 3, 8, 13}
	 * 
	 * while (A[n-1] < B[0]) {
	 * 	  a = A[n-1];				//a = 20
	 *    b = B[0];					//b = 2
	 *    
	 *    //put b in correct index of A[] by shifting existing elements at right
	 *	  //put a in correct index of B[] by shifting existing elements at left
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {1, 5, 9, 10, 15, 20};		int n = A.length;
		//		   0  1  2  3   4   5
		
		int B[] = {2, 3, 8, 13};
		//		   0  1  2  3
		
		while (A[n-1] > B[0]) {
			int a = A[n-1];
			int b = B[0];
			
			insertInA_byRightShift(A, b);
			insertInB_byLeftShift(B, a);
			System.out.println(Arrays.toString(A));
			System.out.println(Arrays.toString(B));
			System.out.println("-------");
		}
	}
	
	
	private static void insertInA_byRightShift(int A[], int b) {
		int n = A.length;
		
		int i;
		for (i=0; i<n; i++) {
			if (b < A[i]) {
				break;
			}
		}
		for (int k=n-1; k>=i; k--) {
			A[k] = A[k-1];
		}
		A[i] = b;
	}
	
	
	private static void insertInB_byLeftShift(int B[], int a) {
		int n = B.length;
		
		int i;
		for (i=n-1; i>=0; i--) {
			if (a > B[i]) {
				break;
			}
		}
		for (int k=1; k<=i; k++) {
			B[k-1] = B[k];
		}
		B[i] = a;
	}
	
}
