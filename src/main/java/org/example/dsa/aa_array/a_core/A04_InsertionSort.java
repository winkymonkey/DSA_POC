package org.example.dsa.aa_array.a_core;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Insertion Sort
 * *****************************************************************************
 */

public class A04_InsertionSort {
	
	public static void main(String[] args) {
		int A[] = { 38, 27, 43, 3, 9, 82, 10 };
		//			0   1   2   3  4  5   6
		
		insertionSort(A);
		System.out.println(Arrays.toString(A));
	}
	
	
	/**
	 * Traverse from 1 to end
	 *  - save current element in KEY
	 *  - right shift all greater elements before it to create a slot for KEY		//this works fine because when we start shifting the elements, all elements before the current element is already sorted.
	 *  - place KEY at the slot
	 * Traverse from 2 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * Traverse from 3 to end
	 *  - repeat
	 *  - repeat
	 *  - repeat
	 * .....
	 * .....
	 */
	private static void insertionSort(int A[]) {
		for (int i=1; i<A.length; i++) {		//Traverse from start+1 to end
			int KEY = A[i];
			int k = i-1;
			
			while (k>=0 && A[k]>KEY) {
				A[k+1] = A[k];					//right shift the elements
				k--;
			}
			A[k+1] = KEY;						//place KEY at the slot
		}
	}
	
	
	/**
	 * --------------------------
	 * 		TIME COMPLEXITY
	 * --------------------------
	 * ---------
	 * BEST CASE
	 * ---------
	 * 				(No of comparisons) + (No of movements) = (total)
	 * when i=2, 			1			+		0			=	1
	 * when i=3, 			1			+		0			=	1
	 * when i=4, 			1			+		0			=	1
	 * when i=5, 			1			+		0			=	1
	 * 
	 * Total time taken = 1+1+1+.....(n-1) times
	 * 					= (n-1)
	 * 					= O(n)
	 * 
	 * ----------
	 * WORST CASE
	 * ----------
	 * 				(No of comparisons) + (No of movements) = (total)
	 * when i=2, 			1			+		1			=	2*1
	 * when i=3, 			2			+		2			=	2*2
	 * when i=4, 			3			+		3			=	2*3
	 * when i=5, 			4			+		4			=	2*4
	 * 
	 * Total time taken = 2*(1+2+3+.....(n-1))
	 * 					= 2*(n*(n-1))/2
	 * 					= O(n^2)
	 * 
	 * -----------------------
	 * IMPROVE WORST CASE TIME
	 * -----------------------
	 * For input size of 'n', we do (n-1) comparisons and (n-1) movements for each element
	 * And this comparison & movement logic is applicable for all (n-1) elements of the array
	 * We can try to improve the complexity by changing the comparison and movement logic
	 * 
	 * |-------------------------------------------------------------------|----------------------|
	 * |                                for each element                   |                      |
	 * |-------------------------------------------------------------------|  for (n-1) elements  |
	 * |                            COMPARISON + MOVEMENT  =   TOTAL       |                      |
	 * |--------------------------|----------------------------------------|----------------------|
	 * | REGULAR                  |   O(n)    +   O(n)     = O(n)+O(n)     |  = (n-1) * O(n)      |
	 * |                          |                        = O(n)          |  = O(n^2)            |
	 * |--------------------------|----------------------------------------|----------------------|
	 * | OPTIMIZE COMPARISON      |  O(Logn)  +   O(n)     = O(Logn)+O(n)  |  = (n-1)*O(log n)    |
	 * | using binary search      |                        = O(n)          |  = O(n^2)            |
	 * |--------------------------|----------------------------------------|----------------------|
	 * | OPTIMIZE MOVEMENT        |   O(n)    +   O(1)     = O(n)+O(1)     |  = (n-1)*O(n)        |
	 * | using double linked list |                        = O(n)          |  = O(n^2)            |
	 * |--------------------------|----------------------------------------|----------------------|
	 * So we can see that whatever we do, we are unable to improve complexity of Insertion sort
	 * 
	 * 
	 * --------------------------
	 *      SPACE COMPLEXITY
	 * --------------------------
	 * Whatever be the input size, we only need one extra variable KEY to store the current element
	 * Hence the Space complexity is O(1)
	 * As it doesn't require any extra space, this type of sorting is also called In-Place Sorting
	 * 
	 */
}
