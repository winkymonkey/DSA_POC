package org.example.dsa.bb_string.f_prefix;

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

public class F01_longestPrefixThatIsAlsoSuffix {
	/*
	 * As the prefix and suffix should not overlap,
	 * We can break the string from the middle and start matching left and right strings (by each character)
	 * If they are equal return size of one string, else they try for shorter lengths on both sides
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "abcdwxyzabcxabcd";
		System.out.println(longestPrefixSuffix(str));
	}
	
	private static int longestPrefixSuffix(String str) {
		if (str.length() < 2) {
			return 0;
		}

		int start = 0;
		int mid = (str.length()+1) / 2;

		while (mid < str.length()) {
			if (str.charAt(start) == str.charAt(mid)) {
				++start;
				++mid;
			}
			else {
				mid = mid-start+1;
				start = 0;
			}
		}
		return start;
	}
	
}
