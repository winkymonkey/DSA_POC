package org.example.dsa.aa_array.k_subarray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * ****************************************************************************************
 * Find the subarray that has k-th largest sum
 * ****************************************************************************************
 * Input:  {20, -5, -1} 		k=3 
 * Output: 14
 * 
 * Input:  {10, -10, 20, -40} 	k=6 
 * Output: -10
 * 
 * ****************************************************************************************
 */

public class K05_kthLargestSumSubarray {
	/*
	 * ---------------------------------
	 * ---USE SUBARRAY SUM & MIN HEAP---
	 * ---------------------------------
	 * We first create a prefix sum array SUM[] from the given array A[]
	 * Then we run two nested loops to find the subarraySum as SUM[j] - SUM[i-1]
	 * We put all subarraySums in a MinHeap (priority queue)
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 10, -10, 20, -40 };
		int k = 6;
		kthLargestSum(arr, k);
	}

	private static void kthLargestSum(int A[], int k) {
		int sum[] = new int[A.length+1];
		sum[0] = 0;
		sum[1] = A[0];
		for (int i=2; i<=A.length; i++) {
			sum[i] = sum[i-1] + A[i-1];						// prefix sum array		{0, 10, 0, 20, -20}
		}
		System.out.println(Arrays.toString(sum));
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i=1; i<sum.length; i++) {
			for (int j=i; j<sum.length; j++) {
				int subarraySum = sum[j] - sum[i-1];		// subarray sum from index i to j
				
				if (queue.size() < k) {
					queue.add(subarraySum);
				}
				else {
					if (queue.peek() < subarraySum) {
						queue.poll();
						queue.add(subarraySum);
					}
				}
			}
		}
		
		System.out.println(queue.poll());								// the top element is the k-th largest element
	}

}
