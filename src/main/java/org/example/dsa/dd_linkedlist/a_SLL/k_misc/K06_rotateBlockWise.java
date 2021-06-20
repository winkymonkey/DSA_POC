package org.example.dsa.dd_linkedlist.a_SLL.k_misc;

/**
 * *****************************************************************************
 * Rotate Linked List block wise
 * *****************************************************************************
 * Given a Linked List of length 'n' and block length 'k'.
 * Rotate in circular manner towards right/left each block by a number 'd'.
 * If 'd' is positive rotate towards right else rotate towards left.
 * 
 * *****************************************************************************
 * Input:   1->2->3->4->5->6->7->8->9->NULL		k=3		d=1
 * Output:  3->1->2->6->4->5->9->7->8->NULL
 * 
 * 			//each block is of length k=3			(1,2,3 and 4,5,6 and 7,8,9)
 * 			//each block is rotated right by d=1	(3,1,2 and 6,4,5 and 9,7,8)
 * 
 * 
 * Input:   1->2->3->4->5->6->7->8->9->10->11->12->13->14->15->NULL		k=4		d=-1
 * Output:  2->3->4->1->6->7->8->5->10->11->12->9->14->15->13->NULL
 * 
 * 			//each block is of length k=4			(1,2,3,4 and 5,6,7,8 and 9,10,11,12 and 13,14,15)
 * 			//each block is rotated left by d=1		(2,3,4,1 and 6,7,8,5 and 10,11,12,9 and 14,15,13)
 * 
 * *****************************************************************************
 */

public class K06_rotateBlockWise {
	/*
	 * 
	 */
}
