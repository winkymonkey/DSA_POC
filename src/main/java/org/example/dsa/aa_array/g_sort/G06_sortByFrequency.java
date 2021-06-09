package org.example.dsa.aa_array.g_sort;

/**
 * *****************************************************************************
 * Sort an array by frequency
 * *****************************************************************************
 * Input:  {2, 5, 2, 8, 5, 6, 8, 8}
 * Output: {8, 8, 8, 2, 2, 5, 5, 6}
 * 
 * Input:  {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
 * Output: {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 * 
 * *****************************************************************************
 */

public class G06_sortByFrequency {
	/*
	 * -----------------
	 * ---USE SORTING---
	 * -----------------
	 * Input,
	 * A[] = {2, 5, 2, 8, 5, 6, 8, 8}
	 * 
	 * After sorting,
	 * A[] = {2, 2, 5, 5, 6, 8, 8, 8}
	 * 
	 * Now construct a 2D array of 'elements VS their count'
	 * ELEM  COUNT
	 *   2    2
	 *   5    2
	 *   6    1
	 *   8    3
	 * 
	 * Now sort by count
	 * ELEM  COUNT
	 *   8    3
	 *   2    2
	 *   5    2
	 *   6    1
	 * 
	 * Final Array
	 * {8, 8, 8, 2, 2, 5, 5, 6}
	 * 
	 * TIME --- O(nLogn)+O(n)+O(nLogn) = O(nLogn)			[sorting + construct 2D array + sort 2D array]
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------------------------
	 * ---USE SORTING (KEEPING ORDER OF ELEMENTS)---
	 * ---------------------------------------------
	 * The above approach doesn’t ensure the order of elements, if the frequency is the same
	 * To handle this, we should use indexes.
	 * (i.e. if two counts are same then we should first print the element with a lower index).
	 * 
	 * Input,
	 * A[] =    {2, 5, 2, 8, 5, 6, 8, 8}
	 * index     0  1  2  3  4  5  6  7
	 * 
	 * After sorting,
	 * A[] =    {2, 2, 5, 5, 6, 8, 8, 8}
	 * oldIndex  0  2  1  4  5  3  6  7
	 * 
	 * Now construct the 2D array of 'index VS their count'
	 * INDEX  COUNT
	 *   0      2
	 *   1      2
	 *   5      1
	 *   3      3
	 * 
	 * Now sort by count (consider indexes in case of tie)
	 * INDEX  COUNT
	 *   3      3
	 *   0      2
	 *   1      2
	 *   5      1
	 * 
	 * Final Array
	 * {8, 8, 8, 2, 2, 5, 5, 6}
	 * 
	 * TIME --- O(nLogn)+O(n)+O(nLogn) = O(nLogn)			[sorting + construct 2D array + sort 2D array]
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * for each elements in array, store the element in HashMap.
	 * HashMap's key is the 'array element' & value is the 'frequency'.
	 * Sort the HashMap according to values.
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---USE BST & SORTING---
	 * -----------------------
	 * Each Node should look like below
	 * Class Node {
	 * 	  int key;				//store array element 
	 * 	  int original_index;	//store array element's index
	 * 	  int count;			//store array element's frequency
	 * }
	 * 
	 * Insert element in BST. (maintain key, original_index, count)
	 * If an element is already present then do 'count++' of that Node.
	 * Now construct a 2D array to store original_index & count.
	 * Sort the 2D array according to 'count'
	 * 
	 * TIME --- O(Logn)
	 * SPACE -- O(Logn)
	 * 
	 */
}
