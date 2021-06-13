package org.example.dsa.dd_linkedlist.b_DLL.z_misc;

/**
 * *****************************************************************************
 * Sort the bitonic doubly linked list
 * *****************************************************************************
 * Input:  2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1 
 * Output: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 7 <-> 10 <-> 12 
 * 
 * Input:  20 <-> 17 <-> 14 <-> 8 <-> 3 
 * Output: 3 <-> 8 <-> 14 <-> 17 <-> 20
 * 
 * *****************************************************************************
 */

public class ZA01_sort_bitonicDLL {
	/*
	 * Bitonic -- a DLL which is first increasing and then decreasing.
	 * 
	 * 
	 * Traverse the DLL
	 * Find such an element(current) which is smaller than its previous node.
	 * 
	 * if (current==null)
	 * 	 //list is already sorted
	 * else {
	 * 	 //split the list into two separate lists
	 * 	 //first DLL -- starting from head node till the current�s previous node
	 * 	 //second DLL -- starting from current node till the end of the list
	 * 	 //Reverse the second DLL
	 * 	 //Merge the first and second sorted DLL 
	 * }
	 * 
	 */
}
