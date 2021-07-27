package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Design a stack with operations on middle element
 * ***************************************************************************************
 * How to implement a stack which will support following operations in O(1) time complexity?
 * 
 * 1) push() which adds an element to the top of stack --------------- do it in O(1) time
 * 2) pop() which removes an element from top of stack --------------- do it in O(1) time
 * 3) findMiddle() which will return middle element of the stack ----- do it in O(1) time
 * 4) deleteMiddle() which will delete the middle element ------------ do it in O(1) time
 * 
 * ***************************************************************************************
 */

public class A07_designStack_findAndDeleteMiddleElement {
	/*
	 * Which data structure to use to implement the stack?
	 * 
	 * 	- Using Array
	 * 		- we can easily find middle element in array in O(1) time
	 * 		- but if we delete middle we need bring all elements after it one index forward 
	 *  	- so it's NOT feasible to do it in O(1) time
	 * 	
	 *  - Using Single Linked List
	 *  	- we may need to move up middle pointer when we push() and move it down when we pop()
	 *  	- but moving backward is not possible in single linked list
	 * 		- so it's NOT feasible to do it in O(1) time
	 * 
	 * 	- Using Double Linked List
	 *  	- we can delete middle element in O(1) time by maintaining mid pointer
	 *  	- we can move mid pointer in both directions using previous and next pointers
	 * 
	 */
}
