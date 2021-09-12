package org.example.dsa.cc_slidingWindow.variable;

/**
 * ***************************************************************************************
 * Minimum window substring
 * ***************************************************************************************
 * Given two strings, s1 and s2, the task is to find the smallest substring in s1 containing all characters of s2
 * ***************************************************************************************
 * Input:  s1="thisisateststring"
 * 		   s2="tist"
 * Output: 5						//the smallest substring -- "tstri"
 * 
 * Input:  s1="geeksforgeeks"
 * 		   s2="ork"
 * Output: 5						//the smallest substring -- "ksfor"
 * ***************************************************************************************
 */

public class B05_minimumWindowSubstring {
	/*
	 * --------------------
	 * This is a variable sliding window problem
	 * 
	 * "substring" can be viewed as the "window"
	 * we can put count of characters of s2 in a map. And this map.size() becomes the "condition".
	 * 
	 * Here we don't know the window size.
	 * Rather based on some condition (i.e. map.size()) we need to maximize the window.
	 * Hence the window size can grow or shrink depending upon the condition (i.e. map.size())
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "ork";
		String ss = solution(s1, s2);
		System.out.println(ss);
	}
	
	
	public static String solution(String str, String pattern) {
		if (str == null || pattern == null)
			return "";
		
		int[] map = new int[128];
		for (Character ch : pattern.toCharArray()) {
			map[ch]++;
		}
		
		int i = 0, j = 0;
		int minStart = 0;
		int minLen = Integer.MAX_VALUE;
		int counter = pattern.length();
		
		char[] arr = str.toCharArray();
		while (j < arr.length) {
			if (map[arr[j]] > 0)
				counter--;
			map[arr[j]]--;
			j++;
			while (counter == 0) {
				if ((j - i) < minLen) {
					minLen = j - i;
					minStart = i;
				}
				map[arr[i]]++;
				if (map[arr[i]] > 0)
					counter++;
				i++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : str.substring(minStart, minStart + minLen);
	}
	
	/*
	private static void solution(char A[], char pattern[]) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : pattern) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		int i = 0, j = 0;
		int counter = map.size();
		int ans = 0;
		
		while (j < A.length) {
			char ch = A[j];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
				if (map.get(ch) == 0)
					counter--;
			}
			
			if (counter > 0) {
				j++;
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch)-1);
					if (map.get(ch) == 0)
						counter--;
				}
			}
			
			
			
			
			
			
			
			
			if (counter == 0) {
				while (counter == 0) {
					ans = Math.min(ans, j-i+1);
					char chh = A[i];
					if (map.containsKey(chh)) {
						map.put(chh, map.get(chh)+1);
						if (map.get(ch) == 1)
							counter++;
					}
					i++;
				}
			}
			j++;
		}
		System.out.println(ans);
	}
	*/
}
