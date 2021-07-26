package org.example.dsa.cc_number;

/**
 * ***************************************************************************************
 * Compute the square root of a non-negative integer (truncate decimal digits)
 *    - the decimal digits should be truncated and only the integer part to be returned
 * ***************************************************************************************
 * Input:  4
 * Output: 2
 * 
 * Input:  8
 * Output: 2
 * 
 * ***************************************************************************************
 */

public class A01_computeSquareRoot {
	/*
	 * ------------------------
	 * ---O(n) TIME SOLUTION---
	 * ------------------------
	 * Take an integer 'i' and keep on incrementing it by 1
	 * in each iteration,
	 * if 'i*i' becomes equals to X ------------ return i
	 * else if 'i*i' becomes greater than X ---- return i-1
	 * 
	 * NOTE:
	 * 1. There is no need to run the loop till 'X'.
	 *    rather traverse till 'X/2' because square-root of a X cannot be greater than 'X/2'.
	 *  
	 * 2. If 'i' is integer, 'i*i' becomes negative as soon as it overflows integer limit.
	 *    so instead of doing 'i*i==X', do the same as 'X/i == i'
	 * 
	 * 3. Instead of doing 'X/2', do the same as 'X>>1'
	 * 
	 * 
	 * ---------
	 * public int mySqrt(int X) {
	 *    if (X == 0 || X == 1)
	 *       return X;
	 *    
	 *    for (int i=1; i<=X/2; i++) {
	 *       if (X/i == i)
	 *          return i;
	 *       
	 *       else if (X/i < i)
	 *          return i-1;
	 *    }
	 *    return 1;					//when X=2 and X=3
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ---O(Logn) TIME SOLUTION---
	 * ---------------------------
	 * We can use the property -- 'natural numbers are already sorted'
	 * So instead of traversing continuously from 'i=0' to 'i=X/2', we can apply binary search in the range [0,X/2]
	 * 
	 * 
	 * -------------
	 * public int mySqrt(int X) {
	 *    if (X == 0 || X == 1)
	 *       return X;
	 *    
	 *    int start = 0;
	 *    int end = X/2;
	 *    
	 *    while (start < end) {
	 *       int mid = (start + (end - start)/2);
	 *       
	 *       if (X/mid == mid)
	 *          return mid;
	 *       
	 *       else if (X/mid > mid)
	 *          start = mid + 1;
	 *       
	 *       else
	 *          end = mid - 1;
	 *    }
	 *    return start;
	 * }
	 * 
	 */
}
