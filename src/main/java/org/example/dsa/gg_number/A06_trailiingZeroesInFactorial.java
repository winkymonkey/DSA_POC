package org.example.dsa.gg_number;

/**
 * ***************************************************************************************
 * Count trailing zeroes in factorial of a number
 * ***************************************************************************************
 * Input:	n=5
 * Output:	1			// Factorial of 5 is 120 which has one trailing 0
 * 
 * Input:	n=20
 * Output:	4			// Factorial of 20 is 2432902008176640000 which has 4 trailing zeroes
 * 
 * Input:	n=100
 * Output:	24
 * 
 * ***************************************************************************************
 */

public class A06_trailiingZeroesInFactorial {
	/*
	 * We can think of calculating the factorial and then counting the trailing zeros
	 * But it is not feasible because for bigger inputs, it can easily cause overflow
	 * Here we can make some important observations
	 * 
	 * ----------------
	 * OBSERVATION - 1
	 * ----------------
	 * Consider prime factors of n! 
	 * A trailing zero is always produced by prime factors 2 & 5
	 * So if we count the number of 5s and 2s in prime factors of n!, our task is done
	 * 
	 * ----------------
	 * OBSERVATION - 2
	 * ----------------
	 * Now if we observe prime factors of a few numbers:
	 * 		5! = 5*(2*2)*3*2*1
	 * 		6! = (2*3)*5*(2*2)*3*2*1
	 * 		7! = 7*(2*3)*5*(2*2)*3*2*1
	 * 		8! = (2*2*2*2)*7*(2*3)*5*(2*2)*3*2*1
	 * 		9! = (3*3)*(2*2*2*2)*7*(2*3)*5*(2*2)*3*2*1
	 * 		10!= (2*5)*(3*3)*(2*2*2*2)*7*(2*3)*5*(2*2)*3*2*1
	 * 		11!= 11*(2*5)*(3*3)*(2*2*2*2)*7*(2*3)*5*(2*2)*3*2*1
	 * 		12!= (3*2*2)*11*(2*5)*(3*3)*(2*2*2*2)*7*(2*3)*5*(2*2)*3*2*1
	 * 
	 * We can observe that the number of 2s are always more than or equal to the number of 5s in prime factors
	 * So if we count 5s in prime factors of n!, our task is done
	 * But how to count the total number of 5s in prime factors of n!?
	 * 		All numbers from 5! to 9! ---- contains one 5s ------ so 1 trailing 0s
	 * 		All numbers from 10! to 14! -- contains two 5s ------ so 2 trailing 0s
	 * 		All numbers from 15! to 19! -- contains three 5s ---- so 3 trailing 0s
	 * 		All numbers from 20! to 24! -- contains four 5s ----- so 4 trailing 0s
	 * 		......
	 * 		......
	 * 
	 * ----------------
	 * OBSERVATION - 3
	 * ----------------
	 * Numbers like 25, 125,..... contribute one extra 5 each.
	 * 
	 * So, the count of trailing 0s in n!
	 *  = Count of 5s in prime factors of n!
	 *  = floor(n/5) + floor(n/25) + floor(n/125) + ........
	 * 
	 */
	
	public static void main(String[] args) {
		int n = 630;
		System.out.println(findTrailingZeros(n));
	}
	
	
	private static int findTrailingZeros(int n) {
		if (n < 0)
			return -1;

		int count = 0;

		for (int i=5; n/i>=1; i*=5) {		// i = 5,25,125,625,.....
			count = count + n/i;			// 630/5 + 630/25 + 630/125 + 630/625.... = 126+25+5+1 = 157
		}
		return count;
	}
	
}
