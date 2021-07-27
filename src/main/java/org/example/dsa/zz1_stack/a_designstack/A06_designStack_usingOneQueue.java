package org.example.dsa.zz1_stack.a_designstack;

/**
 * ***************************************************************************************
 * Implement a stack using single queue
 * ***************************************************************************************
 */

public class A06_designStack_usingOneQueue {
	/*
	 * START
	 * Front[]						count=0
	 * 
	 * ----------------------------
	 * PUSH 10
	 * 	- enqueue 10
	 * 
	 * Front[10]					count=1
	 * 
	 * ----------------------------
	 * PUSH 20
	 * 	- enqueue 20
	 * 
	 * Front[10,20]					count=2
	 * 
	 * ----------------------------
	 * PUSH 30
	 * 	- enqueue 30
	 * 
	 * Front[10,20,30]				count=3
	 * 
	 * ----------------------------
	 * PUSH 40
	 * 	- enqueue 40
	 * 
	 * Front[10,20,30,40]			count=4
	 * 
	 * ----------------------------
	 * POP
	 *  - for (count-1) times, dequeue each element and enqueue again
	 *  - then dequeue one element
	 *  - decrement count by 1
	 * 
	 * Front[40,10,20,30]			count=4			(step1)
	 * Front[10,20,30]				count=4			(step2)
	 * Front[10,20,30]				count=3			(step3)
	 * 
	 */
}
