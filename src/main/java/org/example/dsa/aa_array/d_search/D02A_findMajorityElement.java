package org.example.dsa.aa_array.d_search;

/**
 * *****************************************************************************
 * Find Majority element (i.e. an element that appears more than n/2 times in array of size n)
 * *****************************************************************************
 * Input:  {3, 3, 4, 2, 4, 4, 2, 4, 4}
 * Output: 4
 * 
 * Input:  {3, 3, 4, 2, 4, 4, 2, 4}
 * Output: No Majority Element
 * 
 * *****************************************************************************
 */

public class D02A_findMajorityElement {
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * Take one HASHMAP
	 * for (i=0 to n-1) {
	 *    if (HASHMAP.containsKey(A[i])) {
	 *       value = HASHMAP.get(A[i]);
	 *       HASHMAP.put(A[i], value++)
	 * 	  }
	 * 	  else {
	 *       HASHMAP.put(A[i], 0)
	 * 	  }
	 * }
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * -----------------
	 * ---USE SORTING---
	 * -----------------
	 * Sort the array in O(nLogn) time
	 * Now traverse the array and keep track of each repeating element
	 * 
	 * TIME --- O(nLogn)
	 * SPACE -- O(1)
	 * 
	 * 
	 * 
	 * 
	 * ---------------------------------------------
	 * ---USING BST OR SELF BALANCING BINARY TREE---
	 * ---------------------------------------------
	 * Each node will contain one extra field (count) along with existing fields -- key, left-child, right-child
	 * for (i=0 to n-1) {
	 * 	  if (A[i] exists in BST) {
	 *       currentNode.count++
	 * 	  }
	 * 	  else {
	 *       //insert A[i] in proper place in the BST
	 *       if (currentNode.count == n/2) {
	 *          return;
	 *       }
	 * 	  }
	 * }
	 * 
	 * TIME --- O(n^2) [if use BST]		O(nLogn) [if use Self Balancing Binary Tree]
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * ----------------------------
	 * --MOORE'S VOTING ALGORITHM--
	 * ----------------------------
	 * {3, 3, 4, 2, 4, 4, 2, 4, 4}
	 * 
	 * This is a two-step (two traversal) process
	 * -- Step1 -- 
	 *   This step gives the element that MAYBE the majority element in the array.
	 *   If there is a majority element --> this step will definitely return majority element.
	 *   Otherwise --> this step will return candidate for majority element.
	 *  
	 * -- Step2 --
	 *   Check if the element obtained from the above step is majority element.
	 *   This step is necessary as there might be no majority element.
	 * 
	 * ---------
	 * ALGORITHM
	 * ---------
	 * count = 1		//the count of majority element
	 * majIndex = 0		//the majority index
	 *  
	 * Traverse the array from i=1 till end
	 *   - If A[i] is same as A[majIndex] ---> then 'count++', else 'count--'
	 *   - If the count reaches 0 then update 'majIndex = i' and 'count = 1'
	 *   - Finally A[majIndex] is considered as a candidate
	 *  
	 * Again traverse the array from i=0 till end
	 *   - find the occurrences of the candidate
	 *   - If 'occurrence > length/2' then declare the candidate as majority element
	 *   - Else declare that no majority element is found
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
