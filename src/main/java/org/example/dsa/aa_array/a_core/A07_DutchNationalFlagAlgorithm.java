package org.example.dsa.aa_array.a_core;

/**
 * *****************************************************************************
 * Sort N objects colored red, white or blue in such a way that 
 * 	 objects of the same color are adjacent, with the colors in the order red, white & blue.
 * The problem is closely related to the partition operation of quick sort.
 * The attribute need not be a 'color',
 * 	 but can be 'greater than the median'/'leading digit is zero'/whatever property you care to choose.
 * 
 * *****************************************************************************
 */
public class A07_DutchNationalFlagAlgorithm {
	/*
	 * ----------------------------
	 * ---TWO COLORS (zero, one)---
	 * ----------------------------
	 * With `0′ and `1′, the array is divided into three sections:
	 * 		A[1.......L-1] are all 0s
	 * 		A[L.......H] are all UNKNOWN
	 * 		A[H+1.....N] are all 1s
	 * 
	 * 
	 * Let us take L=1, H=N
	 * It means that initially the full array is UNKNOWN
	 * 
	 * 
	 * Our objective is to examine the `L′ element and
	 * 	- if `L′ is 0 --> all good, L++
	 *  - if `L′ is 1 --> swap it with `H′, H--
	 * 
	 * 
	 * Thus in each step we are trying to push all 0s to left, all 1s to right
	 * Thus in each step the UNKNOWN section shrinks
	 * 
	 * ---------
	 * L=1, H=N
	 * while (L <= H) {
	 *    if (A[L] == 0)
	 *       L++
	 *    else
	 *       swap A[L], A[H]
	 *       H--
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------------
	 * ---THREE COLORS (zero, one, two)---
	 * -----------------------------------
	 * With `0′, `1′ and `2′, the array is divided into four sections:
	 * 		A[1.......L-1] are all 0s
	 * 		A[L.......M-1] are all 1s
	 * 		A[M.......H] are all UNKNOWN
	 * 		A[H+1.....N] are all 2s
	 * 
	 * 
	 * Let us take L=1, M=1, H=N
	 * It means that initially the full array is UNKNOWN
	 * 
	 * 
	 * Our objective is to examine the `M′ element and
	 * 	- if `M′ is 0 --> swap it with `L′, L++, M++
	 *  - if `M′ is 1 --> all good, M++
	 *  - if `M′ is 2 --> swap it with `H′, H--
	 * 
	 * 
	 * Thus in each step we are trying to push all 0s to left, all 1s to middle, all 2s to right
	 * Thus in each step the UNKNOWN section shrinks
	 * 
	 * ---------
	 * L = 1
	 * M = 1
	 * H = N
	 * while (M <= H) {
	 *    if (A[M] == 0)
	 *       swap A[L], A[M]
	 *       L++
	 *       M++
	 *    if (A[M] == 1)
	 *       M++
	 *    if (A[M] == 2)
	 *       swap A[M], A[H]
	 *       H--
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
