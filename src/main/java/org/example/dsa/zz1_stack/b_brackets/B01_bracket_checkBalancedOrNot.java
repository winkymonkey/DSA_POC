package org.example.dsa.zz1_stack.b_brackets;

/**
 * ***************************************************************************************
 * Check for balanced parentheses in an expression
 * ***************************************************************************************
 * I/P: [()]{}{[()()]()}
 * O/P: true
 * 
 * I/P: [(])
 * O/P: false
 * 
 * ***************************************************************************************
 */

public class B01_bracket_checkBalancedOrNot {
	/*
	 * Traverse the expression
	 * 
	 * if A[i] == ( or { or [
	 * 	  stack.push(A[i])
	 * 
	 * if A[i] == ) or } or ]
	 *    if (stack is empty)
	 *       print "not balanced"
	 *    else {
	 *       stack.pop();
	 *       if current character complements the popped character
	 *          print "balanced"
	 *       else
	 *          print "not balanced"
	 *    }
	 * }
	 * 
	 */
}
