package org.example.dsa.bb_string.b_brackets;

/**
 * ******************************************************************************
 * For an expression containing `{` `}` find out the minimum number of reversals required to make it balanced
 * ******************************************************************************
 * Input:	}{{}}{{{
 * Output:	3
 * 
 * Input:	{{}{{{}{{}}{{
 * Output:	-1					//not possible
 * 
 * ******************************************************************************
 */

public class B02_countTheBracketReversal {
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
	 * Now if there are some elements in the stack, then the expression is Unbalanced.
	 * All the remaining characters in the stack always form a pattern like --- }}}....{{{....
	 * 
	 * Now if the count of closing brackets = X and the count of opening brackets = Y
	 * Then the required number of reversal are ---
	 * 		CEIL( X/2 ) + CEIL( X/2 )
	 * 
	 */
}
