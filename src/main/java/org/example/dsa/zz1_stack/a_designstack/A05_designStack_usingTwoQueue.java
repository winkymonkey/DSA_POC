package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Implement Stack using Queues
 * ***************************************************************************************
 */

public class A05_designStack_usingTwoQueue {
	/*
	 * A stack can be implemented using queues by using 2 queues.
	 * However there are two ways of doing so.
	 * 
	 * 
	 * -------------------------------------
	 * ---BY MAKING PUSH OPERATION COSTLY---
	 * -------------------------------------
	 * PUSH(X)
	 * 	- enqueue to Q2
	 * 	- then dequeue everything from Q1 one by one and enqueue to Q2
	 *  - swap the names of Q1 and Q2
	 * 
	 * POP()
	 * 	- dequeue an item from Q1 and return it
	 * 
	 * 
	 * 
	 * ------------------------------------
	 * ---BY MAKING POP OPERATION COSTLY---
	 * ------------------------------------
	 * PUSH(X)
	 *  - enqueue to Q1
	 * 
	 * POP()
	 * 	- dequeue everything (except the last element) from Q1 one by one and enqueue to Q2
	 *  - dequeue the last item of Q1 and return it
	 *  - swap the names of Q1 and Q2
	 * 
	 */
}
