package org.example.dsa.cc_slidingWindow.fixed;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find the count of occurrences of anagrams of a string in another string
 * ***************************************************************************************
 * Input:  s1=aabaabaa		
 * 		   s2=aaba
 * Output: 4
 * ***************************************************************************************
 */

public class A03_countOccurenesOfAnagram {
	/*
	 * --------------------
	 * Anagram of a string s2 is always of same length.
	 * So s2.length becomes the window size which we need to search in string s1
	 * 
	 * All anagrams of s2 must be continuous in string s1. Otherwise that no longer be an anagram. 
	 * Hence we need to deal with substring.
	 * 
	 * Hence it's fixed sliding window problem.
	 * 		window start --- i
	 * 		window end ----- j
	 * 		window size ---- j-i+1
	 * 
	 * 
	 * -------------
	 * ■ INDEPENDENT CALCULATION
	 *    For each "j"
	 *    - if A[j] exists in the map, then decrement its count
	 * 
	 * ■ if windowSize < K
	 *    - j++
	 * 
	 * ■ if windowSize == K
	 *    ■ ANSWER CALCULATION
	 *       - if all elements in the map has its count as 0, that means current window is an anagram of the given pattern.
	 * 
	 *    ■ REVERT CALCULATION FOR i
	 *       - if the map contains A[i], increment its count (-> it's just the reverse of what we did in first step)
	 * 
	 *    ■ SLIDE AHEAD
	 *       - i++
	 *       - j++
	 * 
	 * 
	 * -------------
	 * In the "Answer Calculation" step, in order to check whether each element in a map has a value 0, we have to traverse the map.
	 * To avoid that we can have a counter.
	 * Whenever the count of any character becomes 0, we decrement the counter.
	 * Whenever the count of any character becomes 1, we increment the counter.
	 * So out previous two conditions should be updated as below.
	 * 
	 * ■ INDEPENDENT CALCULATION
	 *    For each "j"
	 *    - if A[j] exists in the map, then decrement its count
	 *    - if this count becomes 0, decrement the COUNTER
	 * 
	 * ■ if windowSize < K
	 *    - j++
	 * 
	 * ■ if windowSize == K
	 *    ■ ANSWER CALCULATION
	 *       - if COUNTER is 0, that means current window is an anagram of the given pattern. Hence increment the COUNTER.
	 *    
	 *    ■ REVERT CALCULATION FOR i
	 *       As A[i] will be removed in next window,
	 *       - if the map contains A[i], increment its count (-> it's just the reverse of what we did in first step)
	 *       - after incrementing, if the count becomes 1, then means we have a new member in the map, so we do COUNTER++
	 *    
	 *    ■ SLIDE AHEAD
	 *       - i++
	 *       - j++
	 * 
	 * 
	 * -------------
	 * TIME ---
	 * SPACE --
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "aabaabaa";
		String pat = "aaba";
		solution(str.toCharArray(), pat);
	}
	
	
	private static void solution(char A[], String pat) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : pat.toCharArray()) {					// store the count of each characters in a map
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		int i = 0, j = 0;
		int counter = map.size();
		int ans = 0;
		int K = pat.length();
		
		while (j < A.length) {
			char ch = A[j];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
				if (map.get(ch) == 0)
					counter--;
			}
			
			if (j-i+1 < K) {
				j++;
			}
			else if (j-i+1 == K) {
				if (counter == 0)
					ans++;
				
				char chh = A[i];
				if (map.containsKey(chh)) {
					map.put(chh, map.get(chh)+1);
					if (map.get(chh) == 1)
						counter++;
				}
				i++;
				j++;
			}
		}
		System.out.println(ans);
	}
	
}
