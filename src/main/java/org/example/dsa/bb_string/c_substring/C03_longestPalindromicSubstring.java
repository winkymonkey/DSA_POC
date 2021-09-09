package org.example.dsa.bb_string.c_substring;

/**
 * ***************************************************************************************
 * Find the longest substring which is palindrome 
 * ***************************************************************************************
 * Input:  babad
 * Output: bab		//aba is also a valid answer
 * 
 * Input:  cbbd
 * Output: bb
 * 
 * Input:  forgeeksskeegfor
 * Output: geeksskeeg
 * 
 * ***************************************************************************************
 */

public class C03_longestPalindromicSubstring {
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
	 * Initialize Start of final longest palindrome = 0
	 * Initialize End of final longest palindrome = 0
	 * 
	 * Now for each characters in the string, we need to perform CASE-1 and CASE-2
	 * This will give us two lengths which are maximum as of now.
	 * As we are interested in longest palindrome, we need to take the maximum of these two lengths.
	 * 
	 * Now if this length is greater than (END - START)			//END-START is the length we anticipated initially
	 * 	- update START as (i - (LENGTH-1)/2)					//i=center of current substring, 
	 * 	- update END as (i + LENGTH/2)					//i=center of current substring,
	 * 
	 * 
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(1)
	 * 
	 * Reference:
	 * https://www.youtube.com/watch?v=y2BD4MJqV20
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		String palindromeStr = longestPalindrome(str);
		System.out.println(palindromeStr);
	}
	
	
	private static String longestPalindrome(String str) {
		if (str==null || str.length()<1)
			return "";
		
		int start = 0;		//starting index of the longest palindrome
		int end = 0;		//ending index of the longest palindrome
		
		for (int i=0; i<str.length(); i++) {
			int len1 = expandFromMiddle(str, i, i);			//CASE-2 (e.g. "racecar")
			int len2 = expandFromMiddle(str, i, i+1);		//CASE-1 (e.g. "cabbac")
			
			int maxLen = Math.max(len1, len2);			//max length of the palindrome whose center is at "i"
			if (maxLen > end - start) {					//length is greater than the previously found length
				start = i - (maxLen-1)/2;
				end = i + (maxLen)/2;
			}
		}
		
		return str.substring(start, end+1);
	}
	
	
	private static int expandFromMiddle(String str, int left, int right) {
		if (str == null || left > right)
			return 0;
		
		while ( (left >= 0)  &&  (right < str.length())  &&  (str.charAt(left)==str.charAt(right)) ) {
			left--;
			right++;
		}
		return right - left - 1;
	}
	
}
