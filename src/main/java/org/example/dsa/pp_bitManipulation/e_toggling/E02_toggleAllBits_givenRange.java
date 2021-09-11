package org.example.dsa.pp_bitManipulation.e_toggling;

/**
 * ***************************************************************************************
 * Toggle bits in the given range
 * ***************************************************************************************
 * Given a non-negative number N and two values L and R.
 * The problem is to toggle bits from the rightmost L'th bit to the rightmost R'th bit.
 * A toggle operation flips a bit 0 to 1 and a bit 1 to 0. 
 * ***************************************************************************************
 * Input:  n=17, L=2, R=3
 * Output: 23
 * 
 * 
 * 	   17 = 10001
 * index--> 54321
 * 
 * BEFORE TOGGLE: bits in range 2nd to 3rd --> 00 		Number was --> 10001	//17
 * AFTER TOGGLE:  bits in range 2nd to 3rd --> 11		Number is ---> 10111	//23
 * 
 * ***************************************************************************************
 */

public class E02_toggleAllBits_givenRange {
	/*
	 * Produce a SPECIAL number having all bits set in the given rage of L to R
	 * Now do (n ^ SPECIAL)
	 * This will toggle the bits in the range L to R in n.
	 * 
	 * 
	 * --------------------
	 * x = (1 << R) - 1)
	 * y = (1 << (L-1)) - 1)
	 * SPECIAL = x^y
	 * 
	 * n = n ^ SPECIAL
	 * 
	 */
}
