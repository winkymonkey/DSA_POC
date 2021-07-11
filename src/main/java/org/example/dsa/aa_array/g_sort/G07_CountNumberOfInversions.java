package org.example.dsa.aa_array.g_sort;

/**
 * ******************************************************************************************
 * Count number of inversions in an array
 * ******************************************************************************************
 * Input:	{8, 4, 2, 1}
 * Output:	6								// Given array has 6 inversions:
 * 											(8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1)
 * 
 * Input:	{ 38, 27, 43, 3, 9, 82, 10 }
 * Output:	11								// Given array has 11 inversions:
 * 											(38, 27), (38, 3), (38, 9), (38, 10), (27, 3), (27, 9), (27, 10), (43, 3, (43, 9), (43, 10), (82, 10)
 * 
 * Input:	{ 1, 20, 6, 4, 5 }				// Given array has 5 inversions:
 * Output:	5								(20, 6), (20, 4), (20, 5), (6, 4), (6, 5)
 * 
 * ******************************************************************************************
 */
public class G07_CountNumberOfInversions {
	/* 
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Traverse through the array
	 * for every index, find the number of smaller elements on its right side of the array
	 * This can be done using a nested loop
	 * Sum up the counts for all index in the array and print the sum
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---MODIFIED MERGE SORT---
	 * -------------------------
	 * Total number of inversions
	 * = (number of inversions in left subarray) + (number of inversions in right subarray) + (number of inversions in merge())
	 * 
	 * 
	 * How to get the number of inversions in merge()? 
	 *  - Let i is used to traverse L[]
	 *  - Let j is used to traverse R[]
	 *  - At any step, if A[i] > A[j], then all elements at the right side of A[i] will obviously be greater than A[j].
	 *  	Hence these many inversion are required whose value is (elemCountInLeft – i)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		//			0   1   2   3  4  5   6
		int left = 0;
		int right = A.length-1;
		System.out.println(mergeSort(A, left, right));
	}
	
	
	private static int mergeSort(int arr[], int left, int right) {
		int inv_count = 0;
		if (left < right) {
			int mid = (left+right)/2;
			inv_count += mergeSort(arr, left, mid);
			inv_count += mergeSort(arr, mid+1, right);
			inv_count += merge(arr, left, mid, right);
		}
		return inv_count;
	}
	
	
	private static int merge(int arr[], int left, int mid, int right) {
		int n1 = mid-left+1;			// no of elements in left-sorted-half
		int n2 = right-mid; 			// no of elements in right-sorted-half
		
		int L[] = new int[n1];			// create L[] for left-sorted-half
		int R[] = new int[n2];			// create R[] for right-sorted-half
		
		for (int x=0; x<n1; x++)
			L[x] = arr[left+x];			// copy left-sorted-half to L[]
		for (int z=0; z<n2; z++)
			R[z] = arr[(mid+1)+z];		// copy right-sorted-half to R[]
		
		//smallest from each of L[] and R[] is placed in original array
		int i = 0;						// to traverse L[]
		int j = 0;						// to traverse R[]
		int k = left;					// to traverse merged array
		int inv_count = 0;
		
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
				inv_count += (n1-i);
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
		return inv_count;
	}
	
}
