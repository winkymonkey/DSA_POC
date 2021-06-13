package org.example.dsa.dd_linkedlist.a_SLL.z_misc;

/**
 * *****************************************************************************
 * Clone a linked list with next and random pointer | Set 1
 * *****************************************************************************
 * You are given a Double Link List with one pointer of each node pointing to the next node just like in a single link list.
 * The second pointer however CAN point to any node in the list and not just the previous node.
 * Now write a program in O(n) time to duplicate this list. That is, write a program which will create a copy of this list.
 * 
 * *****************************************************************************
 * 
 */

public class ZA08_cloneWithNextAndRandomPointer {
	/*
	 * --------------------------------------
	 * ---Method 1 (Uses O(n) extra space)---
	 * --------------------------------------
	 * https://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/
	 * 
	 * - Create all nodes in copy linked list using next pointers.
	 * 
	 * - Store the node and its next pointer mappings of original linked list.
	 * 
	 * - Change next pointer of all nodes in original linked list to point to the corresponding node in copy linked list.
	 * 
	 * - Change the arbit pointer of all nodes in copy linked list to point to corresponding node in original linked list.
	 * 
	 * - Now construct the arbit pointer in copy linked list as below and restore the next pointer of nodes in the original linked list.
	 * 		copy_list_node->arbit = copy_list_node->arbit->arbit->next;
	 * 
	 * - Restore the next pointers in original linked list from the stored mappings(in step 2).
	 * 		copy_list_node = copy_list_node->next;
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * 
	 * 
	 * ------------------------------------------
	 * ---Method 2 (Uses Constant Extra Space)---
	 * ------------------------------------------
	 * https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/
	 * 
	 * - Create the copy of node 1 and insert it between node 1 & node 2 in original Linked List
	 *   create the copy of 2 and insert it between 2 & 3.
	 *   continue in this fashion, add the copy of N after the Nth node
	 * 
	 * - Now copy the arbitrary link in this fashion
	 * 		original->next->arbitrary = original->arbitrary->next;
	 * 
	 *   this works because original->next is nothing but copy of original
	 * 
	 * - Now restore the original and copy linked lists in this fashion in a single loop.
	 * 		original->next = original->next->next;
	 *      copy->next = copy->next->next;
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 */
}
