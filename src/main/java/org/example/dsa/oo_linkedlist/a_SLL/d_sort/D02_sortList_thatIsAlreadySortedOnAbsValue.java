package org.example.dsa.oo_linkedlist.a_SLL.d_sort;

/**
 * ***************************************************************************************
 * Sort a SLL which is already sorted on absolute values
 * ***************************************************************************************
 * Input:  1 -> -2 -> -3 -> 4 -> -5
 * Output: -5 -> -3 -> -2 -> 1 -> 4
 * 
 * Input:  -5 -> -10
 * Output: -10 -> -5
 * 
 * ***************************************************************************************
 */

public class D02_sortList_thatIsAlreadySortedOnAbsValue {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * use merge sort
	 * 
	 * TIME --- O(n logn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * -------------------------
	 * ---EFFICIENT APPROACHE---
	 * -------------------------
	 * An important observation ---- all negative elements are present in reverse order.
	 * 
	 * Traverse the list
	 * if we find a negative element then immediately move it to the front of list (i.e. make it head)
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
