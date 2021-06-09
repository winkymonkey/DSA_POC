package org.example.dsa.aa_array.m_optimize;


public class M03A_minimumJumpsToReachEnd_bruteForce {
	/*
	 * Start from the first element and recursively call for all the elements reachable from first element.
	 * The minimum number of jumps to reach end from first can be calculated using 
	 * 'minimum number of jumps needed to reach end from the elements reachable from first'.
	 * 
	 * For input A[] = { 1, 3, 5, 8, 9 }, the recursion tree is as below
	 *                   0  1  2  3  4
	 * 
	 *                    min(0,4)
	 *                    /
	 *               ___min(1,4)___                 -->take minimum of 'returned value from all function calls' at this level
	 *              /     \        \
	 *         min(2,4)  min(3,4)  min(4,4)         -->take minimum of 'returned value from all function calls' at this level
	 *         /    \         \
	 *    min(3,4) min(4,4)  min(4,4)               -->take minimum of 'returned value from all function calls' at this level
	 *      /
	 * min(4,4)                                     -->take minimum of 'returned value from all function calls' at this level
	 * 
	 * 
	 * TIME --- O(n^n)		//There are 'n' possible ways to move from an element. For n elements it will be n^n.
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String args[]) {
		int A[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5, 3, 5, 2, 4, 7, 3, 3, 5, 7, 4, 4, 1, 2, 4, 2, 3, 6 };
		//			0  1  2  3  4  5  6  7  8  9  10
		
		int low = 0;
		int high = A.length-1;
		System.out.println(minJumps(A, low, high));
	}
	
	
	private static int minJumps(int A[], int low, int high) {
		if (high == low)
			return 0;
		
		if (A[low] == 0)
			return -1;

		int min = Integer.MAX_VALUE;
		for (int i=low+1; i<=high && i<=low+A[low]; i++) {
			int jumps = minJumps(A, i, high);
			min = Math.min(jumps, min);
		}
		return min+1;
	}
	
}
