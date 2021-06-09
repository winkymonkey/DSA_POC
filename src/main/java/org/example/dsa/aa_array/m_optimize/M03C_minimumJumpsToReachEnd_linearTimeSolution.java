package org.example.dsa.aa_array.m_optimize;


public class M03C_minimumJumpsToReachEnd_linearTimeSolution {
	
	public static void main(String[] args) {
		int A[] = new int[] { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5, 3, 5, 2, 4, 7, 3, 3, 5, 7, 4, 4, 1, 2, 4, 2, 3, 6 };
		//					  0  1  2  3  4  5  6  7  8  9  10
		System.out.println(minJumps(A));
	}
	
	private static int minJumps(int A[]) {
		if (A.length <= 1)
			return 0;

		if (A[0] == 0)
			return -1;

		int maxReach = A[0];		//maximal reachable index from current index
		int step = A[0];			//number of steps we can still take to reach 'maxReach'
		int jump = 1;				//number of jumps

		for (int i=1; i<A.length; i++) {
			if (i == A.length-1)
				return jump;

			maxReach = Math.max(maxReach, i + A[i]);		// updating maxReach

			step--;											// we use a step to get to the current index

			if (step == 0) {								// If no further steps left
				jump++;										// Now it's time to jump

				if (i >= maxReach)					// If the current index is grater than the maximum reachable index
					return -1;

				step = maxReach - i;				//re-initialize the steps to the amount of steps to reach maxReach from position i
			}
		}
		return -1;
	}
}
