package org.example.dsa.bb_string.a_basics;

/**
 * ****************************************************************************
 * Check whether a String is Palindrome or not
 * ****************************************************************************
 * Input:	"madam"
 * Output:	TRUE
 * 
 * Input:	"malayalam"
 * Output:	TRUE
 * 
 * Input:	"mountain"
 * Output:	FALSE
 * 
 * ****************************************************************************
 */

public class A02_checkIfPalindrome {
	
	public static void main(String[] args) {
		String str = "malayalam";
		boolean isPalindrome = isPalindrome(str);
		System.out.println(isPalindrome);
	}

	private static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
}
