package org.example.dsa.aa_array.r_matrix;

/**
 * ***************************************************************************************
 * Rotate a Matrix
 * ***************************************************************************************
 */

public class R03_rotateMatrix {
	/*
	 * ------------------
	 * First take a transpose of the matrix
	 * Then rotate each row in-place
	 * ------------------
	 */
	
	public static void main(String[] args) {
		int A[][] = {{1, 2, 3},
					 {4, 5, 6},
					 {7, 8, 9,}};

		transpose(A);
		print(A);
		
		for (int i=0; i<A.length; i++) {
			rotateRow(A[i]);
		}
		print(A);
	}
	
	
	private static void transpose(int A[][]) {
		for (int i=0; i<A.length; i++) {
			for (int j=i+1; j<A[0].length; j++) {
				int temp = A[i][j];						// swap A[i][j] with A[j][i]
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
	}
	
	
	private static void print(int A[][]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++)
				System.out.print(A[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	
	private static void rotateRow(int A[]) {
		int i = 0;
		int j = A.length-1;
		while (j > i) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
	}
	
}
