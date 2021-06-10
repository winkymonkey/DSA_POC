package org.example.dsa.bb_string.a_basics;

/**
 * ******************************************************************************
 * Check whether a string is a valid shuffle of two strings or not
 * ******************************************************************************
 * Input:	first=XY, second=12		result=1XY2 
 * Output:	true
 * 
 * Input:	first=XY, second=12		result=Y12X 
 * Output:	false
 * 
 * ******************************************************************************
 */

public class A05_checkIfValidShuffle {
	
	public static void main(String[] args) {
		String first = "XY";
		String second = "12";
		String result = "1XY2";
		boolean isValidShuffle = checkShuffle(first, second, result);
		System.out.println(isValidShuffle);
	}
	
	private static boolean checkShuffle(String first, String second, String result) {
		if (first.length() + second.length() != result.length()) {
			return false;
		}
		
		int i=0, j=0, k=0;
		while (k != result.length()) {
			if (i < first.length() && first.charAt(i) == result.charAt(k)) {			// check if 1st char of first == 1st char of result 
				i++;
			}
			else if (j < second.length() && second.charAt(j) == result.charAt(k)) {		// check if 1st char of second == 1st char of result 
				j++;
			}
			else {
				return false;															// if the character doesn't match
			}
			k++;
		}
		
		if (i<first.length() || j<second.length()) {			// after accessing all characters of result if either first or second has some characters left
			return false;
		}
		
		return true;
	}
	
}
