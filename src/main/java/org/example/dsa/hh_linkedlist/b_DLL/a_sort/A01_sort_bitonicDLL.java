package org.example.dsa.hh_linkedlist.b_DLL.a_sort;

/**
 * ***************************************************************************************
 * Sort the bitonic DLL
 * (i.e, a DLL which is first increasing and then decreasing)
 * (a strictly increasing or a strictly decreasing list is also a bitonic)
 * ***************************************************************************************
 * Input:  2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1 
 * Output: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 7 <-> 10 <-> 12 
 * 
 * Input:  20 <-> 17 <-> 14 <-> 8 <-> 3 
 * Output: 3 <-> 8 <-> 14 <-> 17 <-> 20
 * 
 * ***************************************************************************************
 */

public class A01_sort_bitonicDLL {
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
