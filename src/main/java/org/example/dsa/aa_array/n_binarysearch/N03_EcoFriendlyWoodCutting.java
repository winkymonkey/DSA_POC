package org.example.dsa.aa_array.n_binarysearch;

/**
 * *****************************************************************************
 * EcoFriendly Wood Cutting
 * *****************************************************************************
 * Mirko needs to chop down M meters of wood. (1 ≤ M ≤ 2 000 000 000)
 * Mirko is only allowed to cut N number of trees. (1 ≤ N ≤ 1 000 000)
 * 
 * His machine works as follows:
 *  - Mirko sets a height parameter H (in meters), and the machine raises a giant saw blade to that height and cuts off all tree parts higher than H
 *  - Obviously, trees not higher than H meters remain intact
 *  - Mirko then takes the parts that were cut off. 
 * 
 * Mirko is ecologically minded, so he doesn't want to cut off more wood than necessary.
 * That‟s why he wants to set his saw blade as high as possible.
 * Help Mirko find the maximum integer height of the saw blade that still allows him to cut off at least M meters of wood.
 * 
 * *****************************************************************************
 * Input:	Trees = {20, 15, 10, 17}		Required Wood(M) = 7
 * Output:	15
 * 
 * Input:	Trees = {4, 42, 40, 26, 46}		Required Wood(M) = 20
 * Output:	36
 * 
 * *****************************************************************************
 */

public class N03_EcoFriendlyWoodCutting {
	/*
	 * Our objective is to keep the saw blade as high as possible so that the the required wood is collected.
	 * and if we increase the saw blade height further, we will not be able to collect the desired quantity of wood.
	 * 
	 * If we keep the saw blade at 0 ---> collected wood will be summation of height of all trees and this is maximum possible collection
	 * If we keep the saw blade at max tree height ---> no wood will be collected and this is the minimum possible collection
	 * 
	 * So the optimum value lies in this range.
	 * So instead of searching the optimum value linearly, we can apply binary search
	 * where the range will be 
	 * 	START = min tree height
	 * 	END = max tree height
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {4, 42, 40, 26, 46};
		int required = 20;
		System.out.println(find(A, required));
	}
	
	
	private static int find(int A[], int required) {	//sorted array
		int start = 0;
		int end = A[A.length-1];
		int mid = -1; 
		
		while (start <= end) {
			mid = start + (end-start)/2;
			int collected = collect(A, mid);
			
			if (collected==required) {
				return mid;
			}
			else if (collected > required) {
				start = mid;
			}
			else {
				end = mid;
			}
		}
		return mid;
	}
	
	
	private static int collect(int A[], int mid) {
		int sum = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i]>mid)
				sum = sum + (A[i]-mid);
		}
		return sum;
	}
	
}
