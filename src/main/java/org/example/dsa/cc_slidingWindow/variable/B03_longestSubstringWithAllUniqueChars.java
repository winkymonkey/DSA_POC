package org.example.dsa.cc_slidingWindow.variable;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find the longest substring with All unique characters
 * ***************************************************************************************
 */

public class B03_longestSubstringWithAllUniqueChars {
	/*
	 * --------------------
	 * This is a variable sliding window problem
	 * 
	 * "substring" can be viewed as the "window"
	 * "all unique characters in a window" can be also viewed as "unique character count in a window is equal to window size"
	 * 
	 * Here we don't know the window size.
	 * Rather based on some condition (i.e. all unique characters) we need to maximize the window.
	 * Hence the window size can grow or shrink depending upon the condition (i.e. all unique characters)
	 * 
	 * 
	 * -------------
	 * ■ INDEPENDENT CALCULATION
	 *    For each "j",
	 *    - we will keep on adding A[j] to a variable SUM which denotes the sum of current window.
	 * 
	 * ■ If condition > window size(j-i+1)
	 *    - j++
	 * 
	 * ■ If condition == window size(j-i+1)
	 *    ■ ANSWER CALCULATION
	 *       - if current window size (j-i+1) is greater than max so far, then update max so far
	 *    - j++
	 * 
	 * ■ If condition < window size(j-i+1)
	 *    ■ REVERT CALCULATIONS FOR i
	 *       - as long as condition < window size(j-i+1), keep reverting calculations for i, and keep incrementing i to decrease widow size
	 *    ■ j++
	 *    
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "aabacbebebe";
		findLongestSubstring2(str.toCharArray());
	}
	
	
	private static void findLongestSubstring2(char A[]) {
		int i=0, j=0;
		Map<Character, Integer> map = new HashMap<>();		// store unique char count
		int maxLen = Integer.MIN_VALUE;
		
		while (j < A.length) {
			char ch = A[j];
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
			
			
			if (map.size() > j-i+1) {					// condition > window size(j-i+1)
				j++;										// IT WILL NEVER HAPPEN
			}
			else if (map.size() == j-i+1) {				// condition == window size(j-i+1)
				maxLen = Math.max(maxLen, j-i+1);			// if current window size is greater than the max so far, then update max so far
				j++;
			}
			else if (map.size() < j-i+1) {				// condition < window size(j-i+1)
				while (map.size() < j-i+1) {				// as long as condition < window size(j-i+1), keep reverting calculations for i, and keep incrementing i to decrease widow size
					char chh = A[i];
					map.put(chh, map.get(chh)-1);
					if (map.get(chh) == 0) {
						map.remove(chh);
					}
					i++;
				}
				j++;
			}
		}
		System.out.println(maxLen);
	}
	
}
