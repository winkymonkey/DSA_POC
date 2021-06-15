package org.example.dsa.dd_linkedlist.a_SLL.h_palindrome;

/**
 * ********************************************************************************
 * Check if a Linked List is palindrome
 * ********************************************************************************
 */

public class H01_checkPalindrome_linkedList {
	/*
	 * -----------------
	 * ---USING STACK---
	 * -----------------
	 * Traverse the list
	 * push current node's data field into a stack
	 * Now traverse the list again
	 * if stack top's data field matches with current node's data, pop top from stack and proceed one node in list
	 * otherwise break and print "not palindrome"
	 * 
	 * 
	 * 
	 * ------------
	 * Stack stack = new Stack();
	 * 
	 * void checkPalindrome() {
	 *    Node n = list.head;
	 *    while (n!=null) {
	 *       stack.push(n.data);
	 *       n = n.next;
	 *    }
	 *    
	 *    Node n = list.head;
	 *    while (n!=null) {
	 *       if (stack.top == n.data)
	 *          stack.pop();
	 *          n = n.next;
	 *       else
	 *          print "not palindrome"
	 *          break;
	 *    }
	 * }
	 * 
	 * 
	 * 
	 * 
	 * ------------------------------
	 * ---BY REVERSING SECOND HALF---
	 * ------------------------------
	 * Get the middle of the linked list.
	 * Reverse the second half of the linked list in O(n) time.
	 * Check if the first half and second half are identical.
	 * Construct the original linked list by reversing the second half again.
	 * 
	 */
}
