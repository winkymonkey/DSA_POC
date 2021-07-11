package org.example.dsa.cc_number;

/**
 * *****************************************************************************
 * Given a non-negative integer c, decide whether there're two integers a and b such that a^2 + b^2 = c
 * *****************************************************************************
 * Input:  c = 5
 * Output: true		1*1 + 2*2 = 5
 * 
 * Input:  c = 3
 * Output: false
 * 
 * Input:  c = 4
 * Output: true		0*0 + 2*2 = 4
 * 
 * Input:  c = 2
 * Output: true		1*1 + 1*1 = 2
 * 
 * Input:  c = 1
 * Output: true		0*0 + 1*1 = 2
 * 
 * *****************************************************************************
 */

public class A03_sumOfSquareNumbers {
	/*
	 * ------------------------
	 * ---USE SLIDING WINDOW---
	 * ------------------------
	 * public boolean judgeSquareSum(int c) {
	 *    l = 0
	 *    r = (int)Math.sqrt(c)			//when a^2 + b^2 = c then the b cannot be greater than (sqrt(c))
	 *    while (l < r) {
	 *       if (l*l + r*r == c)
	 *          return true;
	 *       
	 *       else if (l*l + r*r < c)
	 *          l++;
	 *       
	 *       else if (l*l + r*r > c)
	 *          r--;
	 *       
	 *    }
	 *    return false;
	 * }
	 * 
	 */
}
