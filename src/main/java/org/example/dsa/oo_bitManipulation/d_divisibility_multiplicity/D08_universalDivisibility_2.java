package org.example.dsa.oo_bitManipulation.d_divisibility_multiplicity;

/**
 * ***************************************************************************************
 * Check divisibility in a binary stream
 * ***************************************************************************************
 * Input: 1
 * 	      0
 * 	      1
 * 	      0
 * 	  	  1
 * 	     -1
 * 
 * Output: Press any key other than 0 and 1 to terminate 
 * 	     no
 * 	     no
 * 	     no
 * 	     no
 * 	     yes
 * 
 * ***************************************************************************************
 */

public class D08_universalDivisibility_2 {
	/*
	 * Suppose you have binary number 1
	 * If 0 is appended --- becomes 10 (2 in decimal) --- 2 times of the previous value
	 * If 1 is appended --- becomes 11 (3 in decimal) --- 2 times of the previous value+1
	 * 
	 * 
	 * 
	 * Any number (m) can be written in the form 
	 * 		m = an + r								//a, n, r are integers
	 * 												//r is the remainder
	 * 
	 * So when 'm' is multiplied by any number, so the remainder
	 * Suppose 'm' is multiplied by 'x'
	 * 		 mx = xan + xr
	 * 		(mx)%n = (xan)%n + (xr)%n		//remainder if divided by 'n'
	 * 			   = 0 + (xr)%n				//(xan) is a multiple of n, so divisible by n 
	 * 			   = (xr)%n
	 * 
	 * When a number appended by 0, it means it's multiplied by 2  
	 * So from above derivation we can write
	 * 		r = 2*r % n
	 * 
	 * And when a binary number is appended by 1.
	 * 		r = (2*r + 1) % n;
	 * 
	 * 
	 * 
	 */
}
