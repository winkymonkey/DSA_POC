package org.example.dsa.aa_array.e_arrangement;

/**
 * ***************************************************************************************
 * Find the minimum swaps required to bring all elements <= K together
 *   - it is not asked to bring all such elements at the beginning of the array.
 *   - those elements can be brought together anywhere within the array (i.e. start/middle/end/anywhere)
 * ***************************************************************************************
 * Input:  {2, 1, 5, 6, 3}				K=3
 * Output: 1							//5,3 swapped	{2, 1, 3, 6, 5}
 * 														 <  <  <
 * 
 * Input:  {2, 7, 9, 5, 8, 7, 4}		K=5
 * Output: 2							//2,9 swapped 8,4 swapped	{9, 7, 2, 5, 4, 7, 8}
 * 																	       <  <  <
 * ***************************************************************************************
 */

public class E05_minimumSwapsToBringElementsLessOrEqualsToK {
	/*
	 * --------------------------
	 * ---FIXED SLIDING WINDOW---
	 * --------------------------
	 * Traverse the array and COUNT the number of elements <= 'K'
	 * 
	 * Traverse the array again by maintaining a window of length 'count'
	 *  - in each step, keep track of how many elements in this range are greater than 'K'. Let's call it 'BAD'
	 *  - it is nothing but the number of swaps required for this range
	 *  - so after each step, we must compare the current value of 'BAD' and the minimum of 'BAD' tracked till now
	 * 
	 * 
	 * -------------------------------------
	 * {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7}
	 * number of elements <= K(5) ----> 8 (2, 5, 4, 2, 1, 3, 5, 2)
	 * 
	 * So we want these 8 elements together.
	 * Let us check all windows of size 8 that has least elements > K(5)
	 * 
	 * 
	 * 
	 *  <        <        <  <        <  <  <        <           --- which are less than K(=5)
	 * {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7}
	 *  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17
	 *  |                    |									4 elements > K
	 *     |                    |								5 elements > K
	 *        |                    |							5 elements > K
	 *           |                    |							4 elements > K
	 *              |                    |						4 elements > K
	 *                 |                    |					3 elements > K
	 *                    |                    |				3 elements > K
	 *                       |                    |				4 elements > K
	 *                          |                    |			4 elements > K
	 *                             |                    |		4 elements > K
	 *                                |                    |	4 elements > K
	 * 															
	 * So minimum of all above is --- 3 swaps
	 * -------------------------------------
	 */
	
	
	public static void main(String args[]) {
		int A[] = {2, 7, 9, 5, 8, 7, 4, 2, 6, 7, 1, 3, 5, 6, 9, 2, 6, 7};
		minSwaps(A, 5);
	}
	
	
	private static void minSwaps(int A[], int K) {
		/*
		 * count the elements less than k
		 */
		int count = 0;
	    for (int i=0; i<A.length; i++) 
	    if (A[i] <= K) 
	        count++;
	    
	    /*
	     * count the elements greater then k in first window of size=count
	     */
	    int num_elem_greater_then_k = 0; 
	    for (int i=0; i<count; i++) 
	    	if (A[i] > K) 
	    		num_elem_greater_then_k++;
	    
	    /*
	     * Now we have the sliding window size=count
	     * We slide the window keep track of element going out from left and coming from right
	     */
	    int ans = num_elem_greater_then_k;
	    for (int i=0, j=count; j<A.length; i++, j++) {
	        if (A[i] > K)
	            num_elem_greater_then_k--;
	        
	        if (A[j] > K)
	            num_elem_greater_then_k++;
	        
	        ans = Math.min(ans, num_elem_greater_then_k);
	    }
	    System.out.println(ans);
	}
		
}
