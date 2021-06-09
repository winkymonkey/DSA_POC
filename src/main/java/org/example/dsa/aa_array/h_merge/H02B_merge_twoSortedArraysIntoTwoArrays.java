package org.example.dsa.aa_array.h_merge;

import java.util.Arrays;


public class H02B_merge_twoSortedArraysIntoTwoArrays {
	
	public static void main(String[] args) {
		int A[] = {1, 5, 9, 10, 15, 20};		int n = A.length;
		//		   0  1  2  3   4   5
		
		int B[] = {2, 3, 8, 13};
		//		   0  1  2  3
		
		while (A[n-1] > B[0]) {
			int a = A[n-1];
			int b = B[0];
			
			insertInA_byRightShift(A, A.length-1, b);
			insertInB_byLeftShift(B, B.length-1, a);
			System.out.println(Arrays.toString(A));
			System.out.println(Arrays.toString(B));
			System.out.println("-------");
		}
	}
	
	
	private static void insertInA_byRightShift(int A[], int end, int b) {
		int i;
		for (i=0; i<=end; i++) {
			if (b < A[i]) {
				break;
			}
		}
		for (int k=end; k>=i; k--) {
			A[k] = A[k-1];
		}
		A[i] = b;
	}
	
	
	private static void insertInB_byLeftShift(int B[], int end, int a) {
		int i;
		for (i=end; i>=0; i--) {
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
