package org.example.dsa.hh_linkedlist.a_SLL.h_palindrome;

/**
 * ***************************************************************************************
 * Check if a SLL is palindrome
 * ***************************************************************************************
 */

public class H01_checkPalindrome_linkedList {
	/*
	 * -----------------
	 * ---USING STACK---
	 * -----------------
	 * Traverse the list.
	 * And keep pushing all nodes in a stack.
	 * 
	 * Traverse the list again.
	 *  - if stack.top == currentNode.data --> pop from stack
	 *  - else STOP IMMEDIATELY as it cannot be a palindrome
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
