package org.example.dsa.gg_number;

/**
 * ***************************************************************************************
 * Find the nth root of an integer (till 5th decimal places)
 * ***************************************************************************************
 */

public class A02_nthRoot {
	/*
	 * --------------------
	 * n-th root of number X lies in the range [1 to X]
	 * So we may opt for linearly searching for desired value of "i" in the search space.
	 * But as this search space is monotonically increasing, we can easily apply binary search.
	 * 
	 * 
	 * public int nthRoot(int X, int n) {
	 *    if (X == 0 || X == 1)
	 *       return X;
	 *    
	 *    double low = 1;
	 *    double high = m;
	 *    double delta = 1e-6;           // as we need to calculate upto 5th decimal places
	 *    
	 *    while (high-low > delta) {
	 *       double mid = (start + (end-start)/2);
	 *       if (multiply(mid, n) < m) {
	 *          low = mid;
	 *       }
	 *       else {
	 *          high = mid;
	 *       }
	 *    }
	 *    return low;
	 * }
	 * 
	 * --------------------
	 */
}
