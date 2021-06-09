package org.example.dsa.bb_string;

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

public class A06_subsequencesOfString {
	
	/*
	 *                          (abc)+''
	 *                _____________|_____________
	 *               /                           \
	 *           (bc)+''                       (bc)+'a'
	 *          ____|____                     _____|_____
	 *         /         \                   /           \
	 *      (c)+''       (c)+'b'         (c)+'a'        (c)+'ab'
	 *      __|__         __|__          __|__          ___|___
	 *     /     \       /     \        /     \        /       \
	 *  ()+''  ()+'c' ()+'b' ()+'bc'  ()+'a' ()+'ac' ()+'ab' ()+'abc'
	 *  ____   _____  _____  ______   _____  ______  ______  ________
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "abc";
		findSubsequences(str, "");
	}
	
	private static void findSubsequences(String str, String answer) {
		if (str.length() == 0) {
			System.out.print("("+answer+")");
			return;
		}
		
		findSubsequences(str.substring(1), answer);
		findSubsequences(str.substring(1), answer+str.charAt(0));
	}
	
}
