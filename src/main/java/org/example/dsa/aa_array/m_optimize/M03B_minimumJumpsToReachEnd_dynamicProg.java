package org.example.dsa.aa_array.m_optimize;


public class M03B_minimumJumpsToReachEnd_dynamicProg {
	/*
	 * While observing the execution of the previous brute force method, it can be seen that there are overlapping subproblems.
	 * For example, minJumps(3,4) is invoked twice
	 * After observation, we can also say that this problem has both the properties -- Overlapping subproblems, Optimal substructure
	 * 
	 * So we will now apply Dynamic Programming (memoization aka top-down)
	 * 
	 * TIME --- O(n^2)
	 * SPACE -- O(n)
	 * 
	 */
	
	private static int table[][] = {};
	
	public static void main(String[] args) {
		int A[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5, 3, 5, 2, 4, 7, 3, 3, 5, 7, 4, 4, 1, 2, 4, 2, 3, 6 };
		//			0  1  2  3  4  5  6  7  8  9  10
		
		table = new int[A.length][A.length];
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A.length; j++) {
				table[i][j] = -1;
			}
		}
		
		int n = A.length;
		System.out.println(minJumps(A, 0, n-1));
	}
	
	private static int minJumps(int A[], int low, int high) {
		if (table[low][high] == -1) {			
			if (high == low)
				return 0;
			
			if (A[low] == 0)
				return -1;
	
			int min = Integer.MAX_VALUE;
			for (int i=low+1; i<=high && i<=low+A[low]; i++) {
				int jumps = minJumps(A, i, high);
				table[low][high] = jumps+1;
				min = Math.min(jumps, min);
			}
			return min+1;
		}
		else {
			return table[low][high];
		}
	}
}
