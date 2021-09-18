package org.example.dsa.ff_backtracking;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ***************************************************************************************
 * Word Break problem --- find all possibilities
 * ***************************************************************************************
 * Given an input string and a dictionary of words,
 * find out if the input string can be segmented into a space-separated sequence of dictionary words
 * ***************************************************************************************
 * Dictionary: { i, like, sam, sung, samsung, mobile, and, ice, cream, icecream, man, go, mango }
 * 
 * Input:  ilike
 * Output: 1						// i like
 * 
 * Input:  ilikemango
 * Output: 2						// i like man go, i like mango
 * 
 * ***************************************************************************************
 */

public class A09_wordBreakProblem_findAllPossibilities {
	/*
	 * 
	 */
	
	public static void main(String[] args) {
		String arr[] = {"mobile","samsung","sam","sung", "man","mango","icecream","and", "go","i","like","ice","cream"};
		Set<String> set = Arrays.stream(arr).collect(Collectors.toSet());
		
		String str = "ilikemango";
		wordBreak(str, set, "");
	}
	
	
	private static void wordBreak(String str, Set<String> set, String ans) {
		int len = str.length();
		if (len == 0)
			return;
		
		for (int i=1; i<=len; i++) {
			String prefix = str.substring(0, i);
			String suffix = str.substring(i, len);
			if (set.contains(prefix)) {							// If set contains the prefix
				if (i == len) {									// suffix is blank
					System.out.println(ans+prefix);				// add this prefix with ans till now
				}
				else {											// suffix is not blank
					wordBreak(suffix, set, ans+prefix+" ");		// recursively check if suffix exists in the dictionary
				}
			}
			else {
				// Otherwise we ignore this prefix and try next
			}
		}
	}
	
}
