package org.example.dsa.aa_array.h_merge;

/**
 * ***************************************************************************************
 * Union and Intersection of two sorted arrays
 * ***************************************************************************************
 * Input:  A[] = {1, 3, 4, 5, 7}
 * 		   B[] = {2, 3, 5, 6}
 * 
 * Output: UNION --------- {1, 2, 3, 4, 5, 6, 7}
 * 		   ITERSECTION --- {3, 5}
 * 
 * ***************************************************************************************
 */

public class H04_unionIntersection {
	/*
	 * i = 0;								//to traverse A[]
	 * j = 0;								//to traverse B[]
	 * k1 = 0;								//to traverse UNION[]
	 * k2 = 0;								//to traverse INTER[]
	 * UNION[] = new int[A.length+B.length]		//to store result of union
	 * INTER[] = new int[A.length+B.length]		//to store result of intersection
	 * 
	 * while (i<A.length && j<B.length) {
	 *    if (A[i] < B[j]) {
	 *       UNION[k1++] = A[i++];
	 *    }
	 *    else if (A[i] > B[j]) {
	 *       UNION[k1++] = B[j++];
	 *    }
	 *    else {
	 *       UNION[k1++] = A[i];
	 *       INTER[k2++] = A[i];
	 *       i++;
	 *       j++
	 *    }
	 * }
	 * 
	 * while (i < A.length) {
	 *    UNION[k1++] = A[i++];
	 * }
	 * while (j < B.length) {
	 *    UNION[k1++] = A[j++];
	 * }
	 * 
	 * TIME --- O(m+n)
	 * SPACE -- O(m+n)
	 * 
	 */
}
