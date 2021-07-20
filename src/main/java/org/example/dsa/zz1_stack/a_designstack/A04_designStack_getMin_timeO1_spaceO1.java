package org.example.dsa.zz1_stack.a_designstack;

/**
 * *****************************************************************************
 * Design and Implement Special Stack Data Structure
 * *****************************************************************************
 * Design a Data Structure SpecialStack that supports all the stack operations (e.g. push(), pop(), isEmpty(), isFull()) 
 * and an additional operation getMin() which should return minimum element from the SpecialStack.
 * All these operations of SpecialStack must be O(1).
 * To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list etc. 
 * 
 * *****************************************************************************
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
 * *****************************************************************************
 */

public class A04_designStack_getMin_timeO1_spaceO1 {
	/*
	 * -------------------------
	 * ---WITHOUT EXTRA STACK---
	 * -------------------------
	 * We define a variable MIN that stores the current minimum element in the stack.
	 * Now the interesting part is, how to handle the case when minimum element is removed.
	 * To handle this, we can't simply push the element which is asked to be pushed.
	 * Rather we should cleverly push some value from which both the 'minimum element' and 'actual element' can be retrieved.
	 * 
	 * 
	 * 
	 * Push(X)
	 *  - if X >= MIN, insert X
	 *  - if X < MIN, insert (2X - MIN), set MIN=X
	 * 
	 * 
	 * Pop()
	 *  - if TOP >= MIN, pop TOP
	 *  - if TOP < MIN, pop TOP, set MIN=(2MIN - TOP)
	 * 
	 * 
	 * 
	 * ------------
	 * Push(18)						//stack is empty, so insert 18, set MIN=18
	 * 		 18
	 * 		STACK		MIN=18
	 * 
	 * Push(19)						//X(19) >= MIN(18), so insert X(19)
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=18
	 * 
	 * Push(29)						//X(29) >= MIN(18), so insert X(29)
	 * 		 29
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=18
	 * 
	 * Push(15)						//X(15) < MIN(18), so insert (2*15-18)=12, set MIN=15
	 * 		{12}
	 * 		 29
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=15
	 * 
	 * Push(16)						//X(16) >= MIN(15), so insert X(16)
	 * 		 16
	 * 		{12}
	 * 		 29
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=15
	 * 
	 * GetMin()
	 * 		return 15
	 * 
	 * Pop()						//TOP(16) >= MIN(15), pop TOP(16)
	 * 		{12}
	 * 		 29
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=15
	 * 
	 * Pop()						//TOP(12) < MIN(15), pop TOP(16), MIN=(2*15-12)=18
	 * 		 29
	 * 		 19
	 * 		 18
	 * 		STACK		MIN=18
	 * 
	 * GetMin()
	 * 		return 18
	 * 
	 */
}
