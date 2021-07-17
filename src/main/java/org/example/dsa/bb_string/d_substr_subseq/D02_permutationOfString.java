package org.example.dsa.bb_string.d_substr_subseq;

/**
 * ******************************************************************************
 * Find all permutations of a given string
 * ******************************************************************************
 * Input:	abc
 * Output:	abc acb bac bca cba cab
 * 
 * ******************************************************************************
 */

public class D02_permutationOfString {

	public static void main(String[] args) {
		String str = "abc";
		permute(str, "");
	}
	
	private static void permute(String str, String answer) {
		if (str.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		for (int i=0; i<str.length(); i++) {
	        String leftPart = str.substring(0, i);		//left part of i'th character (0 to i-1 index)
	        String rightPart = str.substring(i+1);		//right part of i'th character (i+1 to end index)
	        String rest = leftPart + rightPart;
	        
	        permute(rest, answer+str.charAt(i));
		}
	}
	
}
