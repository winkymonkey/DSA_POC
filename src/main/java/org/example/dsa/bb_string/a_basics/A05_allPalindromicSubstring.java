package org.example.dsa.bb_string.a_basics;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************************************************************************************
 * All palindromic substrings
 * ***************************************************************************************
 * Find all palindromic sub-strings of a given string
 * ***************************************************************************************
 * Input : hellolle
 * Output: [h, e, l, ll, l, o, lol, lloll, ellolle, l, ll, l, e]
 * ***************************************************************************************
 */

public class A05_allPalindromicSubstring {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * We can run two nested loops (i, j) to find out all possible substrings. It takes O(n^2) time.
	 * Now for each of these substrings we check if it's palindrome or not in O(n) time
	 * 
	 * TIME --- O(n^3)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT SOLUTION---
	 * ------------------------
	 * In palindrome, there can be two cases:
	 * 
	 * CASE-1
	 * "cabbac" 
	 * We start two pointers(i,j) from middle and increase those outwards.
	 * As longs as A[i]==A[j], we are assured that the substring is still a palindrome.
	 * Hence we will check 
	 * 		'b'=='b'
	 * 		'a'=='a'
	 * 		'c'=='c'
	 * 
	 * CASE-2
	 * "racecar"
	 * We start two pointers(i,j) around the middle and increase those outwards.
	 * As longs as A[i]==A[j], we are assured that the substring is still a palindrome.
	 * Hence we will check
	 * 		'e'=='e'
	 * 		'c'=='c'
	 * 		'a'=='a'
	 * 		'r'=='r'
	 * 
	 * Now for each characters in the string, we need to perform CASE-1 and CASE-2
	 * This will give us all possible even-length & odd-length palindromes
	 * 
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		allPalindrome("hellolle");
	}
	
	
	private static void allPalindrome(String str) {
		if (str==null || str.length()<1)
			return;
		
		List<String> list = new ArrayList<>();
		
		for (int i=0; i<str.length(); i++) {
			expandFromMiddle(str, i, i, list);			// CASE-2 (e.g. "racecar")
			expandFromMiddle(str, i, i+1, list);			// CASE-1 (e.g. "cabbac")
		}
		
		System.out.println(list);
	}
	
	
	private static void expandFromMiddle(String str, int left, int right, List<String> list) {
		while ( (left >= 0)  &&  (right < str.length())  &&  (str.charAt(left) == str.charAt(right)) ) {
			list.add(str.substring(left, right+1));
			left--;
			right++;
		}
	}
	
}
