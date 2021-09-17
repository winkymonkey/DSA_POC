package org.example.dsa.aa_array.g_nge_nse;

/**
 * ***************************************************************************************
 * Find NSE of NGE of each elements in an array
 * ***************************************************************************************
 * Input:  {5, 1, 9, 2, 5, 1, 7}
 * Output:  2  2 -1  1 -1 -1 -1
 * 
 * ELEM   NGE   NSE
 * 	 5 ->  9 ->  2
 * 	 1 ->  9 ->  2
 * 	 9 -> -1 -> -1
 * 	 2 ->  5 ->  1
 * 	 5 ->  7 -> -1
 * 	 1 ->  7 -> -1
 * 	 7 -> -1 -> -1
 * 
 * ***************************************************************************************
 */

public class G06_findNSEofNGE {
	/*
	 * -------------------
	 * For all elements in the array, find the NGE & store their index in an array NGE[]
	 * 
	 * Now traverse the given array A[] and only if current index exists in the NGE[] array then only go for finding its NSE
	 * 
	 */
}
