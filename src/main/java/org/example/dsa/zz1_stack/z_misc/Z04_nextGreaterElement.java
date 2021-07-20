package org.example.dsa.zz1_stack.z_misc;

/**
 * *****************************************************************************
 * Next Greater Element
 * *****************************************************************************
 */

public class Z04_nextGreaterElement {
	/*
	 * 1. Push the first element to stack.
	 * 2. Pick rest of the elements one by one and follow following steps in loop.
	 * 		- Mark the current element as CURRENT.
	 * 		- IF stack is not empty
	 * 				- then pop an element from stack and compare it with CURRENT.
	 * 		- IF CURRENT is greater than the popped element
	 * 				- then CURRENT is the next greater element for the popped one.
	 * 				- keep popping from the stack while the popped element is smaller than CURRENT.
	 * 				- CURRENT becomes the next greater element for all such popped elements.
	 * 		- IF CURRENT is smaller than the popped element
	 * 				- then push the popped element back in stack
	 * 
	 * 3. After the loop in step 2 is over, pop all the elements & print -1 as their next element.
	 * 
	 */
}
