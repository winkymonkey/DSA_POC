package org.example.dsa.zz1_stack.b_brackets;

/**
 * ***************************************************************************************
 * Find maximum depth of nested parenthesis in a string
 * ***************************************************************************************
 * I/P: "(((X)) (((Y))))"
 * O/P: 4
 * 
 * I/P: "(a(b) (c) (d(e(f)g)h) I (j(k)l)m)"
 * O/P: 4
 * 
 * I/P: "(p((q)) ((s)t))"
 * O/P: 3
 * 
 * I/P: ""
 * O/P: 0
 * 
 * I/P: "b) (c) ()"
 * O/P: -1
 * 
 * I/P: "(b) ((c) ()"
 * O/P: -1
 * 
 * ***************************************************************************************
 */

public class B02_bracket_maxDepthOfNestedBracket {
	/*
	 * Traverse each character in the string
	 * keep on checking whether balanced or not
	 * at each step save the "height of the stack" which denotes the maximum depth of nested parenthesis
	 * 
	 * once the traversal ends, if the parenthesis are unbalanced --> simply print -1
	 * otherwise --> print the max height of the stack
	 * 
	 */
}
