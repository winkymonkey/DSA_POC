package org.example.dsa.oo_bitManipulation.c_basics;

/**
 * ***************************************************************************************
 * Check if a number is positive, negative or zero using bit operators
 * ***************************************************************************************
 * Input:  30
 * Output: positive
 * 
 * Input:  -20
 * Output: negative
 * 
 * Input:  0
 * Output: zero
 * 
 * ***************************************************************************************
 */

public class C01_check_positiveOrNegative {
	/*
	 * For Positive Numbers:	n>>31==(0)  and -n>>31==(-1)	==>	(n>>31) - (-n>>31) = 1
	 * For negative Numbers:	n>>31==(-1) and -n>>31==(0)		==>	(n>>31) - (-n>>31) = -1
	 * For Zero Numbers:		n>>31==(0)  and -n>>31==(0)		==>	(n>>31) - (-n>>31) = 0
	 * 
	 */
}
