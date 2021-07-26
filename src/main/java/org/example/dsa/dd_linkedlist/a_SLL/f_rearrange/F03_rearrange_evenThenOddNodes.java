package org.example.dsa.dd_linkedlist.a_SLL.f_rearrange;

/**
 * ***************************************************************************************
 * Segregate even and odd nodes in a SLL
 * ***************************************************************************************
 * Given a SLL of integers, write a function to modify the linked list 
 * such that all even numbers appear before all the odd numbers in the modified linked list
 * 
 * ***************************************************************************************
 * Input:  17 -> 15 -> 8 -> 12 -> 10 -> 5 -> 4 -> 1 -> 7 -> 6 -> NULL
 * Output: 8 -> 12 -> 10 -> 4 -> 6 -> 17 -> 15 -> 5 -> 1 -> 7 -> NULL
 * 
 * ***************************************************************************************
 */

public class F03_rearrange_evenThenOddNodes {
	/*
	 * 	Step-by-step
	 * 17->15->8->12->10->5->4->1->7->6->NULL
	 * 17->15  						8->12->10->5->4->1->7->6->NULL
	 * 17->15->5->  				8->12->10->4->1->7->6->NULL
	 * 17->15->5->  				8->12->10->4->1->7->6->NULL
	 * 17->15->5->1->  				8->12->10->4->7->6->NULL
	 * 17->15->5->1->7->  			8->12->10->4->6->NULL
	 * 8->12->10->4->6->17->15->5->1->7->NULL
	 * 
	 * OR
	 * 
	 * Step-by-step
	 * 17->15->8->12->10->5->4->1->7->6->NULL
	 * 17->15->12->10->5->4->1->7->6->NULL    8->NULL
	 * 17->15->10->5->4->1->7->6->NULL        8->12->NULL
	 * 17->15->5->4->1->7->6->NULL            8->12->10->NULL
	 * 17->15->5->1->7->6->NULL               8->12->10->4->NULL
	 * 17->15->5->1->7->NULL                  8->12->10->4->6->NULL
	 * 8->12->10->4->6->17->15->5->1->7->
	 * 
	 */
}
