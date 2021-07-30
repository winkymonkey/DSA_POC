package org.example.dsa.aa_array.n_recursion;

/**
 * ***************************************************************************************
 * Find all Subsequences of a string
 * ***************************************************************************************
 * Input:	abc
 * Output:	a, b, c, ab, bc, ac, abc
 * 
 * Input:	aaa
 * Output:	a, aa, aaa
 * 
 * ***************************************************************************************
 */

public class N05_allSubsequences {
	/*
	 *                                 [abc],''
	 *                   _________________|_________________
	 *                  /                                   \
	 *              [bc],''                              [bc],'a'
	 *          _______|_______                       ________|________
	 *         /               \                     /                 \
	 *      [c],''           [c],'b'              [c],'a'            [c],'ab'
	 *      ___|___           ___|___             ___|___            ___|___
	 *     /       \         /       \           /       \          /       \
	 *  [],''    [],'c'   [],'b'    [],'bc'    [],'a'   [],'ac'   [],'ab'   [],'abc'
	 *  _____    ______   ______    ______     ______   _______   ______    ________
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
