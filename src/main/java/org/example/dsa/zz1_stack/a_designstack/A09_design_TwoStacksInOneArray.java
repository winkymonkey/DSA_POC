package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Implement two stacks in an array
 * ***************************************************************************************
 * Create a data structure twoStacks that represents two stacks.
 * Implementation of twoStacks should use only one array
 * (i.e. both stacks should use the same array for storing elements)
 * 
 * Following functions must be supported by twoStacks.
 *  - push1(int x) –> pushes x to first stack
 *  - push2(int x) –> pushes x to second stack
 *  - pop1() –> pops an element from first stack and return the popped element
 *  - pop2() –> pops an element from second stack and return the popped element
 * 
 * Implementation of twoStack should be space efficient.
 * 
 * ***************************************************************************************
 */

public class A09_design_TwoStacksInOneArray {
	/*
	 * The two stacks should be designed in below manner
	 * 		--------------------
	 * 		|					|
	 * 		--------^---^-------
	 * 				^   ^
	 * 			  top1 	top2
	 * 
	 * Start two stacks from two extreme corners of A[]
	 *  - stack1 starts from the leftmost element (i.e. the first element in stack1 is pushed at index 0)
	 *  - stack2 starts from the rightmost corner (i.e. the first element in stack2 is pushed at index (n-1))
	 * 
	 * Both stacks grow (or shrink) in opposite direction.
	 * 
	 * To check for overflow, all we need to check is for space between top elements of both stacks.
	 * 
	 */
}
