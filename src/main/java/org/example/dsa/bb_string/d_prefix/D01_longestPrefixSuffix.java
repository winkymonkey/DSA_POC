package org.example.dsa.bb_string.d_prefix;

/**
 * ******************************************************************************
 * For a string, find the length of the longest proper prefix which is also a proper suffix
 * (the prefix and suffix should not overlap)
 * ******************************************************************************
 * Input:	"abab"
 * Output:	2			//"ab"
 * 
 * Input:	"aaaa"
 * Output:	3			//"aaa"
 * 
 * ******************************************************************************
 */

public class D01_longestPrefixSuffix {
	/*
	 * As the prefix and suffix should not overlap,
	 * We can break the string from the middle and start matching left and right strings (by each character)
	 * If they are equal return size of one string, else they try for shorter lengths on both sides
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "blahblahblah";
		System.out.println(longestPrefixSuffix(str));
	}
	
	private static int longestPrefixSuffix(String str) {
		if (str.length() < 2) {
			return 0;
		}

		int len = 0;
		int i = (str.length()+1) / 2;

		while (i < str.length()) {
			if (str.charAt(i) == str.charAt(len)) {
				++len;
				++i;
			} else {
				i = i - len + 1;
				len = 0;
			}
		}
		return len;
	}
	
}
