package org.example.dsa.nn_bitManipulation.f_misc;

/**
 * ***************************************************************************************
 * Unique element in an array where all elements occur k times except one
 * ***************************************************************************************
 * Input:  A[] = {6, 2, 5, 2, 2, 6, 6}
 * 		   k = 3
 * Output: 5				//Every element appears 3 times accept 5
 * 
 * Input:  A[] = {2, 2, 2, 10, 2}
 * 		   k = 4
 * Output: 10				//Every element appears 4 times accept 10
 * 
 * ***************************************************************************************
 */

public class F08_findElementWhichOccursOnce_whereAllOtherOccursKtimes {
	/*
	 * A[] = {6, 2, 5, 2, 2, 6, 6}
	 * 
	 * Now let's represent each element in 32 bit format
	 * 
	 * 6 -- 0000000000000000000000000000110
	 * 2 -- 0000000000000000000000000000010
	 * 5 -- 0000000000000000000000000000101
	 * 2 -- 0000000000000000000000000000010
	 * 2 -- 0000000000000000000000000000010
	 * 6 -- 0000000000000000000000000000110
	 * 6 -- 0000000000000000000000000000110
	 * 
	 * Now let's count the set-bits in each index of 32 bit format (as above)
	 * 	--- 0000000000000000000000000000461		-->O/P
	 * 
	 * It means that,
	 * there are 1 set-bit at index=1, 6 set-bits at index=2, 4 set-bits at index=3 in above O/P
	 * 
	 * If we notice carefully we can see that,
	 * if each elements in A[] occur k times,
	 * then the each index of O/P should have a number which is multiple of k
	 * 
	 * So if we calculate the below, it will give us the unique number
	 * (0%k)+(0%k)+(0%k)+....+(0%k)+(4%k)+(6%k)+(1%k) = 5
	 * 
	 */
}
