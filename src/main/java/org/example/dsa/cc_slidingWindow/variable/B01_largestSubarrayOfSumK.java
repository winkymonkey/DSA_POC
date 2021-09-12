package org.example.dsa.cc_slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Largest subarray of sum K
 * ***************************************************************************************
 * Given an array of size n containing integers.
 * find the length of the longest sub-array having sum K
 * ***************************************************************************************
 * Input:  4, 1, 1, 1, 2, 3, 5		K = 5 (sum)
 * Output: 4										// 1, 1, 1, 2
 * 
 * Input:  10, 5, 2, 7, 1, 9		K = 15 (sum)
 * Output: 4										// 5, 2, 7, 1
 * ***************************************************************************************
 */

public class B01_largestSubarrayOfSumK {
	/*
	 * --------------------
	 * This is a variable sliding window problem
	 * 
	 * Here we don't know the window size.
	 * Rather based on some condition (i.e. sum=K) we need to maximize the window (subarray).
	 * Hence the window size can grow or shrink depending upon the condition (i.e. sum=K)
	 * 
	 * 
	 * -------------
	 * ■ INDEPENDENT CALCULATION
	 *    For each "j",
	 *    - we will keep on adding A[j] to a variable SUM which denotes the sum of current window.
	 * 
	 * ■ If condition < K
	 *    - j++
	 * 
	 * ■ If condition == K
	 *    ■ ANSWER CALCULATION
	 *       - if current window size (j-i+1) is greater than max so far, then update max so far
	 *    - j++
	 * 
	 * ■ If condition > K
	 *    ■ REVERT CALCULATIONS FOR i
	 *       - as long as condition > K, keep reverting calculations for i, and keep incrementing i to decrease widow size
	 *       - during reversal, keep checking if "condition==K" happens, if yes, update max so far
	 *    ■ j++
	 *    
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 4, 1, 1, 1, 2, 3, 5 };
		int K = 5;
		solution(A, K);
		
		int A2[] = { 4, 1, 1, -2, 1, 5 };
		solution_forNegativeNum(A2, K);
	}
	
	
	private static void solution(int A[], int K) {
		int i = 0, j = 0;
		int sum = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while (j < A.length) {
			sum = sum + A[j];
			
			if (sum < K) {							// condition < K
				j++;									// increment j to increase the window size
			}
			else if (sum == K) {					// condition == K		window size = j-i+1
				maxLen = Math.max(j-i+1, maxLen);		// if current window size is greater than the max so far, then update max so far
				j++;
			}
			else {									// condition > K
				while (sum > K) {						// as long as condition > K, keep reverting calculations for i, and keep incrementing i to decrease widow size
					sum = sum - A[i];
					i++;
					if (sum == K)						// during reversal, keep checking if "condition==K" happens, if yes, update max so far
						maxLen = Math.max(j-i+1, maxLen);
				}
				j++;
			}
		}
		System.out.println(maxLen);
	}
	
	
	/*
	 * The above solution doesn't work in case of negative numbers.
	 * Because when we found the current sum to be greater than K, we started reducing the size of the window by doing i++.
	 * Here we assumed that once the sum of elements within the window becomes greater than 5 then increasing the window size will just add to the sum and hence we will not attain the sum 5 again.
	 * This is true when all the element are positive.
	 * But if there are negative numbers, we cannot say that once we reached K, we should not increase window because by increasing window we may find K once again.
	 * Consider the array [4,1,1,-2,1,5], here we would have found the sum to be greater than 5 for i=0, j=2
	 * if we would have now started reducing the window size by doing i++, we would have missed the potential subarray (i=0, j=4).
	 */
	private static void solution_forNegativeNum(int A[], int K) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = 0;

		for (int i=0; i<A.length; i++) {
			sum += A[i];

			if (sum == K)							// when subarray starts from index '0'
				maxLen = i+1;

			if (!map.containsKey(sum)) {			// make an entry for 'sum' if it is not present in 'map'
				map.put(sum,i);
			}
			if (map.containsKey(sum-K)) {			// check if 'sum-K' is present in 'map' or not
				int index = map.get(sum-K);			// obtain index of 'sum-K'
				if (maxLen < i - index)
					maxLen = i - index;
			}
		}
		System.out.println(maxLen);
	}
	
}
