package org.example.dsa.pp_bitManipulation.d_divisibility_multiplicity;

/**
 * ***************************************************************************************
 * Write an Efficient Method to Check if a Number is Multiple of 3
 * ***************************************************************************************
 * Input:  39	(100111)
 * Output: yes
 * 
 * Input:  23	(10111)
 * Output: no
 * 
 * ***************************************************************************************
 */

public class D03_check_ifMultipleOf3 {
	/*
	 * X = count of all set bits at odd positions = 3
	 * Y = count of all set bits at even positions = 1
	 * If (X-Y) is a multiple of 3 then the number is also a multiple of 3
	 * 
	 * 
	 * ---------------
	 * if (n < 0)  n=-n
	 * if (n == 0) return 1
	 * if (n == 1) return 0
	 * 
	 * odd_count = 0;
	 * even_count = 0;
	 * 
	 * while (n!=0) {
	 * 	  if (n & 1 != 0)		//If odd place's bit is set
	 * 	     odd_count++;
	 * 
	 * 	  if (n & 2 != 0)		//If even place's bit is set
	 * 	     even_count++;
	 * 	  
	 *    n = n >> 2;			//rightmost two bits are already checked, so shift 2 places
	 * }
	 * 
	 */
}
