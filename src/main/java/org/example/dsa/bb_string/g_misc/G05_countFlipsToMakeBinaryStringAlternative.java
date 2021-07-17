package org.example.dsa.bb_string.g_misc;

/**
 * ******************************************************************************
 * Count the number of flips to make binary string alternate
 * ******************************************************************************
 * Input: 	001
 * Output:	1				//flip 1st bit
 * 
 * Input:	0001010111
 * Output:	2				//flip 2nd bit, 9th bit
 * 
 * ******************************************************************************
 */
public class G05_countFlipsToMakeBinaryStringAlternative {
	/*
	 * As we are supposed to get alternate string, there are only 2 possibilities ---
	 * 		alternate string starting with 0
	 * 		alternate string starting with 1
	 * We will try both cases and choose the string which will require minimum number of flips as our final answer.
	 * 
	 * Traverse the characters
	 * if (current character is expected character according to alternation)
	 * 		then do nothing
	 * else
	 * 		increase flip count by 1
	 *  
	 */
	
	public static void main(String args[]) {
		String str = "0001010111";
		System.out.println(getMinFlips(str));
	}
	
	public static int getMinFlips(String str) {
		return Math.min(getFlips(str, '0'), getFlips(str, '1'));
	}
	
	public static int getFlips(String str, char expected) {
		int flipCount = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) != expected) {
				flipCount++;
			}
			expected = (expected=='0') ? '1':'0';
		}
		return flipCount;
	}
	
}
