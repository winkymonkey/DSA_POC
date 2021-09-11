package org.example.dsa.bbbbbbb_slidingWindow.fixed;

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
	 * ■ Initial Calculation
	 * For each "j"
	 *    - if A[j] exists in the map, then decrement its count
	 * 
	 * ■ Answer Calculation
	 * As soon as we hit window size
	 *    - if all elements in the map has its count as 0, that means current window is an anagram of the given pattern.
	 * 
	 * 
	 * -------------
	 * But in order to check whether each element in a map has a value 0, we have to traverse the map.
	 * To avoid that we can have a counter.
	 * Whenever the count of any character becomes 0, we decrement the counter.
	 * Whenever the count of any character changes to non zero, we increment the counter.
	 * So out previous two conditions should be updated as below.
	 * 
	 * ■ Initial Calculation
	 * For each "j"
	 *    - if A[j] exists in the map, then decrement its count
	 *    - if this count becomes 0, decrement the COUNTER
	 * 
	 * ■ Answer Calculation
	 * As soon as we hit window size
	 *    - if COUNTER is 0, that means current window is an anagram of the given pattern. Hence increment the COUNTER.
	 *    - 
	 * 
	 * ■ Slide Ahead
	 * As A[i] will be removed in next window,
	 *    - if the map contains A[i], increment its count (-> it's just the reverse of what we did in first step)
	 *    - after incrementing, if the count becomes 1, then means we have a new member in the map, so we do count++
	 *    - i++
	 *    - j++
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
	
	
	private static final Map<Character, Integer> map = new HashMap<>();
	
	private static void solution(char A[], String pat) {
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
			if (map.containsKey(A[j])) {
				map.put(A[j], map.get(A[j])-1);
				if (map.get(A[j]) == 0)
					counter--;
			}
			
			if (j-i+1 < K) {
				j++;
			}
			else if (j-i+1 == K) {
				if (counter == 0)
					ans++;
				
				if (map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
					if (map.get(A[i]) == 1)
						counter++;
				}
				i++;
				j++;
			}
		}
		System.out.println(ans);
	}
	
}
