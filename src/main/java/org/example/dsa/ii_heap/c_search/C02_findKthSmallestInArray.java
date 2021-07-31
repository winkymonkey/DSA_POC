package org.example.dsa.ii_heap.c_search;

/**
 * ***************************************************************************************
 * Find K'th Smallest Element in Unsorted Array
 * ***************************************************************************************
 */

public class C02_findKthSmallestInArray {
	/*
	 * Build Min Heap (root is the MIN) 							//O(n) time
	 * 
	 * Now call deleteMin() K times 								//K * O(Logn) time
	 * After K operations K'th smallest element will become root
	 * 
	 * So total time
	 * = O(n) + O(KLogn)
	 * 
	 */
}
