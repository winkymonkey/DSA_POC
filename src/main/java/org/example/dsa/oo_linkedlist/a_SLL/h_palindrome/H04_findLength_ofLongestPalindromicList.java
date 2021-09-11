package org.example.dsa.oo_linkedlist.a_SLL.h_palindrome;

/**
 * ***************************************************************************************
 * Length of longest palindrome list in a SLL using O(1) extra space
 * ***************************************************************************************
 * Input:  2->3->7->3->2->12->24
 * Output: 5						//The longest palindrome list is 2->3->7->3->2
 * 
 * Input:  12->4->4->3->14
 * Output: 2						//The longest palindrome list is 4->4
 * 
 * ***************************************************************************************
 */

public class H04_findLength_ofLongestPalindromicList {
	/*
	 * The idea is based on the linked list reversal where we iterate the list from left and reverse each pointer one by one.
	 * But just after reversing a Node and before moving forward --- it is the place where we need to do our job.
	 * 
	 * 
	 * 
	 * -------------------------
	 * void reverse() {
	 *    Node PREV = null;
	 *    Node CURR = list.head;
	 *    Node NEXT = null;
	 * 
	 *    while (CURR != null) {
	 *       NEXT = CURR.next;
	 *       CURR.next = PREV;
	 *       
	 *       --------------
	 *       *** IT IS THE PLACE WHERE WE NEED TO PERFORM***
	 *       //check for odd length palindrome
	 *       result = Math.max(result, 2*countCommon(PREV, NEXT)+1);
	 *       
	 *       //check for even length palindrome
	 *       result = Math.max(result, 2*countCommon(CURR, NEXT));
	 *       --------------
	 *       
	 *       PREV = CURR;
	 *       CURR = NEXT;
	 *    }
	 * }
	 * 
	 * int countCommon(Node a, Node b) {
	 *    while (a!=null && b!=null) {
	 *       if (a.data == b.data)
	 *          count++
	 *       else
	 *          break;
	 *       a = a.next;
	 *       b = b.next;
	 *    }
	 *    return count;
	 * }
	 * 
	 */
}
