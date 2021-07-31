package org.example.dsa.aa_array.n_binarysearch;

/**
 * ***************************************************************************************
 * Roti Parata Problem
 * ***************************************************************************************
 * IEEE is having its AGM next week and the president wants to serve cheese prata after the meeting.
 * The subcommittee members are asked to go to food connection and get P(P<=1000) pratas packed for the function.
 * The stall has L cooks(L<=50) and each cook has a rank R(1<=R<=8).
 * A cook with a rank R can cook 1 prata in the first R minutes 1 more prata in the next 2R minutes, 1 more prata in 3R minutes and so on
 * (he can only cook a complete prata, no partial prata possible)
 * The webmaster wants to know the minimum time to get the order done.
 * Please write a program to help him out.
 * ***************************************************************************************
 * Input:	{1, 2, 3, 4}		P = 10
 * Output:	12								//for 10 prata, min time is 12
 * 
 * Input:	{1}					P = 8
 * Output:	8								//for 8 prata, min time is 8
 * 
 * ***************************************************************************************
 */

public class P04_RotiParataProblem {
	/*
	 * Ranking = {1, 2, 3, 4}
	 * 
	 * We can search the optimal time in the time scale
	 * where lower bound becomes 0 and higher bound becomes 1e9
	 * If they can make more pratas than desired, then we update `high=mid-1`  
	 * If they can't make enough pratas as desired, then we update `low=mid+1`
	 * 
	 * ------------------------------
	 * Initially low=0, high=20 (e.g. check how much pratas they can make in 20 time)
	 * 		Rank-1: 1m+2m+3m+4m+5m => 5 prata
	 * 		Rank-2: 2m+4m+6m+8m	   => 4 prata
	 * 		Rank-3: 3m+6m+9m       => 3 prata
	 * 		Rank-4: 4m+8m	       => 2 prata		=> total 14 pratas
	 * 
	 * So in the given time, they can make 14 pratas which is more than expectations.
	 * 
	 * So let us search for optimal time in the range of 0 to 10
	 * 
	 * ------------------------------
	 * Now low=0, high=10 (e.g. check how much pratas they can make in 10 time)
	 * 		Rank-1: 1m+2m+3m+4m => 4 prata
	 * 		Rank-2: 2m+4m	    => 2 prata
	 * 		Rank-3: 3m+6m       => 2 prata
	 * 		Rank-4: 4m	        => 1 prata		=> total 9 pratas
	 * 
	 * So in the given time, they can make 9 pratas which is below than expectations.
	 * 
	 * So let us search for optimal time in the range of 0 to 10
	 * 
	 * ------------------------------
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4};
		int required = 10;
		findOptimalTime(A, required);
	}
	
	
	private static void findOptimalTime(int A[], int required) {
		int start = 0;
		int end = 1000000000;
		int ans = 0;
		
		while (start <= end) {
			int mid = start + (end-start)/2;
			if (isPossible(A, required, mid)) {
				ans = mid;
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		System.out.println(ans);
	}
	
	
	private static boolean isPossible(int A[], int required, int mid) {
		int time = 0;
		int prata = 0;
		for (int rank=0; rank<A.length; rank++) {
			time = A[rank];
			int j = 2;
			while (time <= mid) {
				prata++;
				time = time + (A[rank]*j);
				j++;
			}
			if (prata >= required)
				return true;
		}
		return false;
	}
		
}
