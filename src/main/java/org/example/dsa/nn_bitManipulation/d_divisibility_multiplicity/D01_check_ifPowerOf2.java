package org.example.dsa.nn_bitManipulation.d_divisibility_multiplicity;

/**
 * ***************************************************************************************
 * Program to find whether a no is power of two
 * ***************************************************************************************
 * Input:  24
 * Output: yes
 * 
 * Input:  37
 * Output: no
 * 
 * ***************************************************************************************
 */

public class D01_check_ifPowerOf2 {
	/*
	 * For all number which are power of 2, we can see the below pattern
	 *   2  = 10
	 *   4  = 100
	 *   8  = 1000
	 *   16 = 10000
	 *   32 = 100000
	 * So, if we left shift the number by 1, it should become all zero
	 * 
	 * 
	 * --------------
	 * if ((n << 1) == 0)
	 *    print yes
	 * else
	 *    print no
	 * 
	 */
}
