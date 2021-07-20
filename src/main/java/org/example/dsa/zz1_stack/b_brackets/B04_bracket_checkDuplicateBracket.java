package org.example.dsa.zz1_stack.b_brackets;

/**
 * *****************************************************************************
 * Find if an expression has duplicate parenthesis or not
 * *****************************************************************************
 * I/P: ((a+b)+((c+d)))
 * O/P: DUPLICATE				//"c+d" is surrounded by two pairs of brackets.
 * 
 * I/P: (((a+(b)))+(c+d))
 * O/P: DUPLICATE				//"a+(b)" is surrounded by two pairs of brackets.
 * 
 * I/P: (((a+(b))+c+d))
 * O/P: DUPLICATE				//The whole expression is surrounded by two pairs of brackets.
 * 
 * I/P: ((a+b)+(c+d))
 * O/P: NO DUPLICATE
 * 
 * *****************************************************************************
 */

public class B04_bracket_checkDuplicateBracket {
	/*
	 * Traverse the expression
	 * 
	 * if A[i] == '(' or 'letter' or 'symbol'
	 * 	  Push into stack
	 * 
	 * if A[i] == ')'
	 * 	  First pop the top which is ')'
	 *    Now pop other elements from stack until '(' is reached
	 *    And for each pop do count++
	 *    if count < 1
	 *       it means we have found a duplicate parenthesis
	 * 
	 */
}
