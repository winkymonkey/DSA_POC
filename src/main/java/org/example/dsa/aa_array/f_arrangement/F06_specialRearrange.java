package org.example.dsa.aa_array.f_arrangement;

import java.util.Arrays;

/**
 * *******************************************************************************************************
 * Rearrange an array such that --- 
 *    "elements at even positions are greater than all elements before it"
 *    "elements at odd positions are less than all elements before it"
 * *******************************************************************************************************
 * Input :  {1, 2, 3, 4, 5, 6, 7}
 * Output : {4, 5, 3, 6, 2, 7, 1}
 * 
 * Input :  {1, 2, 1, 4, 5, 6, 8, 8}
 * Output : {4, 5, 2, 6, 1, 8, 1, 8}
 * 
 * *******************************************************************************************************
 */

public class F06_specialRearrange {
	/*
	 * The idea is to first create an auxiliary copy of the original array and sort the copied array
	 * 
	 * Now start traversing towards RIGHT SIDE from middle position of the sorted auxiliary array
	 *  - and fill the EVEN positions of the main array
	 * 
	 * Now start traversing towards LEFT SIDE from middle position of the sorted auxiliary array
	 *  - and fill the ODD positions of the main array
	 * 
	 */
	
	public static void main(String argc[]) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int size = 7;
		rearrangeArr(arr, size);

	}
	
	public static void rearrangeArr(int A[], int n) {
		int tempArr[] = Arrays.copyOf(A, n);		// copy original array in an auxiliary array
		Arrays.sort(tempArr);						// sort the auxiliary array

		int j = n/2 - 1;				// middle position
		for (int i=0; i<n; i+=2) {		// fill up odd position in original array
			A[i] = tempArr[j];
			j--;
		}
		
		int k = n/2;					// middle position
		for (int i=1; i<n; i+=2) {		// fill up even positions in original array
			A[i] = tempArr[k];
			k++;
		}

		System.out.println(Arrays.toString(A));
	}
}
