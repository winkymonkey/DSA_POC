package org.example.dsa.oo_linkedlist.a_SLL.b_search;

/**
 * ***************************************************************************************
 * Find a triplet from 3 SLLs with sum equal to a given number
 * ***************************************************************************************
 * Input:  	12->6->29	23->5->8	90->20->59		X=101
 * Output: 	6,5,90
 * 
 * ***************************************************************************************
 */

public class B05_find_tripletSum_equalToGivenNumber {
	/*
	 * --------------------
	 * ---NAIVE SOLUTION---
	 * --------------------
	 * 3 nested loops.
	 * each loop will search in each list
	 * TIME -- O(n^3)
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * Keep list1 as it is				//12->6->29
	 * Sort list2 in ascending order	//5->8->23
	 * Sort list3 in descending order	//90->59->20
	 * 
	 * Now for each element in list1, we will try to find the pair (from list2 & list3) which sums up to X.
	 * 
	 * 
	 * Node a = list1.head;
	 * while (list1 != null) {
	 * 	  Node b = list2.head;
	 * 	  Node c = list3.head;
	 *    
	 * 	  while (b!=null && c!=null) {
	 * 	     if (a.data + b.data + c.data == X) {
	 * 	        return true;
	 * 	     }
	 * 	     else if (a.data + b.data + c.data < X) {
	 * 	        b = b.next;
	 * 	     }
	 *       else {
	 * 	        c = c.next
	 * 	     }
	 *    }
	 * 	  a = a.next;
	 * }
	 * return false;
	 * 
	 */
}
