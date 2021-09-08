package org.example.dsa.oo_bitManipulation.f_misc;

/**
 * ***************************************************************************************
 * Swap all odd and even bits
 * ***************************************************************************************
 * Input:  23		(00010111)
 * Output: 43		(00101011)
 * 
 * ***************************************************************************************
 */

public class F01_swapAllEvenAndOddBits {
	/*
	 * We can observe that,
	 * 	- we need to right shift (>>) all even bits by 1 so that they become odd bits
	 *  - we need to left shift (<<) all odd bits by 1 so that they become even bits
	 * 
	 * 
	 * even_bits = n & 101010101010....31times
	 * odd bits = n & 010101010101....31times
	 * 
	 * even_bits = even_bits >> 1
	 * odd_bits = odd_bits << 1
	 * 
	 * output = (even_bits | odd_bits)				//Combine even and odd bits
	 * 
	 */
}
