package org.example.dsa.pp_bitManipulation.b_basics;

/**
 * ***************************************************************************************
 * Count set bits in a range
 * ***************************************************************************************
 * Given a non-negative number N and two values L and R.
 * The problem is to count set bits from the rightmost L'th bit to the rightmost R'th bit.
 * (NOTE: 1 <= L <= R <= bits in N)
 * ***************************************************************************************
 * Input:  N=79, L=2, R=5
 * Output: 3
 * 
 * 			79 = 1001111
 *           	   ^^^^	---- range 2 to 5	bits in that range --> 0111
 * 
 * ***************************************************************************************
 */

public class B04_count_setBits_inGivenRange {
	/*
	 * If we can produce a special number having all bits set in the given rage of L to R,
	 * then we can do BITWISE-AND operation between 'Given Number' and 'Special Number'
	 * In the resulting number we can count the number of set bits which is our answer.
	 * 
	 *      79 ----> 1001111
	 * special ----> 0011110
	 *              ---------
	 * after AND --> 0001110
	 *                 ^^^^
	 * 
	 * 
	 * ---------------
	 * x = (1 << R) - 1
	 * y = (1 << (L-1)) -1
	 * SPECIAL = x ^ y
	 * 
	 * while (SPECIAL > 0) {
	 *    if ((SPECIAL & 1) == 1)
	 *       count++;
	 * }
	 * 
	 * print count
	 *
	 */
}
