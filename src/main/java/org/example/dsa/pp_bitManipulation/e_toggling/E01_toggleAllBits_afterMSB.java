package org.example.dsa.pp_bitManipulation.e_toggling;

/**
 * ***************************************************************************************
 * Toggle all bits after most significant bit
 * ***************************************************************************************
 * Given a number, toggle all bits of it after most significant bit including MSB.
 * ***************************************************************************************
 * Input:  10		//1010
 * Output: 5		//0101
 * 
 * Input:  5		//101
 * Output: 2		//010
 * 
 * ***************************************************************************************
 */

public class E01_toggleAllBits_afterMSB {
	/*
	 * We can toggle a bit by doing XOR of it with 1	(1^0=1 and 1^1=0)
	 * 
	 * take X = 1
	 * do X<<1 and do N^X
	 * repeat until it crosses MSB of N
	 * 
	 * 
	 * 
	 * ---------------
	 * X = 1;
	 * while (X <= n) {
	 * 	  n = n^X;
	 * 	  X = X<<1;
	 * }
	 * 
	 */
}
