package org.example.dsa.gg_dynamicprog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ***************************************************************************************
 * Word Break problem --- possible or not
 * ***************************************************************************************
 * Given an input string and a dictionary of words,
 * find out if the input string can be segmented into a space-separated sequence of dictionary words
 * ***************************************************************************************
 * Dictionary: { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango }
 * 
 * Input:  ilike
 * Output: TRUE						// i like
 * 
 * Input:  ilikesamsung
 * Output: TRUE						// i like sam sung, i like samsung
 * 
 * ------------------
 * Dictionary: { c, od, e, x }
 * 
 * Input:  code
 * Output: TRUE						// c od e
 * 
 * ***************************************************************************************
 */

public class A07_wordBreakProblem_isPossible {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * We divide the string into two parts --- Prefix & Suffix
	 * 
	 * first we consider first 1 characters to be prefix and rest n-1 characters to be suffix.
	 * then we consider first 2 characters to be prefix and rest n-2 characters to be suffix.
	 * then we consider first 3 characters to be prefix and rest n-3 characters to be suffix.
	 * .....
	 * .....
	 * then we consider first n-1 characters to be prefix and rest 1 characters to be suffix.
	 * then we consider first n characters to be prefix and rest 0 characters to be suffix.
	 * 
	 * 
	 * At each step we consider each prefix and search it in dictionary.
	 * If the prefix is present in dictionary, we recursively search the suffix in the dictionary.
	 * As soon as both prefix & suffix is found in the dictionary, we can say that the word exists in the dictionary, hence we return TRUE.
	 * 
	 * 
	 * --------------
	 * Recursion Tree
	 * --------------
	 *                                                      F(code)
	 *                                _________________________|_________________________
	 *                               |                        |              |           |
	 *                          c,F(ode)                   co,F(de)       cod,F(e)   code,F('')
	 *                  ___________|___________           ____|____          |
	 *                 |           |           |         |         |         |
	 *             o,F(de)      od,F(e)    ode,F('')   d,F(e)  de,F('')   e,F('')
	 *           ___|___           |                     |
	 *          |       |          |                     |
	 *       d,F(e)  de,F('')   e,F('')                e,F('')
	 *          |
	 *          |
	 *       e,F('')
	 * 
	 * 
	 * From above diagram we should observe that
	 * For input of length 4, there are 8 non-empty recursive calls
	 * For input of length 3, there are 4 non-empty recursive calls
	 * For input of length 2, there are 2 non-empty recursive calls
	 * For input of length 1, there are 1 non-empty recursive calls
	 * 
	 * So we can say that,
	 * For input of length n, there are 2^(n-1) non-empty recursive calls
	 * 
	 * So time complexity is O(2^(n-1)) = O(2^n)
	 * 
	 * 
	 * TIME --- O(2^n)
	 * SAPCE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---DYNAMIC PROGRAMING---
	 * ------------------------
	 * If we observe carefully, we can see that there are many occurrences where the function is called with same input multiple times.
	 * For example, F(de) F(e) etc.
	 * So there exists repeating subproblems that overlaps. So we can apply Dynamic Programming in it.
	 * We are applying Top-Down (Memoization) approach.
	 * 
	 * So now for each suffix, there will be only 1 recursive call. For example, 
	 * F(code) will be called 1 times.
	 * F(ode) will be called 1 times.
	 * F(de) will be called 1 times.
	 * F(e) will be called 1 times.
	 * 
	 * So, the number of recursive calls will be as same as the number of characters.
	 * So time complexity is O(n)
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		String arr[] = {"mobile","samsung","sam","sung", "man","mango","icecream","and", "go","i","like","ice","cream"};
		Set<String> dictionary = Arrays.stream(arr).collect(Collectors.toSet());
		
		boolean isPossible = wordBreak("ilikemango", dictionary);
		System.out.println(isPossible);
		
		boolean isPossible2 = wordBreak_dynamic("ilikemango", dictionary);
		System.out.println(isPossible2);
	}
	
	
	private static boolean wordBreak(String str, Set<String> set) {
		int len = str.length();
		if (len == 0)
			return true;
		
		for (int i=1; i<=len; i++) {
			if (set.contains(str.substring(0,i)) && wordBreak(str.substring(i,len), set)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	private static final Map<String, Boolean> map = new HashMap<>();			// lookup for memoization
	
	private static boolean wordBreak_dynamic(String str, Set<String> set) {
		int len = str.length();
		if (len == 0)
			return true;
		
		if (map.containsKey(str)) {
			return true;
		}
		else {
			for (int i=1; i<=len; i++) {
				if (set.contains(str.substring(0,i)) && wordBreak(str.substring(i,len), set)) {
					map.put(str.substring(i,len), true);
					return true;
				}
			}
			map.put(str, false);
			return false;
		}
	}
	
}
