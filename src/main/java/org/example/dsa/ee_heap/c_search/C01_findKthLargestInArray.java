package org.example.dsa.ee_heap.c_search;

/**
 * ***************************************************************************************
 * Find K'th Largest Element in Unsorted Array
 * ***************************************************************************************
 */

public class C01_findKthLargestInArray {
	/*
	 * Build Max Heap (root is the MAX) 							//O(n) time
	 * 
	 * Now call deleteMax() K times 								//K * O(Logn) time
	 * After K operations K'th largest element will become root
	 * 
	 * So total time
	 * = O(n) + O(KLogn)
	 * 
	 */
}
