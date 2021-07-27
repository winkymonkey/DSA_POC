package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Design and Implement Special Stack Data Structure
 * ***************************************************************************************
 * Design a Data Structure SpecialStack that supports all the stack operations (e.g. push(), pop(), isEmpty(), isFull()) 
 * and an additional operation getMin() which should return minimum element from the SpecialStack.
 * All these operations of SpecialStack must be O(1).
 * To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list etc. 
 * ***************************************************************************************
 * Consider the following SpecialStack
 * 16  --> TOP
 * 15
 * 29
 * 19
 * 18
 * 
 * When getMin() is called it should return 15, which is the minimum element in the current stack.
 * 
 * Now If we do pop two times on stack, the stack becomes
 * 29  --> TOP
 * 19
 * 18
 * 
 * When getMin() is called, it should return 18 which is the minimum in the current stack.
 * 
 * ***************************************************************************************
 */

public class A03_designStack_getMin_timeO1_spaceOn {
	/*
	 * --------------------
	 * ---USE TWO STACKS---
	 * --------------------
	 * Use two stacks: 
	 * 	STACK to store actual stack elements
	 *  STACK_AUX to store minimum values
	 * 
	 * The idea is to do push() & pop() operations in such a way that the top of the STACK_AUX is always the minimum.
	 * 
	 * 
	 * Push(X)
	 *  - push X to the STACK
	 *  - compare X with the top element of the STACK_AUX. Let the top element be Y
	 *  	- if X<Y then push X to STACK_AUX
	 *  	- if Y<X then push Y to STACK_AUX
	 * 
	 * 
	 * Pop()
	 * 	- pop the top element from the STACK_AUX
	 *  - pop the top element from the STACK and return it.
	 * 
	 * 
	 * GetMin()
	 *  - return the top element of the STACK_AUX
	 * 
	 * 
	 * 
	 * ------------
	 * Push(18)
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * Push(19)
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * Push(29)
	 *        29      18
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * Push(15)
	 *        15      15
	 *        29      18
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * Push(16)
	 *        16      15
	 *        15      15
	 *        29      18
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * GetMin()
	 * 		return 15 	//top of STACK_AUX 
	 * 
	 * Pop()
	 *        15      15
	 *        29      18
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * Pop()
	 *        29      18
	 *        19      18
	 *        18      18
	 * 		STACK	STACK_AUX
	 * 
	 * GetMin()
	 * 		return 18	//top of STACK_AUX
	 * 
	 */
}
