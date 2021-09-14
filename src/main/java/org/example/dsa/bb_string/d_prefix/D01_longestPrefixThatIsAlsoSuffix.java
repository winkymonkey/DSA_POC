package org.example.dsa.bb_string.d_prefix;

/**
 * ***************************************************************************************
 * Find the length of the longest proper prefix which is also a proper suffix
 * (the prefix and suffix should not overlap)
 * ***************************************************************************************
 * Input:	"abab"
 * Output:	2			//"ab"
 * 
 * Input:	"aaaa"
 * Output:	3			//"aaa"
 * 
 * ***************************************************************************************
 */

public class D01_longestPrefixThatIsAlsoSuffix {
	/*
	 * --------------------
	 * As the prefix and suffix should not overlap,
	 * We can break the string from the middle and start matching left and right strings (by each character)
	 * If they are equal return size of one string, else they try for shorter lengths on both sides
	 * --------------------
	 */
	
	public static void main(String[] args) {
		String str = "abcdwxyzabcxabcd";
		System.out.println(longestPrefixSuffix(str));
	}
	
	
	private static int longestPrefixSuffix(String str) {
		int n = str.length();
		if (n < 2)
			return 0;

		int start = 0;
		int mid = (n+1) / 2;

		while (mid < str.length()) {
			if (str.charAt(start) == str.charAt(mid)) {
				++start;
				++mid;
			}
			else {
				if (start == 0)			// if start reaches at 0, we keep it there and increase mid
					++mid;
				else					// otherwise we decrease start to check for smaller length
					--start;
			}
		}
		return start;					// at the end, the start will point to the last matching character
	}
	
	
	private static int longestPrefixSuffix_usingKMP(String str) {
		// TODO
		return -1;
	}
}
