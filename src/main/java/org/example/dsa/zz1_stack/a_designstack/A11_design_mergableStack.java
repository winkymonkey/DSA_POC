package org.example.dsa.zz1_stack.a_designstack;

/**
 * *****************************************************************************
 * How to create mergeable stack
 * *****************************************************************************
 * Design a stack with following operations.
 *  - push(Stack s, x)------------ Adds an item x to stack s
 *  - pop(Stack s)---------------- Removes the top item from stack s
 *  - merge(Stack s1, Stack s2)--- Merge contents of s2 into s1
 * 
 * Time Complexity of all above operations should be O(1).
 * 
 * *****************************************************************************
 */

public class A11_design_mergableStack {
	/*
	 * Which data structure to use to implement the stack?
	 * 
	 * 	- Using Array
	 * 		- here we need to copy all elements from one array to another
	 * 		- so it's not possible to perform the merge() operation in O(1) time
	 * 
	 * 
	 * 	- Using Single Linked List
	 * 		- use two pointers
	 * 		- use pointer-1 for 1st node (used as top)
	 * 		- use pointer-2 for last node (to quickly link both the linked list of s1 and s2)
	 * 
	 */
}
