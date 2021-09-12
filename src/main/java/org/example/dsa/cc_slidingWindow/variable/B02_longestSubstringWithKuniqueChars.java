package org.example.dsa.cc_slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find the size of the longest substring with K unique characters
 * ***************************************************************************************
 */

public class B02_longestSubstringWithKuniqueChars {
	/*
	 * --------------------
	 * This is a variable sliding window problem
	 * 
	 * Here we don't know the window size.
	 * Rather based on some condition (i.e. unique character count is K) we need to maximize the window (substring).
	 * Hence the window size can grow or shrink depending upon the condition (i.e. unique character count is K)
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
	 *    ■ j++
	 *    
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "aabacbebebe";
		int K = 3;
		findLongestSubstring(str.toCharArray(), K);
	}
	
	
	private static void findLongestSubstring(char A[], int K) {
		int i=0, j=0;
		Map<Character, Integer> map = new HashMap<>();		// store unique char count
		int maxLen = Integer.MIN_VALUE;
		
		while (j < A.length) {
			char ch = A[j];
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
			
			
			if (map.size() < K) {						// condition < K
				j++;										// increment j to increase the window size
			}
			else if (map.size() == K) {					// condition == K		window size = j-i+1
				maxLen = Math.max(maxLen, j-i+1);			// if current window size is greater than the max so far, then update max so far
				j++;
			}
			else if (map.size() > K) {					// condition > K
				while (map.size() > K) {					// as long as condition > K, keep reverting calculations for i, and keep incrementing i to decrease widow size
					char chh = A[i];
					map.put(chh, map.get(chh)-1);
					if (map.get(chh) == 0)
						map.remove(chh);
					
					i++;
				}
				j++;
			}
		}
		System.out.println(maxLen);
	}
	
}
