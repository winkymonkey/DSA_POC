package org.example.dsa.aa_array.n_binarysearch;

/**
 * ***************************************************************************************
 * Aggressive cows
 * ***************************************************************************************
 * Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls.
 * The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).
 * 
 * His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall.
 * To prevent the cows from hurting each other, 
 * John wants to assign the cows to the stalls such that the minimum distance between any two of them is as large as possible.
 * What is the largest minimum distance?  
 * 
 * ***************************************************************************************
 * Input:	Barn = 17		Stalls(N) = 6 //{1, 5, 8, 11, 13, 16}		Cows(C) = 4
 * 
 * ***************************************************************************************
 */

public class P02_AggresiveCows {
	/*
	 * Our objective is to adjust the cows among stalls in such a way that cows stay at maximum possible distance.
	 * and if we try to further increase the distance between cows, we will fall short of stalls.
	 * 
	 * So without thinking much, we can start by putting all cows in adjacent stalls and check whether we can accommodate all cows in all stalls or not.
	 * If yes, then we can increase their distance further and validate whether we can accommodate all cows in all stalls or not.
	 * We can keep on doing this process unless we fall short of stalls. And whenever we falls short of stalls, we can conclude that is is the optimal answer.
	 * 
	 * But considering the constraints of the number of stalls, linear search cannot be performed.
	 * Hence we need to perform binary search
	 * and the range will be 1 to 1,000,000,000
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = {1, 5, 8, 11, 13, 16};
		int c = 4;
		System.out.println(find(A, c));
	}
	
	
	private static int find(int A[], int c) {	//sorted array
		if (c > A.length)
			return -1;
		
		int start = 0;
		int end = A[A.length-1] - A[0];			//gap between last & 1st
		
		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (isPossible(A, c, mid)) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return end;
	}
	
	
	private static boolean isPossible(int A[], int c, int minDist) {
		int cow = 1;
		int lastPos = A[0];
		
		for (int i=1; i<A.length; i++) {
			if (A[i]-lastPos < minDist)
				continue;
			
			cow++;
			lastPos = A[i];
			if (cow == c) {			//as soon as we see that we have accommodated all cows (doesn't matter if more stalls are left or not), it means it's POSSIBLE
				return true;
			}			
		}
		return false;
	}
	
}
