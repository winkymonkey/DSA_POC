package org.example.dsa.aa_array.r_matrix;

/**
 * ***************************************************************************************
 * Transpose of a Matrix
 * ***************************************************************************************
 */

public class R02_transposeOfMatrix {
	
	public static void main(String[] args) {
		int A[][] = {{1, 2, 3},
					 {4, 5, 6},
					 {7, 8, 9,}};

		transpose(A);
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
			System.out.print("\n");
		}
	}
	
}
