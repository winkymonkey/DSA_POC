package org.example.dsa.ee_recursion;

/**
 * ***************************************************************************************
 * All SubSequences
 * ***************************************************************************************
 * Find all SubSequences of a string
 * ***************************************************************************************
 * Input:	abc
 * Output:	a, b, c, ab, bc, ac, abc
 * 
 * Input:	aaa
 * Output:	a, aa, aaa
 * 
 * ***************************************************************************************
 */

public class A02_allSubSequences {
	/*
	 * --------------------
	 * STR = "abc"
	 * 
	 * All possible subsets are:
	 * 		{}
	 * 		{a}
	 * 		{b}
	 * 		{c}
	 * 		{ab}
	 * 		{ac}
	 * 		{bc}
	 * 		{abc}
	 * 
	 * So at every i-th index, we have a choice of whether we want to pick it or not.
	 * 	- If we pick A[i] then A[i] is added in the "answer"
	 *  - Otherwise "answer" remains intact
	 * 
	 * Irrespective of whether we pick or not pick A[i], index is always incremented from i to i+1.
	 * We keep doing this as long as the index doesn't reach end.
	 * 
	 * TIME --- O(2^n)
	 * SPACE -- O(1)
	 * 
	 * --------------
	 * Recursion Tree
	 * --------------
	 *                                 [abc],''
	 *                   _________________|_________________
	 *                  /                                   \
	 *              [bc],'a'                              [bc],''
	 *          ________|________                     ________|________
	 *         /                 \                   /                 \
	 *      [c],'ab'           [c],'a'            [c],'b'            [c],''
	 *      ___|___            ___|___            ___|___            ___|___
	 *     /       \          /       \          /       \          /       \
	 *  [],'abc'  [],'ab'   [],'ac'  [],'a'   [],'bc'   [],'b'    [],'c'   [],''
	 *  _______   ______    ______   ______   ______    ______    ______   _____
	 *    abc       ab        ac       a        bc        b         c       ''
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		String str = "abc";
		findSubsequences(str.toCharArray(), 0, "");
	}
	
	
	private static void findSubsequences(char A[], int i, String answer) {
		if (i == A.length) {							// we reached the end
			System.out.print(answer + " ");				// leaf node
			return;
		}
		
		findSubsequences(A, i+1, answer+A[i]);			// when we pick A[i]
		findSubsequences(A, i+1, answer);				// when we don't pick A[i]
	}
	
}
