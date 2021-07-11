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

public class D02_findMajorityElement {
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
	 *   Check if the element obtained from the above step is really a majority element or not.
	 *   This step is necessary as there might be no majority element.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		//		    0  1  2  3  4  5  6  7  8
		printMajority(A);
	}
	
	
	private static void printMajority(int A[]) {
		int majIndex = 0;
		int count = 1;
		
		for (int i=1; i<A.length; i++) {
			if (A[i] == A[majIndex])
				count++;
			else
				count--;
			
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		int candidate = A[majIndex];
		
		int countMajority = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i] == candidate)
				countMajority++;
		}
		
		if (countMajority > A.length/2)
			System.out.println(candidate);
		else
			System.out.println("No Majority Element");
		
	}
}
