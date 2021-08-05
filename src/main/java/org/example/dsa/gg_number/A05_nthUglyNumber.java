package org.example.dsa.gg_number;

/**
 * ***************************************************************************************
 * Find n'th Ugly Number (i.e. whose only prime factors are 2, 3 or 5)
 *    - first 11 ugly numbers. 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, ...
 *    - by convention, 1 is included.
 * ***************************************************************************************
 * Input  : n = 7
 * Output : 8
 * 
 * Input  : n = 10
 * Output : 12
 * 
 * Input  : n = 15
 * Output : 24
 * 
 * Input  : n = 150
 * Output : 5832
 * 
 * ***************************************************************************************
 */

public class A05_nthUglyNumber {
	/*
	 * As every number can only be divided by 2, 3, 5 
	 * we can look at the sequence is to split the sequence to three groups as below:
	 * 		1×2, 2×2, 3×2, 4×2, 5×2, ...
	 * 		1×3, 2×3, 3×3, 4×3, 5×3, ...
	 * 		1×5, 2×5, 3×5, 4×5, 5×5, ...
	 * 
	 * We can find that every subsequence is the ugly-sequence by multiplying (1, 2, 3, 4, 5, ...) to {2, 3, 5}
	 * Then we use 3-way merge method to get every ugly number from the three subsequence.
	 * Every step we choose the smallest one, and move one step after.
	 * 
	 * 
	 * 
	 * -----------
	 * UGLY[] = new int[n]
	 * UGLY[0] = 1			//Initialize first ugly number
	 * 
	 * i2 = i3 = i5 = 0
	 * 
	 * mulitple_of_2 = 2
	 * mulitple_of_3 = 3
	 * mulitple_of_5 = 5
	 * 
	 * for (i = 1; i < 150; i++) {
	 *    next_ugly_no = min(mulitple_of_2, mulitple_of_3, mulitple_of_5)
	 *    
	 *    UGLY[i] = next_ugly_no
	 *    
	 *    if (next_ugly_no == mulitple_of_2)
	 *       i2++
	 *       mulitple_of_2 = UGLY[i2] * 2
	 *    
	 *    if (next_ugly_no == mulitple_of_3)
	 *       i3++
	 *       mulitple_of_3 = UGLY[i3] * 3
	 *    
	 *    if (next_ugly_no == mulitple_of_5)
	 *       i5++
	 *       mulitple_of_5 = UGLY[i5] * 5
	 * }
	 * 
	 * return next_ugly_no
	 * 
	 */
}
