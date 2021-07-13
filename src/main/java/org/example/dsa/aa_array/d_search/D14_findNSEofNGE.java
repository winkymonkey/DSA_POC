package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find NSE of NGE of each elements in an array
 * *****************************************************************************
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
 * *****************************************************************************
 */

public class D14_findNSEofNGE {
	/*
	 * -------------------
	 * First find the Next Greater element & store their index in an array NGE[]
	 * Now according those index, find the "Next Smaller Element" & store them in an array NSE[]
	 * 
	 */
}
