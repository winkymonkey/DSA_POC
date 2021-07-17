package org.example.dsa.dd_linkedlist.a_SLL.c_remove;

/**
 * ********************************************************************************
 * Remove duplicates from a Linked List
 * ********************************************************************************
 */

public class C01_removeDuplicates {
	/*
	 * -------------------
	 * ---USING SORTING---
	 * -------------------
	 * sort the list first
	 * 
	 * then traverse the sorted list
	 * if (node.data == node.next.data)
	 * 	  node.next = node.next.next			//remove next node
	 * else
	 * 	  node = node.next;
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * traverse the list
	 * if (hashmap.contains(node.data))
	 *    remove that node from list
	 * else
	 * 	  hashmap.put(node.data, true);
	 * 
	 */
}
