package org.example.dsa.bb_string.d_substr_subseq;

/**
 * ******************************************************************************
 * Print all Subsequences of a string
 * ******************************************************************************
 * Input:	abc
 * Output:	a, b, c, ab, bc, ac, abc
 * 
 * Input:	aaa
 * Output:	a, aa, aaa
 * 
 * ******************************************************************************
 */

public class D01_subsequencesOfString {
	
	/*
	 *                          (abc)+''
	 *                _____________|_____________
	 *               /                           \
	 *           (bc)+''                        (bc)+'a'
	 *          ____|____                     ______|______
	 *         /         \                   /             \
	 *      (c)+''       (c)+'b'         (c)+'a'         (c)+'ab'
	 *      __|__         __|__           __|__          ___|___
	 *     /     \       /     \         /     \        /       \
	 *  ()+''  ()+'c' ()+'b' ()+'bc'  ()+'a' ()+'ac' ()+'ab' ()+'abc'
	 *  _____  _____  _____  ______   _____  ______  ______  ________
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "abc";
		findSubsequences(str, "");
	}
	
	private static void findSubsequences(String str, String answer) {
		if (str.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		findSubsequences(str.substring(1), answer);
		findSubsequences(str.substring(1), answer+str.charAt(0));
	}
	
}
