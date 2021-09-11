package org.example.dsa.jj_binarytree.j_checking;

/**
 * ***************************************************************************************
 * Check if two nodes are cousins in a Binary Tree
 * ***************************************************************************************
 * Cousin Nodes -- if two nodes are at same level and have different parents
 * ***************************************************************************************
 * 
 * 		     1
 *        /      \
 *      2          3
 *    /   \       /  \
 *   4     5     6    7
 *    \   / \   / \   /
 *     8 9  10 11 12 13
 * 
 * isCousin(8,9) = TRUE
 * isCousin(6,7) = FALSE
 * isCousin(8,6) = FALSE
 * 
 * ***************************************************************************************
 */

public class J04_isCousin {
	/*
	 * ------------------
	 * find level of both the nodes & check is they are at same level
	 * if they are at same level, go to next step... otherwise return false...
	 * 
	 * now check if they are siblings or not
	 * if they are not siblings, return true... otherwise return false...
	 * ------------------
	 */
}
