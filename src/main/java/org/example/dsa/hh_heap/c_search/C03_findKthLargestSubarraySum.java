package org.example.dsa.hh_heap.c_search;

import java.util.PriorityQueue;

/**
 * ***************************************************************************************
 * Find K'th largest subarray sum
 * ***************************************************************************************
 * Input:	{20, -5, -1}		k=3
 * Output:	14
 * 
 * Input:	{10, -10, 20, -40}	k=6
 * Output:	-10
 * 
 * ***************************************************************************************
 */

public class C03_findKthLargestSubarraySum {
	/*
	 * -------------------
	 * From the given array {10, -10, 20, -40} let us prepare the pre-sum array {0, 10, 0, 20, -20}
	 * Then we can run two nested loops (i=1, j=i) to produce the subarray sum as (presum[j] - presum[i-1])
	 * -------------------
	 * Then we can simply push all these subarray sum in a maxHeap. And at the end we remove k-1 elements from maxHeap & the top element will be K-th largest
	 * -------------------
	 * But we can optimize it further by not blindly pushing all elements in the maxHeap.  
	 * Rather we can take a minHeap.
	 * 	here we can push first k-1 elements blindly.
	 *  from there onwards, we push the subarray sum only if it's bigger than the root.
	 *  by doing so, at the end, the root becomes the K-th largest
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {10, -10, 20, -40};
		int k = 6;
		int kthLargestSum = kthLargestSum(A, k);
		System.out.println(kthLargestSum);
	}
	
	
	private static int kthLargestSum(int A[], int k) {
		int n = A.length;
		
		int presum[] = new int[n+1];
		presum[0] = 0;
		for (int i=0; i<n; i++) {
			presum[i+1] = presum[i] + A[i];				// {0, 10, 0, 20, -20}
		}
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				int currSubarrSum = presum[j] - presum[i-1];	// it produces the subarray sum
				if (minHeap.size() < k) {						// if minHeap contains less then k elements, then simply insert curentSubarraySum in minHeap
					minHeap.add(currSubarrSum);
				}
				else {
					if (currSubarrSum > minHeap.peek()) {		// if curentSubarraySum is bigger than the largest (till now), then remove the largest & insert curentSubarraySum in minHeap
						minHeap.poll();
						minHeap.add(currSubarrSum);
					}
					else {
						// ignore
					}
				}
			}
		}
		return minHeap.poll();
	}
	
}
