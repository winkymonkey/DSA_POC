package org.example.dsa.nn_number;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Count number of prime numbers from L to R
 * ***************************************************************************************
 */

public class A09_findPrimesInRange {
	
	public static void main(String[] args) {
		int L = 5;
		int R = 10;
		countPrimes(L, R);
	}
	
	
	private static int prefix[] = new int[100000];		// to store count of primes till "i" (including i)
	
	private static void countPrimes(int L, int R) {
		boolean arr[] = new boolean[100000];			// if "i" is prime --- arr[i] will be TRUE (A[5],A[7],A[11] will be true)
		Arrays.fill(arr, true);
		
		for (int i=2; i*i<100000; i++) {
			if (arr[i] == true) {
				for (int k=i*2; k<100000; k+=i) {
					arr[k] = false;
				}
			}
		}
		
		// If we need to calculate only one range[L,R] then we can simply traverse the array and count the occurrence of TRUE
		// But if we need to calculate the same for different ranges, then it's better to calculate a prefix sum and return each result in O(n) time 
		
		prefix[0] = prefix[1] = 0;
		for (int i=2; i<100000; i++) {
			prefix[i] = prefix[i-1];
			if (arr[i])
				prefix[i]++;
		}
		
		int count = prefix[R] - prefix[L-1];
		System.out.println(count);
	}
	
}
