package org.example.dsa.gg_number;

/**
 * ***************************************************************************************
 * Find the smallest number whose factorial contains at least n trailing zeroes.
 * ***************************************************************************************
 * Input:	n=1
 * Output:	5			// 5! contains 1 zeros
 * 
 * Input:	n=6
 * Output:	25			// 25! contains 6 zeros
 * 
 * ***************************************************************************************
 */

public class A07_smallestNumberFactorialHavingZeros {
	/*
	 * We already know that the number of zeroes is equal to number of 5’s in prime factors of x!
	 * 
	 * The count of trailing 0s in n!
	 *  = Count of 5s in prime factors of n!
	 *  = floor(n/5) + floor(n/25) + floor(n/125) + ........
	 * 
	 * Now if we observe prime factors of a few numbers:
	 * 		All numbers from 5! to 9! ---- contains one 5s ------ so 1 trailing 0s
	 * 		All numbers from 10! to 14! -- contains two 5s ------ so 2 trailing 0s
	 * 		All numbers from 15! to 19! -- contains three 5s ---- so 3 trailing 0s
	 * 		All numbers from 20! to 24! -- contains four 5s ----- so 4 trailing 0s 
	 * 		All numbers from 25! to 29! -- contains six 5s ------ so 6 trailing 0s
	 * 
	 * We can notice that, the maximum number whose factorial contain `n` trailing zeroes is 5*n.
	 * So, to find minimum number whose factorial contains n trailing zeroes, use binary search on range from 0 to 5*n.
	 * 
	 */
	
	public static void main(String[] args) {
		int count = 4;
		System.out.println(findNum(count));
	}
	
	private static int findNum(int count) {
		if (count == 1)
			return 5;

		int low = 0;
		int high = 5 * count;

		while (low < high) {
			int mid = (low + high) >> 1;
			if (check(mid, count))			// Check if mid's factorial contains n trailing zeroes.
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
	
	private static boolean check(int p, int n) {
		int temp = p, count = 0, f = 5;
		while (f <= temp) {
			count += temp / f;
			f = f * 5;
		}
		return (count >= n);
	}
	
}
