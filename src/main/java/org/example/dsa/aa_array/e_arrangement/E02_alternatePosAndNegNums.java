package org.example.dsa.aa_array.e_arrangement;

/**
 * ***************************************************************************************
 * Rearrange (alternatively) positive & negative numbers in an array (maintain ordering & no extra space)
 *   - If there are more positive numbers, they appear at the end of the array.
 *   - If there are more negative numbers, they too appear in the end of the array.
 * ***************************************************************************************
 * Input:  { -1, 2, -3, 4, 5, 6, -7, 8, 9 }
 * Output: { 9, -7, 8, -3, 5, -1, 2, 4, 6 }
 * 
 * ***************************************************************************************
 */

public class E02_alternatePosAndNegNums {
	/*
	 * Separate positive and negative numbers
	 * So all negative numbers will be left aligned, All positive numbers will be right aligned
	 * Now start from the 1st negative number and 1st positive number and swap every alternate negative number with next positive number.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * ------------
	 * PIVOT = 0;
	 * k = -1;
	 * for (i=0 to length) {
	 *    if (A[i] < PIVOT) {
	 *       k++;
	 *       swap A[i] and A[k];
	 *    }
	 * }
	 * 
	 * NEG = 0; 		//1st negative number
	 * POS = k+1;		//1st positive number (i.e. 'k' is pointing to the last negative number)
	 * 
	 * while (POS<n and NEG<POS and A[NEG]<0) {
	 *    //swap A[NEG] and A[POS]
	 *    NEG +=2
	 *    POS++
	 * }
	 * 
	 */
}
