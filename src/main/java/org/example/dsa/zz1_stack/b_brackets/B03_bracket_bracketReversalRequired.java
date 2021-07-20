package org.example.dsa.zz1_stack.b_brackets;

/**
 * *****************************************************************************
 * Minimum number of bracket reversals needed to make an expression balanced
 * *****************************************************************************
 * Given an expression with only ‘}’ and ‘{‘.
 * The expression may not be balanced.
 * Find minimum number of bracket reversals to make the expression balanced.
 * *****************************************************************************
 * Input:  "}{"
 * Output: 2		//We need to change '}' to '{' and '{' to '}' so that the expression becomes balanced
 * 
 * Input:  "{{{"
 * Output: Can't be made balanced using reversals
 * 
 * Input:  "{{{{"
 * Output: 2
 * 
 * Input:  "{{{{}}"
 * Output: 1
 * 
 * Input:  "}{{}}{{{"
 * Output: 3
 * 
 * *****************************************************************************
 */

public class B03_bracket_bracketReversalRequired {
	/*
	 * If the number of parenthesis is odd, return -1 (as it's not possible to balance them)
	 * 
	 * Then remove all balanced part of expression.
	 * E.g. convert "}{{}}{{{" to "}{{{"
	 * 
	 * If we take a closer look we can notice that,
	 * after removing balanced part, we always end up with an expression of the form "}...}{...{"
	 * which contains 0/more closing brackets followed by 0/more opening brackets
	 * 
	 * Now the question is --- How many minimum reversals are required for an expression of the form "}...}{...{"
	 * 
	 * Let m = total number of closing brackets
	 * 	   n = total number of opening brackets
	 * 
	 * We need CEIL(m/2) + CEIL(n/2) reversals
	 * 
	 */
}
