package org.example.dsa.nn_bitManipulation.c_basics;

/**
 * *****************************************************************************
 * Detect if two integers have opposite signs
 * *****************************************************************************
 * Input:  -1, 100
 * Output: true
 * 
 * Input:  -100, -200
 * Output: false
 * 
 * *****************************************************************************
 */

public class C02_check_ifOppositeSigns {
	/*
	 * For positive numbers:  sign bit is 0		(e.g.  100 = 00000000000000000000000001100100)
	 * For negative numbers:  sign bit is 1		(e.g. -100 = 11111111111111111111111110011100)
	 * 
	 * So if the numbers have opposite signs, X^Y will also have sign bit as 1
	 * Hence X^Y is also negative
	 * 
	 * 
	 * ----------------
	 * if (X^Y < 0)
	 *    opposite sign
	 * else
	 *    same sign
	 * 
	 */
}
