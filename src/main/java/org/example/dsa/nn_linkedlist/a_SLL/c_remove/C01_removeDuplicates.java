package org.example.dsa.nn_linkedlist.a_SLL.c_remove;

/**
 * ***************************************************************************************
 * Remove duplicates from a SLL
 * ***************************************************************************************
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
