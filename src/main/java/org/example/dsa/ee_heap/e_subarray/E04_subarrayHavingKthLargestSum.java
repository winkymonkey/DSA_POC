package org.example.dsa.ee_heap.e_subarray;

import java.util.PriorityQueue;

/**
 * ****************************************************************************************
 * Find the SubArray that has K'th Largest sum
 * ****************************************************************************************
 * Input:	{20, -5, -1}		k=3
 * Output:	14
 * 
 * Input:	{10, -10, 20, -40}	k=6
 * Output:	-10
 * 
 * ****************************************************************************************
 */

public class E04_subarrayHavingKthLargestSum {
	
	public static void main(String[] args) {
		int A[] = {10, -10, 20, -40};
		int k = 6;
		int kthLargestSum = kthLargestSum(A, k);
		System.out.println(kthLargestSum);
	}
	
	
	private static int kthLargestSum(int A[], int k) {
		int n = A.length;
		
		int sum[] = new int[n+1];
		sum[0] = 0;
		for (int i=0; i<n; i++) {
			sum[i+1] = sum[i] + A[i];				// {0, 10, 0, 20, -20}
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer> ();		// min heap
		
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				int currSum = sum[j] - sum[i-1];		// contiguous subarray sum from j to i index is (sum[j] - sum[i-1])
				
				if (queue.size() < k) {					// if queue has less then k elements, then simply push it
					queue.add(currSum);
				}
				else {
					if (queue.peek() < currSum) {		// if the largest (till now) is smaller than 'curSum' then insert
						queue.poll();
						queue.add(currSum);
					}
					else {
						// ignore
					}
				}
			}
		}
		return queue.poll();
	}
	
}
