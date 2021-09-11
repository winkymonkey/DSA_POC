package org.example.dsa.nn_number;

/**
 * ***************************************************************************************
 * Find the square root of an integer (truncate decimal digits)
 * ***************************************************************************************
 * Input:  4
 * Output: 2
 * 
 * Input:  8
 * Output: 2
 * 
 * ***************************************************************************************
 */

public class A01_squareRoot {
	/*
	 * ------------------------
	 * ---O(n) TIME SOLUTION---
	 * ------------------------
	 * For (i=1 to X)
	 * 	  if (i*i == X)
	 * 	     return i
	 * 	  else if (i*i > X)
	 * 	     return i-1
	 * 
	 * 
	 * NOTE-1: Instead of looping till X, traverse till X/2 because square-root of a X cannot be greater than 'X/2'.
	 * NOTE-2: Choose i as long
	 * NOTE-3: If you choose i as integer, then for a big value of i the value of i*i can cause overflow. Hence instead of checking 'i*i==X' check 'X/i == i'
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
	 *    return 1;					// when X=2 and X=3
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ---O(Logn) TIME SOLUTION---
	 * ---------------------------
	 * Square root of a number X lies in the range [1 to X/2]
	 * So we may opt for linearly searching for desired value of "i" in the search space.
	 * But as this search space is monotonically increasing, we can easily apply binary search.
	 * 
	 * 
	 * ---------
	 * public int mySqrt(int X) {
	 *    if (X == 0 || X == 1)
	 *       return X;
	 *    
	 *    double start = 0;
	 *    double end = X/2;
	 *    
	 *    while (start < end) {
	 *       double mid = (start + (end-start)/2);
	 *       
	 *       if (X/mid == mid) {
	 *          return mid;
	 *       }
	 *       else if (X/mid > mid) {
	 *          start = mid + 1;
	 *       }
	 *       else {
	 *          end = mid - 1;
	 *       }
	 *    }
	 *    return start;
	 * }
	 * 
	 */
}
