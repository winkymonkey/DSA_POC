package org.example.dsa.bb_string.a_basics;

import java.util.HashMap;
import java.util.Map;

/**
 * ****************************************************************************
 * Find Duplicate characters in a string
 * ****************************************************************************
 * Input:	banana
 * Output:	a n
 * 
 * Input:	apple
 * Output:	p
 * 
 * ****************************************************************************
 */

public class A03_findDuplicateCharacters {
	
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * traverse the characters of the string
	 * and keep a count of each visited characters in a Hash
	 * at the end, print the characters for which the count is more than 1
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "bb";
		findDuplicate(str);
		findDuplicate2(str);
	}
	
	private static void findDuplicate(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		for (Character ch : map.keySet()) {
			if (map.get(ch) > 1)
				System.out.println(ch);
		}
	}
	
	
	private static void findDuplicate2(String str) {
		int first = 0;					// to check if (i+'a') is present in str at least once or not
		int second = 0;					// to check if (i+'a') is present in str at least twice or not

		for (int i=0; i<str.length(); i++) {
			int k = str.charAt(i) - 'a';
			
			if ((first & (1 << k)) != 0) {				// if str[i] has already occurred in str
				second = (1 << k) | second;				// Set k'th bit of second
			}
			else {
				first = (1 << k) | first;				// Set k'th bit of first
			}
		}
		
		for (int i=0; i<26; i++) {										// Iterate over the range [0, 25]
			if (((first & (1 << i)) & (second & (1 << i))) != 0) {		// if i-th bit of both first and second is Set
				System.out.println((char) (i + 'a'));
			}
		}
	}
	
}
