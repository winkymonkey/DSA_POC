package org.example.dsa.dd_linkedlist.b_DLL.z_misc;

/**
 * *****************************************************************************
 * Sort the biotonic Doubly Linked List
 * (i.e, a DLL which is first increasing and then decreasing)
 * (a strictly increasing or a strictly decreasing list is also a biotonic)
 * *****************************************************************************
 * Input:  2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1 
 * Output: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 7 <-> 10 <-> 12 
 * 
 * Input:  20 <-> 17 <-> 14 <-> 8 <-> 3 
 * Output: 3 <-> 8 <-> 14 <-> 17 <-> 20
 * 
 * *****************************************************************************
 */

public class Z01_sort_biotonicDLL {
	/*
	 * Find the first node which is smaller than its previous node.
	 * Let it be CURR
	 * 
	 * if (CURR == null) {
	 * 	  // list is already sorted
	 * }
	 * else {
	 * 	  // split the list into two separate lists
	 * 	  //    1st DLL -- starting from head node till the current's previous node
	 * 	  //    2nd DLL -- starting from current node till the end of the list
	 * 	  // Reverse the 2nd DLL
	 * 	  // Merge the 1st and 2nd sorted DLL 
	 * }
	 * 
	 * --------------------------
	 * In the example ----- 2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1 
	 * CURR --------------- 10
	 * 1st DLL ------------ 2 <-> 5 <-> 7 <-> 12
	 * 2nd DLL ------------ 10 <-> 6 <-> 4 <-> 1
	 * reversed 2nd DLL --- 1 <-> 4 <-> 6 <-> 10
	 * 
	 * merge (2 <-> 5 <-> 7 <-> 12) and (1 <-> 4 <-> 6 <-> 10)
	 * 
	 */
}
