package org.example.dsa.zz1_stack.z_misc;

/**
 * *****************************************************************************
 * Length of the longest valid substring
 * *****************************************************************************
 * I/P: ((()
 * O/P: 2			//explanation: ()
 * 
 * I/P: )()())
 * O/P: 4			//explanation: ()()
 * 
 * I/P: ()(()))))
 * O/P: 6			//explanation: ()(())
 * 
 * *****************************************************************************
 */

public class Z02_longestValidSubstring {
	/*
	 * result = 0;
	 * 
	 * Stack stack = new Stack();
	 * stack.push(-1);
	 * 
	 * for (all characters) {
	 *    if A[i] is '('
	 * 	     stack.push(i);
	 * 	 
	 * 	  if A[i] is ')'
	 * 	     stack.pop();
	 * 	     if (stack.isEmpty()) {
	 *          length = i - top;
	 *          result = (length>result ? length:result);
	 * 	     }
	 * 	     else {
	 * 	        stack.push(i);
	 * 	     }
	 * }
	 * 
	 */
}
