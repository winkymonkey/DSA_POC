package org.example.dsa.aa_array.m_subarray;

import java.util.PriorityQueue;

/**
 * ***************************************************************************************
 * Find the subarray that has k-th largest sum
 * ***************************************************************************************
 * Input:  {20, -5, -1} 		k=3 
 * Output: 14
 * 
 * Input:  {10, -10, 20, -40} 	k=6 
 * Output: -10
 * 
 * ***************************************************************************************
 */

public class M04_kthLargestSumSubarray {
	/*
	 * -------------------------------
	 * ---USE PREFIX SUM & MIN HEAP---
	 * -------------------------------
	 * From the given array, create a prefix sum array PrefixSum[] 
	 * Then we run two nested loops (i, j) to find the subarray sum from i to j = PrefixSum[j] - PrefixSum[i-1]
	 * We keep putting these subarray sums in a MinHeap (priority queue) to find the k'th maximum among them.
	 * 
	 * TIME --- O(n^2 log(k))
	 * SPACE -- O(k)
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 10, -10, 20, -40 };
		int k = 6;
		kthLargestSum(arr, k);
	}

	private static void kthLargestSum(int A[], int k) {
		int prefixSum[] = new int[A.length+1];
		prefixSum[0] = 0;
		
		for (int i=1; i<prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i-1] + A[i-1];						// prefixSum = {0, 10, 0, 20, -20}
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for (int i=1; i<prefixSum.length; i++) {
			for (int j=i; j<prefixSum.length; j++) {
				int subarraySum = prefixSum[j] - prefixSum[i-1];		// subarray sum from i to j
				
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
