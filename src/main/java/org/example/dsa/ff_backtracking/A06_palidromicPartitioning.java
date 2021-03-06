package org.example.dsa.ff_backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************************************************************************************
 * Palindromic Partition
 * ***************************************************************************************
 * Partition a give string such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of the given string.
 * ***************************************************************************************
 * Input:  "aab"
 * Output: [[a,a,b],[aa,b]]
 * 
 * Input:  "a"
 * Output: [[a]]
 * 
 * ***************************************************************************************
 */

public class A06_palidromicPartitioning {
	/*
	 * --------------------
	 * In a given string, we can partition the string at i-th index (0th, 1st, 2nd, 3rd, ...... (n-1)th)
	 * But before partitioning at "i", we need to check if STR[0th,i] or S[1st,i] or STR[2nd,i etc] are palindrome or not, otherwise that partition is not possible.
	 * if a partition is possible, let us call the recursion for remaining part of the string
	 * --------------------
	 */
	
	public static void main(String[] args) {
		String str = "aabb";
		findSubstring(str, 0, new ArrayList<>());
		System.out.println(ans);
	}
	
	
	private static List<List<String>> ans = new ArrayList<>();
	
	private static void findSubstring(String str, int i, List<String> temp) {	// i = partitioning index
		if (i == str.length()) {												// we reached the end
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int k=i; k<str.length(); ++k) {
			if (isPalindrome(str, i, k)) {										// if S[i..k] is palindrome
				temp.add(str.substring(i, k+1));								// add S[i..k] in a temp data structure
				findSubstring(str, k+1, temp);									// recursively find valid substring in S[k+1...end]
				temp.remove(temp.size()-1);										// after the recursive call, clear out the temp data structure
			}
		}
	}
	
	private static boolean isPalindrome(String str, int start, int end) {
		while (start <= end) {
			if (str.charAt(start++) != str.charAt(end--))
				return false;
		}
		return true;
	}
	
}
