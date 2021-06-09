package org.example.dsa.aa_array.f_arrangement;

import java.util.Arrays;


public class F01B_separatePosAndNegNums {
	
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

		while (x<=mid && A[x]<0)		//after traversal --- Ln = A[left] to A[x-1]
			x++;						//after traversal --- Lp = A[x] to A[mid]

		while (y<=right && A[y]<0)		//after traversal --- Rn = A[mid+1] to A[y-1]
			y++;						//after traversal --- Rp = A[y] to A[right]

		reverse(A, x, mid);				//reverse Lp (A[i] to A[mid])
		reverse(A, mid+1, y-1);			//reverse Rn (A[mid+1] to A[j-1])
		reverse(A, x, y-1);				//reverse Lp'Rn' (A[i] to A[j-1]
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
