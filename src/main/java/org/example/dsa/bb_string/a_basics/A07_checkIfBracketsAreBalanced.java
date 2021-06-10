package org.example.dsa.bb_string.a_basics;

/**
 * ******************************************************************************
 * For an expression containing `(` `)` `{` `}` `[` `]` find out whether it is balanced or not 
 * ******************************************************************************
 * Input:	{([])}
 * Output: 	YES
 * 
 * Input:	([]
 * Output: 	NO
 * 
 * ******************************************************************************
 */

public class A07_checkIfBracketsAreBalanced {
	/*
	 * Push the 1st character in a STACK
	 * 
	 * Now traverse the character array
	 * for each of the next characters,
	 * 		if (current character == stack top)
	 * 			pop the stack top
	 * 		else
	 * 			push current character in stack 
	 * 
	 * Post traversal, if the stack is empty, then the expression balanced. Otherwise it is not
	 * 
	 */
}
