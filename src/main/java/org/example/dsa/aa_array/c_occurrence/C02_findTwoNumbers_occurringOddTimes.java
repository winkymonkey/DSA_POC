package org.example.dsa.aa_array.c_occurrence;

/**
 * ***************************************************************************************
 * Find two numbers that are occurring odd number of times
 * ***************************************************************************************
 * Input:  {12, 23, 34, 12, 12, 23, 12, 45}
 * Output: 34 and 45
 * 
 * Input:  {10, 20}
 * Output: 10 and 20
 * 
 * ***************************************************************************************
 */

public class C02_findTwoNumbers_occurringOddTimes {
	/*
	 * -----------------------
	 * ---USING BITWISE XOR---
	 * -----------------------
	 * X = XOR of all elements
	 *   = P ^ Q				//all paired numbers results to 0... Only alone numbers will remain
	 * 
	 * Now find out the 'rightmost-set-bit' in X 							//set_bit_num = X & ~(X-1) 
	 *   -- P ^ Q can produce 1 in a bit position, only if P and Q contain different bits at that position
	 * 
	 * Now divide all numbers in array in two groups in such a way that
	 *   -- groupA contains the numbers whose corresponding bit is 1		//A[i] & set_bit_num > 0
	 *   -- groupB contains the numbers whose corresponding bit is 0		//A[i] & set_bit_num < 0
	 *   
	 *   -- take XOR of all numbers in groupA --> it is P		//XOR of all elements (except P) in groupA result to 0 
	 *   -- take XOR of all numbers in groupB --> it is Q		//XOR of all elements (except Q) in groupB result to 0
	 * 
	 * --------------
	 * X = 0
	 * for (i=0 to n-1) {
	 *    X = X ^ A[i]
	 * }
	 * set_bit_num = X & ~(X-1)
	 * 
	 * for (i=0 to n-1) {
	 *    if ((A[i] & set_bit_num) > 0)
	 *       P = P ^ A[i];
	 *    else
	 *       Q = Q ^ A[i]
	 * }
	 * print P and Q
	 * 
	 */
}
