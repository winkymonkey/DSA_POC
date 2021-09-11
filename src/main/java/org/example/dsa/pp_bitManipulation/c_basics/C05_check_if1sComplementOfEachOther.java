package org.example.dsa.pp_bitManipulation.c_basics;

/**
 * ***************************************************************************************
 * Check if one of the numbers is 1s complement of the other
 * ***************************************************************************************
 * Input:  a=10		(1010)
 * 	       b=5		(0101)
 * Output: yes
 * 
 * Input:  a=1		(0001)
 *         b=14		(1110)
 * Output: yes
 * 
 * ***************************************************************************************
 */

public class C05_check_if1sComplementOfEachOther {
	/*
	 * X = a ^ b					//1010 ^ 0101 = 1111
	 * 
	 * if (X & (X+1)  == 0)			//01111 & 10000 = 00000
	 *    print yes
	 * else
	 *    print no
	 * 
	 */
}
