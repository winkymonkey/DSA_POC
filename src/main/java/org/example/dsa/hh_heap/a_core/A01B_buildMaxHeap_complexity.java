package org.example.dsa.hh_heap.a_core;


public class A01B_buildMaxHeap_complexity {
	/*
	 * TIME --- O(n)
	 * SPACE -- O(Logn) 		call stack
	 * 
	 * 
	 * ---------------
	 * TIME COMPLEXITY
	 * ---------------
	 * If we apply 'max_heapify' at any node at height 'h', then in worst case the node need to travel 'h' distance (from root to leaf)
	 * So the time taken is = O(h)
	 * 
	 * 
	 * 
	 * Hence the total Work Done at height 'h' 
	 * = (time taken by max_heapify at height 'h') * (number of nodes at height 'h')
	 *                    n
	 * = O(h) * CEIL(-----------)
	 *                 2^(h+1)
	 * 
	 * 
	 * 
	 * Here the height 'h' can range from 0 to Logn
	 * 
	 * 
	 * 
	 * So total work done can be calculated as below 
	 *                                   n
	 * = SUMMATION OF 	O(h) * CEIL(----------)			//where h ranges from 0 to Logn
	 *                                2^(h+1)
	 * 
	 *                                 n
	 * = SUMMATION OF 	ch * CEIL(-----------)			//where h ranges from 0 to Logn
	 *                              2^(h+1) 
	 * 
	 *    cn                         h
	 * = ---- * SUMMATION OF CEIL(-------)				//where h ranges from 0 to Logn
	 *     2                        2^h
	 * 
	 *     cn                         h
	 * <= ---- * SUMMATION OF CEIL(-------)				//where h ranges from 0 to INF
	 *      2                        2^h
	 * 
	 *    cn
	 * ~ ---- * 2										//by standard proof
	 *    2
	 * 
	 * ~ O(cn)
	 * 
	 * ~ O(n)
	 * 
	 * 
	 */
}
